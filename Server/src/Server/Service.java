package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Paul DUPONT
 */
public interface Service extends Remote {

    public int getValue() throws RemoteException;

    public int multiplyBy(int factor, String cname) throws RemoteException;
}
