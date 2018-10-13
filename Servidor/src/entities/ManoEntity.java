package entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Manos")
public class ManoEntity {
	
	@Id
	@Column (name = "id_mano", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMano;
	
	@OneToOne /* fetch = FetchType.EAGER)*/
	@JoinColumn (name = "id_mano")
	private MazoEntity mazo;
	
	@Transient
	private EnviteEntity enviteActual; // PST: quien lo modifica? 
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_mano")
	private List<CartaJugadorEntity> cartaJugador;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_mano")
	private List<BazaEntity> bazas;
	
	@Transient
	private List<JugadorEntity> ordenJuego;
	
	@Transient
	private List<Integer> puntosEnvido;
	
	@Transient
	private int puntajeTruco;
	
	@Transient
	private PuntosParejaEntity PuntosPareja1;
	
	@Transient
	private PuntosParejaEntity PuntosPareja2;
	
	
	public int getIdMano() {
		return idMano;
	}
	public void setIdMano(int idMano) {
		this.idMano = idMano;
	}
	public MazoEntity getMazo() {
		return mazo;
	}
	public void setMazo(MazoEntity mazo) {
		this.mazo = mazo;
	}
	public EnviteEntity getEnviteActual() {
		return enviteActual;
	}
	public void setEnviteActual(EnviteEntity enviteActual) {
		this.enviteActual = enviteActual;
	}
	public List<CartaJugadorEntity> getCartaJugador() {
		return cartaJugador;
	}
	public void setCartaJugador(List<CartaJugadorEntity> cartaJugador) {
		this.cartaJugador = cartaJugador;
	}
	public List<BazaEntity> getBazas() {
		return bazas;
	}
	public void setBazas(List<BazaEntity> bazas) {
		this.bazas = bazas;
	}
	public List<JugadorEntity> getOrdenJuego() {
		return ordenJuego;
	}
	public void setOrdenJuego(List<JugadorEntity> ordenJuego) {
		this.ordenJuego = ordenJuego;
	}
	public List<Integer> getPuntosEnvido() {
		return puntosEnvido;
	}
	public void setPuntosEnvido(List<Integer> puntosEnvido) {
		this.puntosEnvido = puntosEnvido;
	}
	public int getPuntajeTruco() {
		return puntajeTruco;
	}
	public void setPuntajeTruco(int puntajeTruco) {
		this.puntajeTruco = puntajeTruco;
	}
	public PuntosParejaEntity getPuntosPareja1() {
		return PuntosPareja1;
	}
	public void setPuntosPareja1(PuntosParejaEntity puntosPareja1) {
		PuntosPareja1 = puntosPareja1;
	}
	public PuntosParejaEntity getPuntosPareja2() {
		return PuntosPareja2;
	}
	public void setPuntosPareja2(PuntosParejaEntity puntosPareja2) {
		PuntosPareja2 = puntosPareja2;
	}
}
