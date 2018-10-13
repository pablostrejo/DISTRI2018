package negocio;

import java.util.List;

import dto.*;

public class Juego {
	
	private int idJuego;
	private ModalidadEnum tipoJuego;
	private List<Partida> partidas;

	public Juego(int idJuego, ModalidadEnum tipoJuego, List<Partida> partidas) {
		super();
		this.idJuego = idJuego;
		this.tipoJuego = tipoJuego;
		this.partidas = partidas;
	}
	public Juego(Pareja pareja1, Pareja pareja2, String modalidad ){
		
	}
	
	public int getIdJuego() {
		return idJuego;
	}

	public void setIdJuego(int idJuego) {
		this.idJuego = idJuego;
	}

	public ModalidadEnum getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuego(ModalidadEnum tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
	
	public void registrarMovimiento(Jugador jugador, Movimiento movimiento){
		
	}
	
	public Movimiento obtenerMovimientoPosibles(Jugador jugador){
		// TODO
		return null;
	}
	
	private List<Movimiento> obtenerMovimientosPosibles(Jugador jugador){
		// TODO
		return null;
	}
	
	private boolean terminoJuego(){
		// TODO 
		return false;
	}	
}
