package entities;

import java.util.ArrayList;
import java.util.List;

import dto.*;

public class ManoEntity {
	
	private int idMano;
	private MazoEntity mazo;
	private EnviteEntity enviteActual; // quien lo modifica? 
	private List<CartaJugadorEntity> cartaJugador;
	private List<BazaEntity> bazas;
	private List<JugadorEntity> ordenJuego;
	private List<Integer> puntosEnvido;
	private int puntajeTruco;
	private PuntosParejaEntity PuntosPareja1;
	private PuntosParejaEntity PuntosPareja2;
	
	public void repartirCartas(){
		// TODO
	}
	public void actualizarOrdenJuego(){
		// TODO
	}
	private void registrarMovimiento(JugadorEntity jugador, MovimientoDTO movimiento){
		// TODO
	}
	private List<MovimientoDTO> obtenerMovimientosPosibles(JugadorDTO jugador){
		List<MovimientoDTO> movPos = new ArrayList<MovimientoDTO>();
		// TODO
		return movPos;
	}
	private List<MovimientoDTO> obtenerPuntosEnvido(){ // NO entiendo por que devuelve una colection de MovDTO
		// TODO
		return null;
	}
	private boolean terminoMano(){
		// TODO 
		return false;
	}
	private boolean seCantoTruco(){
		// TODO
		return false;
	}
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
