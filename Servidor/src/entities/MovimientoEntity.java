package entities;

public abstract class MovimientoEntity {
	
	protected int idMovimiento;
	protected int puntosAcum;
	
	public abstract int calcularPuntosEnvite();
	
	public abstract boolean sosTipoCarta();

}
