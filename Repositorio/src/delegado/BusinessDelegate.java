package delegado;

import java.net.MalformedURLException;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import excepciones.ComunicacionException;
import rmi.RemoteInterface;

public class BusinessDelegate {

	private RemoteInterface ri;
	
	
	
	public class BusinessDelegate() {
		
		
		boolean existeApodoMail(String apodo, String mail){
			try {
				return (ri.existeApodoMail(apodo, mail));
			} catch (RemoteException e) {
				
			}
		}
		
	}
	
	
	
	
	
	
}