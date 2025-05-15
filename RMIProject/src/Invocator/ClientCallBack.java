package Invocator;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientCallBack extends Remote {
    void receiveMessage(String from, String message) throws RemoteException;
}