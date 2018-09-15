package negocio;

public class PuntosPareja {
	
	private int idPuntosPareja;
	private Pareja pareja;
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

	public Pareja getPareja() {
		return pareja;
	}

	public void setPareja(Pareja pareja) {
		this.pareja = pareja;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
}
