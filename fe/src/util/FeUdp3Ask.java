package util;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FeUdp3Ask
{
	public static String udpAsk(String s,int udpport)
	{

		String receivedAnswer=null;
		DatagramSocket clientSocket=null;
		try
		{
			clientSocket=new DatagramSocket();			
			InetAddress IPAddress=InetAddress.getByName("192.168.192.131");//InetAddress.getByName("hostname");

			while(true)
			{			
			byte[] sendData=new byte[1024];
			byte[] receiveData=new byte[1024];			
			String sentence =s;		
			sendData=sentence.getBytes();			
			DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress,udpport);	

			clientSocket.send(sendPacket);			
			
			System.out.println("error/reboot msg has sent out!");
			
			DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);

			clientSocket.receive(receivePacket);
			
			receivedAnswer=new String(receivePacket.getData());	
			
			clientSocket.close();
			System.out.println("From Server:"+receivedAnswer);
			break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			clientSocket.close();
		}
		return receivedAnswer;
	}
}
