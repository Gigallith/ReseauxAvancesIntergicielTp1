package Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ObjetDistant extends UnicastRemoteObject implements Distante {

    Service service = new ServiceImpl();

    public ObjetDistant(int numport) throws RemoteException {
        super(numport);
    }
    public void echo() throws RemoteException{
        System.out.println("Echo");
    }

    @Override
    public Resultat result(int i) {
        System.out.println("calcul result");
        return new Resultat2(i);
    }

    @Override
    public Service login() {
        System.out.println(service);
        return service;
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Registry reg= LocateRegistry.createRegistry(2001);
        Distante d = new ObjetDistant(10001);

        reg.rebind("MonOD",d);
        Naming.rebind("rmi://localhost:2001/MonOD",d);
    }
}