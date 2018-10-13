package entities;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

import negocio.Mano;

@Entity
@Table (name = "Chicos")
public class ChicoEntity {
	
	@Id
	@Column (name = "id_chico", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idChico;
	
	@Column (name = "nro_chico")
	private int numeroChico;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_chico")
	private List<Mano> manos;
	
	@Transient
	private List<JugadorEntity> ordenJuego;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_chico")
	private PuntosParejaEntity puntosPareja1; 
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_chico")
	private PuntosParejaEntity puntosPareja2;
	
	public List<Mano> getManos() {
		return manos;
	}
	public void setManos(List<Mano> manos) {
		this.manos = manos;
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
