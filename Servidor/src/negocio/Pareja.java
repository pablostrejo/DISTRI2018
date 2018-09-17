package negocio;

public class Pareja {
	
	private int idPareja;
	private CategoriaEnum categoria;
	private Jugador jugador1;
	private Jugador jugador2;
	
	//////////////////////////////////////////////////////////////
	
	public int getIdPareja() {
		return idPareja;
	}
	public void setIdPareja(int idPareja) {
		this.idPareja = idPareja;
	}
	public CategoriaEnum getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}
	public Jugador getJugador1() {
		return jugador1;
	}
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}
	public Jugador getJugador2() {
		return jugador2;
	}
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	
	public String obtenerCategoria() {
		return this.categoria.toString();
	}
	
	public Pareja(Jugador jugador1, Jugador jugador2) {
		super();
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		
		// En progreso, el calculo de la cateogría:
		String cat1 = jugador1.getCategoria().toString();
		String cat2 = jugador2.getCategoria().toString();
		
		switch (cat1) {
		case "master":{
			this.categoria=jugador1.getCategoria();
		}
			break;
		case "experto":{
			if (jugador2.getCategoria() != "master") {
				this.categoria=jugador1.getCategoria();
			} else {
				this.categoria=jugador2.getCategoria();
			}
		}
			break;
		case "calificado":{
			if (jugador2.getCategoria() != "master" && "experto") {
				this.categoria=jugador1.getCategoria();
			} else {
				this.categoria=jugador2.getCategoria();
			}
		}
			break;
		default:{
			this.categoria=jugador2.getCategoria();
		}
			break;
		}
	}
	

}
