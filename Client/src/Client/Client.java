package Client;


import Server.Distante;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {


    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Registry reg = LocateRegistry.getRegistry("localhost",2001);

        //Distante d = (Distante)reg.lookup("rmi://localhost:2001/MonOD");
        Distante d = (Distante)reg.lookup("MonOD");


        d.echo();

    }
}