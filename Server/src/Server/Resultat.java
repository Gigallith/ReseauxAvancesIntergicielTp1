package Server;

import java.io.Serializable;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Paul DUPONT
 */
public abstract class Resultat implements Serializable {

    int i;

    public abstract  String toString();
}
