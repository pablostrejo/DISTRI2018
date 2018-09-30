package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmi.RemoteInterface;
import rmi.RemoteObject;

public class Server {

	public static void main(String[] args) {
		RemoteInterface remoteObject;
		try	{
    		LocateRegistry.createRegistry(1099);
    		remoteObject = new RemoteObject();
    		
            Naming.rebind ("//localhost/TPO_AD2018", remoteObject);
            System.out.println("Fijado en //localhost/TPO_AD2018");
		}catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    }
}