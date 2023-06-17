import java.net.*;
import java.io.*;
import javax.swing.*;
public class Java1{
    public static void main(String []args)throws IOException { 
    
        String host;
        host=JOptionPane.showInputDialog( "please input the server name");
        try{
            InetAddress address = InetAddress.getByName(host);
            JOptionPane.showMessageDialog (null," IP Address: "+ address.toString() );

        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,"could not found"+host );
        }
    
    }
}