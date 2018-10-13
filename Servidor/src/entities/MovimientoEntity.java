package entities;
import javax.persistence.*;

@Entity
@Table(name ="Movimientos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo", discriminatorType=DiscriminatorType.STRING)
public abstract class MovimientoEntity {
	
	@Id
	@Column (name = "id_movimiento", nullable = false)
	@GeneratedValue
	protected int idMovimiento;
	
	@Column 
	protected int puntosAcum;

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public int getPuntosAcum() {
		return puntosAcum;
	}

	public void setPuntosAcum(int puntosAcum) {
		this.puntosAcum = puntosAcum;
	}

}
