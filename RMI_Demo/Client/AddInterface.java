package RMI_Demo.Client;

import java.rmi.Remote;

public interface AddInterface extends Remote
{

    public int add(int no1, int no2);
} 