package negocio;

import java.util.List;

public class Grupo {
	
	private int idGrupo;
	private String nombre;
	private List<Jugador> miembros;
	private List<Pareja> parejaEsperandoPareja;
	private Jugador admin;
	private List<Juego> juegos;
	private Ranking ranking;
	
	public boolean hayJugadoresSuficientes() {
		// TODO
		return false;
	}
	
	public boolean sosGrupo(String nombre) {
		return (this.nombre==nombre);
	}
	
	public void crearJuego(Pareja pareja1, Pareja pareja2) {
		String modalidad = "librePareja";
		Juego j = new Juego(pareja1, pareja2, modalidad ); //TODO aún no está el constructor de JUEGO, verificar la cantidad y el órden de los atributos.
	}
	
	public Pareja crearPareja(Jugador Jugador1,Jugador Jugador2) {
		Pareja p = new Pareja();
		p.setJugador1(Jugador1);
		p.setJugador2(Jugador2);
		return p;
	}
	
	public boolean sosAdmin(Jugador jugador) {
		return (jugador.getIdJugador()==this.admin.getIdJugador());
	}

}
