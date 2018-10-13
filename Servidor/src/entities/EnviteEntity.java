package entities;
import javax.persistence.*;

import negocio.TipoEnviteEnum;

@Entity
@DiscriminatorValue("envite")
public class EnviteEntity extends MovimientoEntity{

	@Column (name = "tipo_envite", columnDefinition = "tinyint")
	private TipoEnviteEnum tipoEnvite;
	
	public TipoEnviteEnum getTipoEnvite() {
		return tipoEnvite;
	}

	public void setTipoEnvite(TipoEnviteEnum tipoEnvite) {
		this.tipoEnvite = tipoEnvite;
	}
}
