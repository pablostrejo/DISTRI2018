package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import negocio.CategoriaEnum;
import negocio.EstadoEnum;

@Entity
@Table(name = "Jugadores")
public class JugadorEntity {

	@Id
	@Column (name = "id_jugador", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJugador;
	
	@Column
	private String apodo;
	
	@Column
	private String mail;
	
	@Column
	private String password;
	
	@Column(columnDefinition = "tinyint")
	private CategoriaEnum categoria;
	
	@Column
	private int puntos;

	@Column
	private int partidasJugadas;
	
	@Column
	private int partidasGanadas;
	
	@Column(columnDefinition = "tinyint")
	private EstadoEnum estado;
	
	public JugadorEntity(){
		
	}
	
	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CategoriaEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPartidasJugadas() {
		return partidasJugadas;
	}

	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

	public int getPartidasGanadas() {
		return partidasGanadas;
	}

	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	public EstadoEnum getEstado() {
		return estado;
	}

	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}
}
