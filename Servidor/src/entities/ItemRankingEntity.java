package entities;

import javax.persistence.*;

@Entity
@Table (name = "ItemsRanking")
public class ItemRankingEntity {
	
	@Id
	@Column (name = "id_itemranking", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idItemRanking;
	
	@OneToOne /* fetch = FetchType.EAGER)*/
	@JoinColumn (name = "id_jugador")
	private JugadorEntity jugador;
	
	@Column
	private int puntos;
	
	public JugadorEntity getJugador() {
		return jugador;
	}

	public void setJugador(JugadorEntity jugador) {
		this.jugador = jugador;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getIdItemRanking() {
		return idItemRanking;
	}

	public void setIdItemRanking(int idItemRanking) {
		this.idItemRanking = idItemRanking;
	}
}
