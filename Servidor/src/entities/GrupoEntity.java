package entities;
import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Table (name = "Grupos")
public class GrupoEntity {
	
	@Id
	@Column (name = "id_grupo", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGrupo;
	
	@Column
	private String nombre;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_grupo")
	private List<JugadorEntity> miembros;
	
	@Transient
	private List<ParejaEntity> parejaEsperandoPareja;
	
	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_grupo")
	private JugadorEntity admin;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinColumn (name = "id_grupo")
	private List<JuegoEntity> juegos;
	
	@OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER) // TENGO DUDAS PST
	@JoinColumn(name = "id_grupo")
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

	public RankingEntity getRanking() {
		return ranking;
	}

	public void setRanking(RankingEntity ranking) {
		this.ranking = ranking;
	}

}
