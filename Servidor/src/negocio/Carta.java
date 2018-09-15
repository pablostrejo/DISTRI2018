package negocio;

public class Carta {
	
	private int idCarta;
	private PaloEnum palo;
	private int numero; 
	private int ordenEnJuego;
	private int ordenEnMazo;
	private boolean disponible;
	
	public boolean sosCarta(Carta carta){
		if (this.idCarta == carta.idCarta & 
			this.palo.toString().equalsIgnoreCase(carta.palo.toString()) &
			this.numero == carta.numero &
			this.ordenEnJuego == carta.ordenEnJuego &
			this.ordenEnMazo == carta.ordenEnMazo){
				return true;
		}
		return false;
	}
	public boolean sosMenor(Carta carta){
		if(this.ordenEnJuego < carta.ordenEnJuego){
			return true;
		}
		return false;
	}
	public boolean sosMayor(Carta carta){
		if(this.ordenEnJuego > carta.ordenEnJuego){
			return true;
		}
		return false;
	}
	public boolean sosIgual(Carta carta){
		if(this.ordenEnJuego == carta.ordenEnJuego){
			return true;
		}
		return false;
	}
	public int getIdCarta() {
		return idCarta;
	}
	public void setIdCarta(int idCarta) {
		this.idCarta = idCarta;
	}
	public PaloEnum getPalo() {
		return palo;
	}
	public void setPalo(PaloEnum palo) {
		this.palo = palo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getOrdenEnJuego() {
		return ordenEnJuego;
	}
	public void setOrdenEnJuego(int ordenEnJuego) {
		this.ordenEnJuego = ordenEnJuego;
	}
	public int getOrdenEnMazo() {
		return ordenEnMazo;
	}
	public void setOrdenEnMazo(int ordenEnMazo) {
		this.ordenEnMazo = ordenEnMazo;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
}
