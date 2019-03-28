package Server;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Paul DUPONT
 */
public interface Distante extends Remote {
    public void echo() throws RemoteException;
}
