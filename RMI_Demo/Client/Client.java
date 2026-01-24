package RMI_Demo.Client;

import java.rmi.Naming;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) 
    {
        try 
        {
            //Registry registry = LocateRegistry.getRegistry("rmi://10.252.253.154",1111);
            AddInterface ai = (AddInterface)Naming.lookup("aaa");

            System.out.println(ai.add(10, 20));

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
