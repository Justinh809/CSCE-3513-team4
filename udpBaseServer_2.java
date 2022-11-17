
// This File comes from Jstrother123/photon-main
// Java program to illustrate Server side
// Implementation using DatagramSocket
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udpBaseServer_2 {
    public static void main(String[] args) throws IOException {
        // Step 1 : Create a socket to listen at port 1234

        byte[] receive = new byte[65535];

        DatagramPacket DpReceive = null;

        // set up to send signal first
        DatagramSocket dsInit = new DatagramSocket();
        byte IPAddress[] = { 127, 0, 0, 1 };
        InetAddress address4 = InetAddress.getByAddress(IPAddress);
        System.out.println(address4);
        byte[] buf = null;
        buf = "hello".getBytes();
        System.out.println(buf);

        DatagramPacket DpSend = new DatagramPacket(buf, buf.length, address4, 7500);
        dsInit.send(DpSend);
        buf = "1".getBytes();
        System.out.println(buf);

        DpSend = new DatagramPacket(buf, buf.length, address4, 7500);
        dsInit.send(DpSend);
        buf = "2".getBytes();
        System.out.println(buf);

        DpSend = new DatagramPacket(buf, buf.length, address4, 7500);
        dsInit.send(DpSend);
        buf = "3".getBytes();
        System.out.println(buf);

        DpSend = new DatagramPacket(buf, buf.length, address4, 7500);
        dsInit.send(DpSend);
        buf = "4".getBytes();
        System.out.println(buf);

        DpSend = new DatagramPacket(buf, buf.length, address4, 7500);
        dsInit.send(DpSend);

        System.out.println("sent all id's");
        /*
         * try {
         * 
         * String pythonFileName = "python_trafficGenerator.py";
         * String currentDir = System.getProperty("user.dir");
         * System.out.println(currentDir);
         * int number1 = 1;
         * int number2 = 2;
         * int number3 = 3;
         * int number4 = 4;
         * String pythonEx = "py " + pythonFileName + " " + number1 + " " + number2 +
         * " " + number3 + " " + number4;
         * ProcessBuilder newP = new ProcessBuilder("cmd.exe", "/C", pythonEx);
         * newP.redirectErrorStream(true);
         * Process p = newP.start();
         * 
         * } catch (Exception e) {
         * System.out.println(e);
         * e.printStackTrace();
         * }
         */

        DatagramSocket ds = new DatagramSocket(7501);
        while (true) {

            // Step 2 : create a DatgramPacket to receive the data.
            DpReceive = new DatagramPacket(receive, receive.length);

            // Step 3 : revieve the data in byte buffer.
            ds.receive(DpReceive);

            System.out.println("Client:-" + data(receive));

            // Exit the server if the client sends "bye"
            if (data(receive).toString().equals("bye")) {
                System.out.println("Client sent bye.....EXITING");
                ds.close();
                break;
            }

            // Clear the buffer after every message.
            receive = new byte[65535];
        }
    }

    // A utility method to convert the byte array
    // data into a string representation.
    public static StringBuilder data(byte[] a) {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0) {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}