package entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("carta")
public class CartaTiradaEntity extends MovimientoEntity{

	@OneToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "id_cartaJugador")
	private CartaJugadorEntity carta;
	
	@Column(columnDefinition = "bit")
	private boolean alMazo;

	public CartaJugadorEntity getCarta() {
		return carta;
	}

	public void setCarta(CartaJugadorEntity carta) {
		this.carta = carta;
	}

	public boolean isAlMazo() {
		return alMazo;
	}

	public void setAlMazo(boolean alMazo) {
		this.alMazo = alMazo;
	}
}
