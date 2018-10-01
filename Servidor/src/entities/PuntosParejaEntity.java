package entities;

public class PuntosParejaEntity {
	
	private int idPuntosPareja;
	private ParejaEntity pareja;
	private int puntos;
	
	public String obtenerCategoria(){
		return (this.pareja.getCategoria().toString());
	}

	public int getIdPuntosPareja() {
		return idPuntosPareja;
	}

	public void setIdPuntosPareja(int idPuntosPareja) {
		this.idPuntosPareja = idPuntosPareja;
	}

	public ParejaEntity getPareja() {
		return pareja;
	}

	public void setPareja(ParejaEntity pareja) {
		this.pareja = pareja;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
}
