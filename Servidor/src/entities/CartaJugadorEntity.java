package entities;
import javax.persistence.*;

@Entity
@Table(name = "CartasJugador")
public class CartaJugadorEntity {
	
	@Id
	@Column(name = "id_cartaJugador", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCartaJugador;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_jugador")
	private JugadorEntity jugador;
	
	@ManyToOne /* fetch = FetchType.EAGER) */
	@JoinColumn(name = "id_carta")
	private CartaEntity carta;
	
	@Column(columnDefinition = "bit")
	private boolean disponible;
	
	public JugadorEntity getJugador() {
		return jugador;
	}
	public void setJugador(JugadorEntity jugador) {
		this.jugador = jugador;
	}
	public CartaEntity getCarta() {
		return carta;
	}
	public void setCarta(CartaEntity carta) {
		this.carta = carta;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getIdCartaJugador() {
		return idCartaJugador;
	}
	public void setIdCartaJugador(int idCartaJugador) {
		this.idCartaJugador = idCartaJugador;
	}
}
