package Chat_Server.Test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket serverSocket = new ServerSocket(1111);
            System.out.println("Server is waiting for request..");

            //Receiving message from the client
            Socket socket = serverSocket.accept();
            System.out.println("Client found.");

            InputStream is = socket.getInputStream();

            DataInputStream dis = new DataInputStream(is);
            String str1 = dis.readUTF();

            System.out.println("Message from client: "+ str1);

            //Sending message to client
            String str2 = "Hello Client";
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            dos.writeUTF(str2);
            dos.flush();

            //Closing the resources
            dis.close();
            is.close();
            socket.close();
            serverSocket.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

//Output:

// Server is waiting for request..
// Client found.
// Message from client: Hello Server
