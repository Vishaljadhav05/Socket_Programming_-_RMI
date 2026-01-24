package Chat_Server.Test3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket serverSocket = new ServerSocket(3333);
            System.out.println("Server is waiting for request..");

            //Receiving message from the client
            Socket socket = serverSocket.accept();
            System.out.println("Client found.");
            System.out.println("-------------------------------------------");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str1 = "", str2 = "";
            while (!str1.equals("bye")) 
            {
                str2 = dis.readUTF();
                System.out.println("Client says: "+ str2);

                str1 = br.readLine();
                dos.writeUTF(str1);
                dos.flush();  
            }
            serverSocket.close();
            socket.close();


        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

