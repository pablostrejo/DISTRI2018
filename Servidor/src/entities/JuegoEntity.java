package entities;

import java.util.List;

import javax.persistence.*;

import negocio.ModalidadEnum;

@Entity
@Table(name = "Juegos")
public class JuegoEntity {
	
	@Id
	@Column (name = "id_juego", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJuego;
	
	@Column(columnDefinition = "tinyint")
	private ModalidadEnum tipoJuego;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_juego")
	private List<PartidaEntity> partidas;
	
	@Column
	private int cantPartidasGanadasPareja1;
	
	@Column
	private int cantPartidasGanadasPareja2;
	
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
	public int getCantPartidasGanadasPareja1() {
		return cantPartidasGanadasPareja1;
	}
	public void setCantPartidasGanadasPareja1(int cantPartidasGanadasPareja1) {
		this.cantPartidasGanadasPareja1 = cantPartidasGanadasPareja1;
	}
	public int getCantPartidasGanadasPareja2() {
		return cantPartidasGanadasPareja2;
	}
	public void setCantPartidasGanadasPareja2(int cantPartidasGanadasPareja2) {
		this.cantPartidasGanadasPareja2 = cantPartidasGanadasPareja2;
	}	
}
