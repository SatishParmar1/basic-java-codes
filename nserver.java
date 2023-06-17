import java.net.*;
 import java.io.*;
class Client
{
public static void main(String args[]) throws Exception
{
 ServerSocket ss=new ServerSocket(6472); 
Socket s=ss.accept();
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());

BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
String str="", str2="";
while(!str.equals("stop"))
{

str2=din.readUTF();
System.out.println("client says: "+str2);
str=br.readLine();
dout.writeUTF (str);
dout.flush();
}
din.close();
dout.close(); 
ss.close();
}


}