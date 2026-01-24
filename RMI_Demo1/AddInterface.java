package RMI_Demo1;

import java.rmi.Remote;

public interface AddInterface extends Remote
{

    public int add(int no1, int no2);
} 