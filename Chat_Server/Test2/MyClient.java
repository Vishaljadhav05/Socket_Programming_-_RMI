package Chat_Server.Test2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) 
    {
        try 
        {
            Socket socket= new Socket("10.252.253.154", 2222);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str1 = "", str2 = "";
            while (!str1.equals("bye")) 
            {
                str2 = br.readLine();
                dos.writeUTF(str2);
                dos.flush();

                str1 = dis.readUTF();
                System.out.println("Server Says: " + str1);
            }
            socket.close();


        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

    }
}

//Output:

// hii
// Server Says: hello
// hello
// Server Says: how are you?
// bye
// Server Says: bye