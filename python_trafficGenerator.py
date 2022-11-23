import random
import socket
import string
import time
import sys

bufferSize  = 1024
serverAddressPort   = ("127.0.0.1", 7501)


print('this program will generate some test traffic for 2 players on the red ')
print('team as well as 2 players on the green team')
print('')

# recieve data first 
UDPServerSocket = socket.socket(family=socket.AF_INET, type=socket.SOCK_DGRAM)
UDPServerSocket.bind(("127.0.0.1", 7500))
print("UDP server up and listening")
numIds = 0
run = True
while run:
	bytesAddressPair = UDPServerSocket.recvfrom(bufferSize)
	message = bytesAddressPair[0]
	address = bytesAddressPair[1]
	print(message)
	print("hello:")
	bytesAddressPair = UDPServerSocket.recvfrom(bufferSize)
	red1 = bytesAddressPair[0]
	red1 = str(red1, 'utf-8')
	#redd1 = int(red1[0])
	numIds+=1 
	print("red1 = ")
	print( red1)

	bytesAddressPair = UDPServerSocket.recvfrom(bufferSize)
	red2 = bytesAddressPair[0]
	red2 = str(red2, 'utf-8')
	numIds+=1
	print("red2 = ")
	print(red2)

	bytesAddressPair = UDPServerSocket.recvfrom(bufferSize)
	green1 = bytesAddressPair[0]
	green1 = str(green1, 'utf-8')
	numIds+=1 
	print("green1 = ")
	print(green1)

	bytesAddressPair = UDPServerSocket.recvfrom(bufferSize)
	green2 = bytesAddressPair[0]
	green2 = str(green2, 'utf-8')
	numIds+=1 
	print(numIds)
	print("green2 = ")
	print(green2)
	if numIds == 4:
		run = False
		

		

#UDPServerSocket.unbind()

#now send

#red1 = input('Enter id of red player 1 ==> ')
#red2 = input('Enter id of red player 2 ==> ')
#green1 = input('Enter id of green player 1 ==> ')
#green2 = input('Enter id of green player 2 ==> ')
#red1 = sys.argv[1]
#red2 = sys.argv[2]
#green1 = sys.argv[3]
#green2 = sys.argv[4]

print("Now time to send")
#counter = input('How many events do you want ==> ')
counter = 100

# Create datagram socket
UDPClientSocketTransmit = socket.socket(family=socket.AF_INET, type=socket.SOCK_DGRAM)

# counter number of events, random player and order
i = 1
while i < int(counter):
	if random.randint(1,2) == 1:
		redplayer = red1
	else:
		redplayer = red2

	if random.randint(1,2) == 1:
		greenplayer = green1
	else: 
		greenplayer = green2	

	if random.randint(1,2) == 1:
		message = redplayer + ":" + greenplayer
	else:
		message = greenplayer + ":" + redplayer

	print(message)
	i+=1
	UDPClientSocketTransmit.sendto(str.encode(str(message)), serverAddressPort)
	time.sleep(random.randint(1,3))
	
print("program complete")
UDPClientSocketTransmit.sendto(str.encode(str("bye")), serverAddressPort)