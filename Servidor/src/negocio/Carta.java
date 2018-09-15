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
}
