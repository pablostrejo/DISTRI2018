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
	
	public Jugador calcularGanador(){ //asumo que ya se terminó la baza
		Jugador jugGan = new Jugador();
		if(terminoBaza()){
			if(cantCartasTiradas == 4){
				List<CartaTirada> cartas = cartasJugadasBaza();
				CartaTirada cartita = mayorDeLasCuatro(cartas); 
				jugGan = cartita.getCarta().getJugador();
				return jugGan;
			}
		}
		return null;
	}
	
	private CartaTirada mayorDeLasCuatro(List<CartaTirada> cartas){
		int max = 0;
		CartaTirada cartita = null;
		if(cartas.get(0).getCarta().getCarta().getOrdenEnJuego() > max){
			max = cartas.get(0).getCarta().getCarta().getOrdenEnJuego();
			cartita = cartas.get(0);
		}
		if(cartas.get(1).getCarta().getCarta().getOrdenEnJuego() > max){
			max = cartas.get(1).getCarta().getCarta().getOrdenEnJuego();
			cartita = cartas.get(1);
		}
		if(cartas.get(2).getCarta().getCarta().getOrdenEnJuego() > max){
			max = cartas.get(2).getCarta().getCarta().getOrdenEnJuego();
			cartita = cartas.get(2);
		}
		if(cartas.get(3).getCarta().getCarta().getOrdenEnJuego() > max){
			max = cartas.get(3).getCarta().getCarta().getOrdenEnJuego();
			cartita = cartas.get(3);
		}
		return cartita;
	}
	
	private List<CartaTirada> cartasJugadasBaza(){
		List<CartaTirada> cartas = new ArrayList<CartaTirada>();
		for(Movimiento mov : movimientosBaza){
			if(mov.sosTipoCarta()){
				cartas.add((CartaTirada) mov);
			}
		}
		return cartas;
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
	
	/*private Jugador cerrarBaza(){
		Jugador jugCerr = new Jugador();
		// TODO
		return jugCerr;
	}*/ // seria igual que quienGano
	
	private boolean terminoBaza(){
		if(cantCartasTiradas == 4){
			return true;
		}
		else{
			if(puntosPareja1.getIdPuntosPareja() >= 30 || puntosPareja2.getIdPuntosPareja() >= 30){
				return true;
			}
			if(movimientosBaza.size()>0){
				Movimiento movi = movimientosBaza.get(movimientosBaza.size()-1);
				if (!movi.sosTipoCarta()){
					Envite envi1 = (Envite) movi;
					if(envi1.getTipoEnvite().toString().equalsIgnoreCase("noQuieroTruco")){
						return true;
					}
				}
			}
		}
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
