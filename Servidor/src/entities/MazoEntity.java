package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Mazos")
public class MazoEntity {

	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_mazo")
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
}
