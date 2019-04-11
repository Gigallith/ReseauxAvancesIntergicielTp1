package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Paul DUPONT
 */
public class ServiceImpl extends UnicastRemoteObject implements Service {

    public ServiceImpl() throws RemoteException {

    }

    int val = 1;

    @Override
    public int getValue() {
        return val;
    }

    @Override
    public synchronized int multiplyBy(int factor, String cname) {
        val=val*factor;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread:"+Thread.currentThread().getName()+" val renvoyée : " + val + "au Client "+cname);
        return val;
    }
}
