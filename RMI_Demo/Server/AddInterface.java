package RMI_Demo.Server;

import java.rmi.Remote;

public interface AddInterface extends Remote
{

    public int add(int no1, int no2);
} 