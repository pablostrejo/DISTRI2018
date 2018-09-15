package negocio;

public abstract class Movimiento {
	
	protected int idMovimiento;
	protected int puntosAcum;
	
	public abstract int calcularPuntosEnvite();
	
	public abstract boolean sosTipoCarta();

}
