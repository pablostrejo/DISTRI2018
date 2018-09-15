package negocio;

public class CartaJugador {
	
	private Jugador jugador;
	private Carta carta;
	private boolean disponible;
	
	public boolean sosCarta(Carta carta){
		if (this.carta.getIdCarta() == carta.getIdCarta() & 
			this.carta.getPalo().toString().equalsIgnoreCase(carta.getPalo().toString()) &
			this.carta.getNumero() == carta.getNumero() &
			this.carta.getOrdenEnJuego() == carta.getOrdenEnJuego() &
			this.carta.getOrdenEnMazo() == carta.getOrdenEnMazo()){
				return true;
		}
		return false;
	}
	
	public boolean sosMenor(Carta carta){
		if(this.carta.getOrdenEnJuego() < carta.getOrdenEnJuego()){
			return true;
		}
		return false;
	}
	public boolean sosMayor(Carta carta){
		if(this.carta.getOrdenEnJuego() > carta.getOrdenEnJuego()){
			return true;
		}
		return false;
	}
	public boolean sosIgual(Carta carta){
		if(this.carta.getOrdenEnJuego() == carta.getOrdenEnJuego()){
			return true;
		}
		return false;
	}	
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public Carta getCarta() {
		return carta;
	}
	public void setCarta(Carta carta) {
		this.carta = carta;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
