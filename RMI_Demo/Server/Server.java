package RMI_Demo.Server;

import java.rmi.Naming;

public class Server 
{
    public static void main(String[] args) 
    {
        try
        {
            AddImplClass obj = new AddImplClass();
            Naming.rebind("rmi://10.252.253.154:1111/aaa", obj);
            System.out.println("-> Server Started <-");

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
    }
    

}
