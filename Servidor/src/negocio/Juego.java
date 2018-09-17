package negocio;

import java.util.List;

import dto.*;

public class Juego {
	
	private int idJuego;
	private ModalidadEnum tipoJuego;
	private List<Partida> partidas;
	
	private void registrarMovimiento(Jugador jugador, Movimiento movimiento){
		// TODO
	}
	private List<MovimientoDTO>obtenerMovimientosPosibles(Jugador jugador){
		// TODO
		return null;
	}
	private boolean terminoJuego(){
		// TODO 
		return false;
	}	

}
