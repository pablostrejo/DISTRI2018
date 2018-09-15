package negocio;

public class Jugador {

	private int idJugador;
	private String apodo;
	private String mail;
	private String password;
	private CategoriaEnum categoria;
	private int puntos;
	private int partidasJugadas;
	private int partidasGanadas;
	private EstadoEnum estado;
	
	public Jugador(){
		
	}
	
	public boolean sosApodoMail(String apodo, String mail){
		if(this.apodo.equalsIgnoreCase(apodo) & (this.mail.equalsIgnoreCase(mail))){
			return true;
		}
		return false;
	}
	public boolean passwordOK(String pass){
		if(this.password.equalsIgnoreCase(pass)){
			return true;
		}
		return false;
	}
	public boolean disponibleParaJugar(){
		if(this.estado.toString().equalsIgnoreCase("conectado")){
			return true;
		}
		return false;
	}
	public void actualizarCategoria(){
		/*La categorización de los jugadores la realiza el sistema en base a la cantidad de partidas jugadas y la de ganadas. Los jugadores pueden subir o bajar de categoría según los resultados obtenidos, pero nunca pueden volver a la categoría de novato.
		Cuando un jugador se registra, se incluye en la categoría de “novato”.
		Cuando un jugador jugo más de 100 partidas, posee más de 500 puntos y un promedio de 5 o más, pasa a la categoría de “calificado”.
		Cuando un jugador jugo más de 500 partidas, posee más de 3000 puntos y un promedio de 6 o más, pasa a la categoría de “experto”.
		Cuando un jugador jugo más de 1000 partidas, posee más de 8000 puntos y un promedio de 8 o más, pasa a la categoría de “master”.*/
		CategoriaEnum cat ;
		if((this.partidasJugadas>= 1000) & (this.puntos > 8000) & (calcularPromedio() >= 8)){
			cat = CategoriaEnum.master;
		}
		else{
			if((this.partidasJugadas>= 500) & (this.puntos > 3000) & (calcularPromedio() >= 6)){
				cat = CategoriaEnum.experto;
			}
			else{
				if((this.partidasJugadas>= 100) & (this.puntos > 500) & (calcularPromedio() >= 5)){
					cat = CategoriaEnum.calificado;
				}
				else{
					cat = CategoriaEnum.novato;
				}
			}
		}
		if(!this.categoria.equals(cat)){
			if(!cat.equals(CategoriaEnum.novato)){
				this.categoria = cat;
			}
		}
	}
	public CategoriaEnum obtenerCategoria(){
		return this.categoria;
	}
	private int calcularPromedio(){
		return (this.puntos/this.partidasJugadas);
	}
}
