import java.io.*;
import java.net.*;
public class java21 {
    
    public static void main(String args[]){
        String data= "any message";
try{
    ServerSocket Sa = new ServerSocket(14);
    Socket skt = Sa.accept();
    System.out.println("server has connected");
    PrintWriter out = new PrintWriter(skt.getOutputStream(),true);
    System.out.println("sender string"+data);
out.print(data);
out.close();
skt.close();
}
catch(Exception e){
System.out.println("not works");
}
    }

}
