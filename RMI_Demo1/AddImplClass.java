package RMI_Demo1;

import java.rmi.*;
import java.rmi.server.*;

public class AddImplClass extends UnicastRemoteObject implements AddInterface
{
    public AddImplClass() throws RemoteException
    {
        super();
    }

    public int add(int no1, int no2){
        return no1+no2;
    }
}
