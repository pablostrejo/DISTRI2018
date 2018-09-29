package negocio;

import java.util.List;

<<<<<<< HEAD
import dto.*;

=======
>>>>>>> ab2a21839c3a734f204e955fa94c32dc2a536e61
public class Juego {
	
	private int idJuego;
	private ModalidadEnum tipoJuego;
	private List<Partida> partidas;
	
<<<<<<< HEAD
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
=======
	public Juego(int idJuego, ModalidadEnum tipoJuego, List<Partida> partidas) {
		super();
		this.idJuego = idJuego;
		this.tipoJuego = tipoJuego;
		this.partidas = partidas;
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
		
	}
	
	public boolean terminoJuego(){
		
		
		return false;
		
	}
	
>>>>>>> ab2a21839c3a734f204e955fa94c32dc2a536e61

}
