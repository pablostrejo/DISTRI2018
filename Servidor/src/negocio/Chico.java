package negocio;

import java.util.List;

import dto.*;

public class Chico {
	
	private int idChico;
	private int numeroChico;	// lo agregué pst
	private List<Mano> manos;	// lo agregué pst
	private List<Jugador> ordenJuego;
	private PuntosPareja puntosPareja1; 
	private PuntosPareja puntosPareja2;
	
	public void actualizarOrdenJuego(){
		// TODO 
	}
	public void actualizarPuntajes(){
		// TODO 		
	}
	private void registrarMovimiento(Jugador jugador, Movimiento movimiento){
		// TODO 		
	}
	private List<Movimiento> obtenerMovimientosPosibles(Jugador jugador){
		// TODO 
		return null;
	}
	private boolean terminoChico(){
		// TODO
		return false;
	}
	public int getIdChico() {
		return idChico;
	}
	public void setIdChico(int idChico) {
		this.idChico = idChico;
	}
	public int getNumeroChico() {
		return numeroChico;
	}
	public void setNumeroChico(int numeroChico) {
		this.numeroChico = numeroChico;
	}
	public List<Mano> getManos() {
		return manos;
	}
	public void setManos(List<Mano> manos) {
		this.manos = manos;
	}
	public List<Jugador> getOrdenJuego() {
		return ordenJuego;
	}
	public void setOrdenJuego(List<Jugador> ordenJuego) {
		this.ordenJuego = ordenJuego;
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
