package clientserver;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerDemo {
	public static void main(String args[])throws Exception {
		try {
			
		ServerSocket ss=new ServerSocket(9999);  //portno.=4444,ip adress will given by system(localhost or 127.0.0.1)
		System.out.println("*******SEREVR****");
		Socket s=ss.accept(); //to receive and accept connection requests
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String msg=dis.readUTF();
		System.out.println("client says:"+msg);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}


