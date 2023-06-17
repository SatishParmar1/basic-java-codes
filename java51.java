import java.io.*;
import java.net.*;

class java51 {
    public static void main(String[] args) {
        String data = "hello world";
        try {
            ServerSocket sevr = new ServerSocket(14);
            Socket skt = sevr.accept();
            System.out.println("server has connected");
            PrintWriter Out = new PrintWriter(skt.getOutputStream());
            System.out.println("server send data" + data);
            Out.print(data);
            Out.close();
            skt.close();
            sevr.close();
        } catch (Exception e) {
            System.out.println("not connected" + e);

        }
    }
}