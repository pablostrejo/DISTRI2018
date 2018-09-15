package negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mazo {

	private List<Carta> cartas;
	
	public Mazo() {
		super();
		iniciarMazo();
	}	
	
	
	public List<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public void iniciarMazo(){
		
		
		List<Carta> c = new ArrayList<Carta>();
		// TODO c = Aca va un metodo que sea obtenerMazo que deberia estar en el MazoDAO no manda nada como parametro y recibe una lista de cartas.
		this.cartas = c;
		
	}
	
	//Este metodo supone que se ejecutó iniciarMazo en algun momento del juego
	public Carta obtenerCarta(){
		
	
		Carta carta = cartas.get((new Random()).nextInt(cartas.size()));
		for(int i=0; i<cartas.size();i++)
		{
			if(cartas.get(i).getIdCarta()==carta.getIdCarta()) {
				cartas.get(i).setDisponible(false);
			}
		}
		return carta;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
