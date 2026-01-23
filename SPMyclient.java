import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SPMyclient {
    public static void main(String[] args) {
        try 
        {
            Socket socket= new Socket("10.252.253.154", 1111);

            OutputStream os =  socket.getOutputStream();
            
            DataOutputStream dos = new DataOutputStream(os);
        
            String str = "Hello Server";
            dos.writeUTF(str);

            dos.flush();

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
