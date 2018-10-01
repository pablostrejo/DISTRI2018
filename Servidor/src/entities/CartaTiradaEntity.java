package entities;

public class CartaTiradaEntity extends MovimientoEntity{

	private CartaJugadorEntity carta;
	private boolean alMazo;

	public int calcularPuntosEnvite() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean sosTipoCarta() {
		return true;
	}

	public CartaJugadorEntity getCarta() {
		return carta;
	}

	public void setCarta(CartaJugadorEntity carta) {
		this.carta = carta;
	}

	public boolean isAlMazo() {
		return alMazo;
	}

	public void setAlMazo(boolean alMazo) {
		this.alMazo = alMazo;
	}
}
