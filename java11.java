import java.io.*;
import java.net.*;
import javax.swing.*;

public class java11 {

    public static void main(String[] args) throws IOException {

        String host;
        host = JOptionPane.showInputDialog("please input the server name");
        try {
            InetAddress address = InetAddress.getByName(host);
            JOptionPane.showMessageDialog(null, "Ip Address" + address.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "could not find" + e);

        }
    }
}
