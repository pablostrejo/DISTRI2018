package negocio;

import java.util.ArrayList;
import java.util.List;

public class Mazo {

	private int idMazo;
	private List<Carta> cartas;
	
	public Mazo() {
		super();
		iniciarMazo();
	}	
	
	public int getIdMazo() {
		return idMazo;
	}
	public void setIdMazo(int idMazo) {
		this.idMazo = idMazo;
	}
	public List<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public void iniciarMazo(){
		
		
		List<Carta> c = new ArrayList<Carta>(); 
		this.cartas = c;
		
	}
	public Carta obtenerCarta(){
		
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
