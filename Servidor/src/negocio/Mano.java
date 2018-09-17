package negocio;

import java.util.ArrayList;
import java.util.List;

import dto.*;

public class Mano {
	
	private int idMano;
	private Mazo mazo;
	private Envite enviteActual; // quien lo modifica? 
	private List<CartaJugador> cartaJugador;
	private List<Baza> bazas;
	private List<Jugador> ordenJuego;
	private List<Integer> puntosEnvido;
	private int puntajeTruco;
	private PuntosPareja PuntosPareja1;
	private PuntosPareja PuntosPareja2;
	
	public void repartirCartas(){
		// TODO
	}
	public void actualizarOrdenJuego(){
		// TODO
	}
	private void registrarMovimiento(Jugador jugador, MovimientoDTO movimiento){
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
	public Mazo getMazo() {
		return mazo;
	}
	public void setMazo(Mazo mazo) {
		this.mazo = mazo;
	}
	public Envite getEnviteActual() {
		return enviteActual;
	}
	public void setEnviteActual(Envite enviteActual) {
		this.enviteActual = enviteActual;
	}
	public List<CartaJugador> getCartaJugador() {
		return cartaJugador;
	}
	public void setCartaJugador(List<CartaJugador> cartaJugador) {
		this.cartaJugador = cartaJugador;
	}
	public List<Baza> getBazas() {
		return bazas;
	}
	public void setBazas(List<Baza> bazas) {
		this.bazas = bazas;
	}
	public List<Jugador> getOrdenJuego() {
		return ordenJuego;
	}
	public void setOrdenJuego(List<Jugador> ordenJuego) {
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
	public PuntosPareja getPuntosPareja1() {
		return PuntosPareja1;
	}
	public void setPuntosPareja1(PuntosPareja puntosPareja1) {
		PuntosPareja1 = puntosPareja1;
	}
	public PuntosPareja getPuntosPareja2() {
		return PuntosPareja2;
	}
	public void setPuntosPareja2(PuntosPareja puntosPareja2) {
		PuntosPareja2 = puntosPareja2;
	}
}
