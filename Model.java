import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author postgresqltutorial.com
 */
public class Model{

    private final String url = "jdbc:postgresql://ec2-44-207-133-100.compute-1.amazonaws.com:5432/d9gs6fbgajrr5h?sslmode=require";
    private final String user = "kqmxvinhydttmo";
    private final String password = "66b9145075195cf7e932d1c515dc3b91b58bd987ec2649b7512fd58e4591c0d6";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
         }
         catch (ClassNotFoundException e) {
            System.err.println (e);
            System.exit (-1);
         }
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
