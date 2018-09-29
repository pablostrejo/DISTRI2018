package negocio;

import java.util.List;

import dto.*;

public class Partida {
	
	private int idPartida;
	private List<Chico> chicos;
	private PuntosPareja puntosPareja1; 
	private PuntosPareja puntosPareja2;
	
	private void registrarMovimiento(Jugador jugador, MovimientoDTO movimiento){
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
	public List<Chico> getChicos() {
		return chicos;
	}
	public void setChicos(List<Chico> chicos) {
		this.chicos = chicos;
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
}
