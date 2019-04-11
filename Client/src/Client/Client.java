package Client;


import Server.Distante;
import Server.Resultat;
import Server.Service;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {


    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

//        if(System.getSecurityManager() == null) {
//            System.setSecurityManager( new SecurityManager());
//        }

        Registry reg = LocateRegistry.getRegistry("localhost",2001);

        //Distante d = (Distante)reg.lookup("rmi://localhost:2001/MonOD");
        Distante d = (Distante)reg.lookup("MonOD");
        Resultat r = d.result( 5 );
        System.out.println(r.toString());

        Service service = d.login();
        for (int i = 0; i < 10; i++) {
            System.out.println(service.getValue());
            service.multiplyBy(2,"client "+args[0]);
        }
        d.echo();

    }
}