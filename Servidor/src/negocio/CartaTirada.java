package negocio;

public class CartaTirada extends Movimiento{

	private CartaJugador carta;
	private boolean alMazo;

	public int calcularPuntosEnvite() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean sosTipoCarta() {
		return true;
	}

	public CartaJugador getCarta() {
		return carta;
	}

	public void setCarta(CartaJugador carta) {
		this.carta = carta;
	}

	public boolean isAlMazo() {
		return alMazo;
	}

	public void setAlMazo(boolean alMazo) {
		this.alMazo = alMazo;
	}
}
