import java.rmi.Naming;
import java.util.Scanner;

import rmi.RemoteInterface;

public class TestCliente {
	
	private static RemoteInterface gestionRemoto;
	
	public static void main(String[] args) {
		menu();
	}
	
	private static void menu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1- Conectarse al servidor.");
		System.out.println("2- Regstrarse.");
		System.out.println("3- Login.");
		System.out.println("4-  ...");
		System.out.println("5- Salir.");
		
		int input = scan.nextInt();
		
		switch (input) {
		
		case 1:
			try {
				if (conectarse())
				System.out.println("Conectado.");
				pressAnyKeyToContinue();
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case 2:
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case 3:
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case 4:
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case 5:
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			} 
			break;
		default:
			break;
		}
	}
	
	private static boolean conectarse() throws Exception {
		try {
			gestionRemoto = (RemoteInterface) Naming.lookup("//localhost/TPO_AD2018");
			System.out.println("Conectando...");
			return true;
		} catch (Exception e) {
			System.out.println("No se pudo conectar al servidor.");
			return false;
		}
	}
	
	private static  void pressAnyKeyToContinue()
	 { 
	        System.out.println("Presione una tecla para continuar...");
	        try
	        {
	            System.in.read();
	        }  
	        catch(Exception e){
	        	e.printStackTrace();
	        }
	 }
	

}
