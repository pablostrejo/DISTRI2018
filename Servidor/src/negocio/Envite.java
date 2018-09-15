package negocio;

public class Envite extends Movimiento{

	private TipoEnviteEnum tipoEnvite;
	
	public int calcularPuntosEnvite() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean sosTipoCarta() {
		return false;
	}

	public TipoEnviteEnum getTipoEnvite() {
		return tipoEnvite;
	}

	public void setTipoEnvite(TipoEnviteEnum tipoEnvite) {
		this.tipoEnvite = tipoEnvite;
	}
}
