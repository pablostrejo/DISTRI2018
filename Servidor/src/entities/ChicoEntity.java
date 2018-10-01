package entities;

import java.util.List;

import dto.*;

public class ChicoEntity {
	
	private int idChico;
	private List<JugadorEntity> ordenJuego;
	private PuntosParejaEntity puntosPareja1; 
	private PuntosParejaEntity puntosPareja2;
	
	public void actualizarOrdenJuego(){
		// TODO 
	}
	public void actualizarPuntajes(){
		// TODO 		
	}
	private void registrarMovimiento(JugadorEntity jugador, MovimientoDTO movimiento){
		// TODO 		
	}
	private List<MovimientoDTO> obtenerMovimientosPosibles(JugadorDTO jugador){
		// TODO 
		return null;
	}
	private boolean terminoChico(){
		// TODO
		return false;
	}

}
