package entities;

import java.util.List;

import dto.*;

public class PartidaEntity {
	
	private int idPartida;
	private List<ChicoEntity> chicos;
	private PuntosParejaEntity puntosPareja1; 
	private PuntosParejaEntity puntosPareja2;
	
	private void registrarMovimiento(JugadorEntity jugador, MovimientoDTO movimiento){
		// TODO
	}
	private List<MovimientoDTO> obtenerMovimientosPosibles(JugadorDTO jugador){
		// TODO
		return null;
	}
	private boolean terminoPartida(){
		// TODO
		return false;
	}
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
