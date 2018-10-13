package entities;

import javax.persistence.*;

import negocio.PaloEnum;

@Entity
@Table(name = "Cartas")
public class CartaEntity {
	
	@Id
	@Column(name = "id_carta", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCarta;
	
	@Column(columnDefinition = "tinyint")
	private PaloEnum palo;
	
	@Column
	private int numero; 
	
	@Column(name = "ordenEnJuego")
	private int ordenEnJuego;
	
	@Column
	private int ordenEnMazo;
	
	@Transient // PST: el estado es solo para saber si se repartió o no en el mazo.
	private boolean disponible;
	
	public int getIdCarta() {
		return idCarta;
	}
	public void setIdCarta(int idCarta) {
		this.idCarta = idCarta;
	}
	public PaloEnum getPalo() {
		return palo;
	}
	public void setPalo(PaloEnum palo) {
		this.palo = palo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getOrdenEnJuego() {
		return ordenEnJuego;
	}
	public void setOrdenEnJuego(int ordenEnJuego) {
		this.ordenEnJuego = ordenEnJuego;
	}
	public int getOrdenEnMazo() {
		return ordenEnMazo;
	}
	public void setOrdenEnMazo(int ordenEnMazo) {
		this.ordenEnMazo = ordenEnMazo;
	}
	public boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}	
}
