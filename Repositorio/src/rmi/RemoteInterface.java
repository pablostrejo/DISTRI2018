package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


public interface RemoteInterface extends Remote{
	
	public boolean existeApodoMail(String apodo,String mail) throws RemoteException;
	
	
}
