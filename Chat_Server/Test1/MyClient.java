package Chat_Server.Test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) 
    {
        try 
        {
            Socket socket= new Socket("10.252.253.154", 1111);

            //Sending data to the server
            OutputStream os =  socket.getOutputStream();
            
            DataOutputStream dos = new DataOutputStream(os);
        
            String str1 = "Hello Server";
            dos.writeUTF(str1);

            dos.flush();


            //Reciving data from the server
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String str2 = dis.readUTF();

            System.out.println("Message from client: " + str2);

            //Closing the resources
            dos.close();
            os.close();
            socket.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

//Output:

// Message from client: Hello Client