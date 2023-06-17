import java.io.*;
import java.net.*;

public class java2 {

    public static void main(String args[]) {
        try {
            Socket skt = new Socket("localhost", 14);
            BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            System.out.println("recived String:");
            System.out.println(in.readLine());
            in.close();
        }

        catch (Exception e) {
            System.out.println("not works" + e);
        }

    }
}
