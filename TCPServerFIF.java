import java.io.*;
import java.net.*;
public class server
{
	public static void main(String[] args)throws Exception
	{
		ServerSocket ss=null;
		BufferedReader in=null;
		ss=new ServerSocket(1234);
		Socket s=null;
		System.out.println("Waiting for Client");
		s=ss.accept();
		System.out.println("connected to: "+s);
	in = new BufferedReader(new InputStreamReader(s.getInputStream()));
	String fileName=in.readLine();
	System.out.println(fileName);
PrintWriter out=new PrintWriter(s.getOutputStream(), true);
	BufferedReader fin=new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
	String line;
	while((line=fin.readLine())!=null)
	{
		out.println(line);
	}
	out.close();
	}
}