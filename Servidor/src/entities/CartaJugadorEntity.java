package entities;

public class CartaJugadorEntity {
	
	private JugadorEntity jugador;
	private CartaEntity carta;
	private boolean disponible;
	
	public boolean sosCarta(CartaEntity carta){
		if (this.carta.getIdCarta() == carta.getIdCarta() & 
			this.carta.getPalo().toString().equalsIgnoreCase(carta.getPalo().toString()) &
			this.carta.getNumero() == carta.getNumero() &
			this.carta.getOrdenEnJuego() == carta.getOrdenEnJuego() &
			this.carta.getOrdenEnMazo() == carta.getOrdenEnMazo()){
				return true;
		}
		return false;
	}
	
	public boolean sosMenor(CartaEntity carta){
		if(this.carta.getOrdenEnJuego() < carta.getOrdenEnJuego()){
			return true;
		}
		return false;
	}
	public boolean sosMayor(CartaEntity carta){
		if(this.carta.getOrdenEnJuego() > carta.getOrdenEnJuego()){
			return true;
		}
		return false;
	}
	public boolean sosIgual(CartaEntity carta){
		if(this.carta.getOrdenEnJuego() == carta.getOrdenEnJuego()){
			return true;
		}
		return false;
	}	
	public JugadorEntity getJugador() {
		return jugador;
	}
	public void setJugador(JugadorEntity jugador) {
		this.jugador = jugador;
	}
	public CartaEntity getCarta() {
		return carta;
	}
	public void setCarta(CartaEntity carta) {
		this.carta = carta;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
