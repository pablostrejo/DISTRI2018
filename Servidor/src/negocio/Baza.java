package negocio;

import java.util.ArrayList;
import java.util.List;

import dto.*;

public class Baza {

	private int idBaza;
	private int numeroBaza;
	private List<Movimiento> movimientosBaza;
	private Jugador ganadorBaza;
	private List<Jugador> ordenJugador;
	private int cantCartasTiradas;
	private PuntosPareja puntosPareja1;
	private PuntosPareja puntosPareja2;
	private Jugador jugadorActivo;
	
	public Jugador calcularGanador(){
		Jugador jugGan = new Jugador();
		// TODO
		return jugGan;
	}
	public Jugador aQuienLeToca(){
		Jugador jugTurno = new Jugador();
		// TODO
		return jugTurno;
	}
	public void actualizarOrdenJuego(Jugador jugador){
		// TODO
	}
	public List<TipoEnviteEnum> movimientosPosibles(Jugador jugador){
		List<TipoEnviteEnum> movPos = new ArrayList<TipoEnviteEnum>();
		// TODO
		return movPos;
	}
	public void registrarMovimiento(Jugador jugador, MovimientoDTO movimiento){ //DTO o negocio?
		// TODO
	}
	private boolean seJugoCarta(MovimientoDTO movimiento ){
		// TODO
		return false;
	}
	private void actualizarPuntajes(){
		
	}
	private boolean necesitoRespuesta(){
		// TODO
		return false;
	}
	private Jugador quienResponde(){
		Jugador jugResp = new Jugador();
		// TODO
		return jugResp;
	}
	private List<MovimientoDTO> obtenerMovimientosPosibles(JugadorDTO jugador){
		List<MovimientoDTO> movPos = new ArrayList<MovimientoDTO>();
		// TODO
		return movPos;
	}
	private Jugador cerrarBaza(){
		Jugador jugCerr = new Jugador();
		// TODO
		return jugCerr;
	}
	private boolean terminoBaza(){
		// TODO
		return false;
	}
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
	public List<Movimiento> getMovimientosBaza() {
		return movimientosBaza;
	}
	public void setMovimientosBaza(List<Movimiento> movimientosBaza) {
		this.movimientosBaza = movimientosBaza;
	}
	public Jugador getGanadorBaza() {
		return ganadorBaza;
	}
	public void setGanadorBaza(Jugador ganadorBaza) {
		this.ganadorBaza = ganadorBaza;
	}
	public List<Jugador> getOrdenJugador() {
		return ordenJugador;
	}
	public void setOrdenJugador(List<Jugador> ordenJugador) {
		this.ordenJugador = ordenJugador;
	}
	public int getCantCartasTiradas() {
		return cantCartasTiradas;
	}
	public void setCantCartasTiradas(int cantCartasTiradas) {
		this.cantCartasTiradas = cantCartasTiradas;
	}
	public PuntosPareja getPuntosPareja1() {
		return puntosPareja1;
	}
	public void setPuntosPareja1(PuntosPareja puntosPareja1) {
		this.puntosPareja1 = puntosPareja1;
	}
	public PuntosPareja getPuntosPareja2() {
		return puntosPareja2;
	}
	public void setPuntosPareja2(PuntosPareja puntosPareja2) {
		this.puntosPareja2 = puntosPareja2;
	}
	public Jugador getJugadorActivo() {
		return jugadorActivo;
	}
	public void setJugadorActivo(Jugador jugadorActivo) {
		this.jugadorActivo = jugadorActivo;
	}
}
