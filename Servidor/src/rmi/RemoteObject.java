package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import interfaces.InterfazRemota;

public class RemoteObject extends UnicastRemoteObject implements InterfazRemota {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RemoteObject() throws RemoteException {
		super();
	}

	

}
