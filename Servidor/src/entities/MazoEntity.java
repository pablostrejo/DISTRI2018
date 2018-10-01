package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MazoEntity {

	private List<CartaEntity> cartas;
	
	public MazoEntity() {
		super();
		iniciarMazo();
	}	
	
	
	public List<CartaEntity> getCartas() {
		return cartas;
	}
	public void setCartas(List<CartaEntity> cartas) {
		this.cartas = cartas;
	}
	
	public void iniciarMazo(){
		
		
		List<CartaEntity> c = new ArrayList<CartaEntity>();
		// TODO c = Aca va un metodo que sea obtenerMazo que deberia estar en el MazoDAO no manda nada como parametro y recibe una lista de cartas.
		this.cartas = c;
		
	}
	
	//Este metodo supone que se ejecutó iniciarMazo en algun momento del juego
	public CartaEntity obtenerCarta(){
		
	
		CartaEntity carta = cartas.get((new Random()).nextInt(cartas.size()));
		for(int i=0; i<cartas.size();i++)
		{
			if(cartas.get(i).getIdCarta()==carta.getIdCarta()) {
				cartas.get(i).setDisponible(false);
			}
		}
		return carta;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
