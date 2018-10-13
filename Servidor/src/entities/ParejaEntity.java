package entities;

import javax.persistence.*;

import negocio.CategoriaEnum;

@Entity
@Table(name = "Parejas")
public class ParejaEntity {
	
	@Id
	@Column (name = "id_baza", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPareja;
	
	@Column(columnDefinition = "tinyint")
	private CategoriaEnum categoria;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "id_jugador1")
	private JugadorEntity jugador1;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "id_jugador2")
	private JugadorEntity jugador2;
	
	public int getIdPareja() {
		return idPareja;
	}
	public void setIdPareja(int idPareja) {
		this.idPareja = idPareja;
	}
	public CategoriaEnum getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}
	public JugadorEntity getJugador1() {
		return jugador1;
	}
	public void setJugador1(JugadorEntity jugador1) {
		this.jugador1 = jugador1;
	}
	public JugadorEntity getJugador2() {
		return jugador2;
	}
	public void setJugador2(JugadorEntity jugador2) {
		this.jugador2 = jugador2;
	}
	
	public String obtenerCategoria() {
		return this.categoria.toString();
	}
	public ParejaEntity(){
		
	}
}
