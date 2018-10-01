package entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import dto.*;

@Entity
@Table(name = "Bazas")
public class BazaEntity {

	@Id
	@Column (name = "id_baza", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idBaza;
	
	@Column (name = "numeroBaza", nullable = false)  // lo hacemos @Transient ??
	private int numeroBaza;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_baza")
	private List<MovimientoEntity> movimientosBaza;
	
	@OneToOne /* fetch = FetchType.EAGER)*/
	@JoinColumn (name = "id_jugador")
	private JugadorEntity ganadorBaza;
	
	@Transient // esta annotation hace que no se persista este atributo.
	private List<JugadorEntity> ordenJugador;
	
	@Transient // esta annotation hace que no se persista este atributo.
	private int cantCartasTiradas;
	
	@Transient // ESTA BIEN? hago que solo lo persista JUEGO
	private PuntosParejaEntity puntosPareja1;

	@Transient // ESTA BIEN? hago que solo lo persista JUEGO
	private PuntosParejaEntity puntosPareja2;
	
	@Transient
	private JugadorEntity jugadorActivo;
	

	public int getIdBaza() {
		return idBaza;
	}
	public void setIdBaza(int idBaza) {
		this.idBaza = idBaza;
	}
	public int getNumeroBaza() {
		return numeroBaza;
	}
	public void setNumeroBaza(int numeroBaza) {
		this.numeroBaza = numeroBaza;
	}
	public List<MovimientoEntity> getMovimientosBaza() {
		return movimientosBaza;
	}
	public void setMovimientosBaza(List<MovimientoEntity> movimientosBaza) {
		this.movimientosBaza = movimientosBaza;
	}
	public JugadorEntity getGanadorBaza() {
		return ganadorBaza;
	}
	public void setGanadorBaza(JugadorEntity ganadorBaza) {
		this.ganadorBaza = ganadorBaza;
	}
	public List<JugadorEntity> getOrdenJugador() {
		return ordenJugador;
	}
	public void setOrdenJugador(List<JugadorEntity> ordenJugador) {
		this.ordenJugador = ordenJugador;
	}
	public int getCantCartasTiradas() {
		return cantCartasTiradas;
	}
	public void setCantCartasTiradas(int cantCartasTiradas) {
		this.cantCartasTiradas = cantCartasTiradas;
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
	public JugadorEntity getJugadorActivo() {
		return jugadorActivo;
	}
	public void setJugadorActivo(JugadorEntity jugadorActivo) {
		this.jugadorActivo = jugadorActivo;
	}
}
