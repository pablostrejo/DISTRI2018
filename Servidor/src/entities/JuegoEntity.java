package entities;

import java.util.List;

import dto.*;

public class JuegoEntity {
	
	private int idJuego;
	private ModalidadEnum tipoJuego;
	private List<PartidaEntity> partidas;
	
	public JuegoEntity(int idJuego, ModalidadEnum tipoJuego, List<PartidaEntity> partidas) {
		super();
		this.idJuego = idJuego;
		this.tipoJuego = tipoJuego;
		this.partidas = partidas;
	}
	public JuegoEntity(ParejaEntity pareja1, ParejaEntity pareja2, String modalidad ){
		
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

	public List<PartidaEntity> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<PartidaEntity> partidas) {
		this.partidas = partidas;
	}
	
	public void registrarMovimiento(JugadorEntity jugador, MovimientoEntity movimiento){
		
	}
	
	public MovimientoEntity obtenerMovimientoPosibles(JugadorEntity jugador){
		// TODO
		return null;
	}
	
	private List<MovimientoDTO>obtenerMovimientosPosibles(JugadorEntity jugador){
		// TODO
		return null;
	}
	
	private boolean terminoJuego(){
		// TODO 
		return false;
	}	
}
