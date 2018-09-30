package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import rmi.RemoteInterface;

public class RemoteObject extends UnicastRemoteObject implements RemoteInterface {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RemoteObject() throws RemoteException {
		super();
	}

	

}
