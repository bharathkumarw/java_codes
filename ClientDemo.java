import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;


public class ClientDemo {
	public static void main(String[] args)throws Exception,IOException 
    {
		// TODO Auto-generated method stub
		try {
    	Socket s=new Socket("localhost",9999);  //client socket created and system assigns some default ap and port no.
    	System.out.println("*******CLIENT*********");
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	String message=br.readLine();
    	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
    	dos.writeUTF(message);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
     }
}

