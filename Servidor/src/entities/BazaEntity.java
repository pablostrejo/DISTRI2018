package entities;

import java.util.ArrayList;
import java.util.List;

import dto.*;

public class BazaEntity {

	private int idBaza;
	private int numeroBaza;
	private List<MovimientoEntity> movimientosBaza;
	private JugadorEntity ganadorBaza;
	private List<JugadorEntity> ordenJugador;
	private int cantCartasTiradas;
	private PuntosParejaEntity puntosPareja1;
	private PuntosParejaEntity puntosPareja2;
	private JugadorEntity jugadorActivo;
	
	public void registrarMovimiento(JugadorEntity jugador, MovimientoDTO movimiento){ //DTO o negocio?
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
	
	private JugadorEntity quienResponde(){
		JugadorEntity jugResp = new JugadorEntity();
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
				MovimientoEntity movi = movimientosBaza.get(movimientosBaza.size()-1);
				if (!movi.sosTipoCarta()){
					EnviteEntity envi1 = (EnviteEntity) movi;
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
