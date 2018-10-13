package entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Partidas")
public class PartidaEntity {
	
	@Id
	@Column (name = "id_partida", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPartida;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_partida")
	private List<ChicoEntity> chicos;
	
	@Transient
	private PuntosParejaEntity puntosPareja1;
	
	@Transient
	private PuntosParejaEntity puntosPareja2;
	
	public int getIdPartida() {
		return idPartida;
	}
	public void setIdPartida(int idPartida) {
		this.idPartida = idPartida;
	}
	public List<ChicoEntity> getChicos() {
		return chicos;
	}
	public void setChicos(List<ChicoEntity> chicos) {
		this.chicos = chicos;
	}
	public PuntosParejaEntity getPuntosPareja1() {
		return puntosPareja1;
	}
	public void setPuntosPareja1(PuntosParejaEntity puntosPareja1) {
		this.puntosPareja1 = puntosPareja1;
	}
	public PuntosParejaEntity getPuntosPareja2() {
		return puntosPareja2;
	}
	public void setPuntosPareja2(PuntosParejaEntity puntosPareja2) {
		this.puntosPareja2 = puntosPareja2;
	}
}
