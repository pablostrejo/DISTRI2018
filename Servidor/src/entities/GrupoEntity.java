package entities;

import java.util.List;

public class GrupoEntity {
	
	private int idGrupo;
	private String nombre;
	private List<JugadorEntity> miembros;
	private List<ParejaEntity> parejaEsperandoPareja;
	private JugadorEntity admin;
	private List<JuegoEntity> juegos;
	private RankingEntity ranking;
	
	public boolean hayJugadoresSuficientes() {
		// TODO
		return false;
	}
	
	public boolean sosGrupo(String nombre) {
		return (this.nombre==nombre);
	}
	
	public void crearJuego(ParejaEntity pareja1, ParejaEntity pareja2) {
		String modalidad = "librePareja";
		JuegoEntity j = new JuegoEntity(pareja1, pareja2, modalidad ); // TODO aún no está el constructor de JUEGO, verificar la cantidad y el órden de los atributos.
	}
	
	public ParejaEntity crearPareja(JugadorEntity Jugador1,JugadorEntity Jugador2) {
		ParejaEntity p = new ParejaEntity();
		p.setJugador1(Jugador1);
		p.setJugador2(Jugador2);
		return p;
	}
	
	public boolean sosAdmin(JugadorEntity jugador) {
		return (jugador.getIdJugador()==this.admin.getIdJugador());
	}

}
