import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SPMyserver {

    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket serverSocket = new ServerSocket(1111);
            System.out.println("Server is waiting for request..");

            Socket socket = serverSocket.accept();
            System.out.println("Client found.");

            InputStream is = socket.getInputStream();

            DataInputStream dis = new DataInputStream(is);
            String str = dis.readUTF();

            System.out.println("Message from client: "+ str);


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