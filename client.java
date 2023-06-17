//import java.util.*;
import java.io.*;
import java.net.*;
public class client
{
	public static void main(String[] args)throws Exception
	{
		Socket echo=new Socket(InetAddress.getLocalHost(),1234);
		BufferedReader in = new BufferedReader(new InputStreamReader(echo.getInputStream()));
		PrintWriter out=new PrintWriter(echo.getOutputStream(), true);
		
		String userInput;
		out.println(args[0]);
	while((userInput=in.readLine())!=null)
	{
		System.out.println(userInput);
	}
	in.close();
	echo.close();
	}
}