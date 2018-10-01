package entities;

public class ItemRankingEntity {
	
	private JugadorEntity jugador;
	private int puntos;
	
	public void actualizarPuntos() {
		//TODO Para la instancia, debe recibir los nuevos puntos.
	}

	public JugadorEntity getJugador() {
		return jugador;
	}

	public void setJugador(JugadorEntity jugador) {
		this.jugador = jugador;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}
