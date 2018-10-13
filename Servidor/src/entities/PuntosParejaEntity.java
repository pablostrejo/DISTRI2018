package entities;

import javax.persistence.*;

@Entity
@Table(name = "PuntosPareja")
public class PuntosParejaEntity {
	
	@Id
	@Column(name = "id_puntaje", nullable = false)
	@GeneratedValue
	private int idPuntosPareja;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pareja")
	private ParejaEntity pareja;
	
	@Column
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
