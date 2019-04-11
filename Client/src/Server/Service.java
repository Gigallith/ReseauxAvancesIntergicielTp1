package Server;

import java.rmi.Remote;

/**
 * @author Paul DUPONT
 */
public interface Service extends Remote {

    public int getValue();

    public void multiplyBy(int factor);
}
