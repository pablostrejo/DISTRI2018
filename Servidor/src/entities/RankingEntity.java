package entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "Rankings")
public class RankingEntity {
	
	@Id
	@Column (name = "id_ranking")
	@GeneratedValue
	private int idRanking;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "id_ranking")
	private List<ItemRankingEntity> items;
	
	/* PST: CREO QUE NO SE PUEDE TENER MISMO TIPOS PERO DISTINTOS VALORES ASI QUE
	 * DEBERIAMOS DEJAR 1 SOLO Y QUE CUANDO SE HAGA CADA GET DE CATEGORIA LOS SEPARAMOS.
	private List<ItemRankingEntity> catNovato;
	
	private List<ItemRankingEntity> catCalificado;
	
	private List<ItemRankingEntity> catExperto;
	
	private List<ItemRankingEntity> catMaster; */
	
	public void actualizarRanking(List<JugadorEntity> jugadores) {
		
	}
	
	public List<ItemRankingEntity> obtenerRankingNovato(){
		//TODO cuando esté listo el DAO
		return null;
	}
	
	public List<ItemRankingEntity> obtenerRankingNovatos(){
		//TODO cuando esté listo el DAO	
		return null;
	}
	
	public List<ItemRankingEntity> obtenerRankingCalificados(){
		//TODO cuando esté listo el DAO
		return null;
	}
	
	public List<ItemRankingEntity> obtenerRankingExpertos(){
		//TODO cuando esté listo el DAO
		return null;
	}
	
	public List<ItemRankingEntity> obtenerRankingMasters(){
		//TODO cuando esté listo el DAO
		return null;
	}
	
	public List<ItemRankingEntity> obtenerRankingTotal(){
		//TODO cuando esté listo el DAO
		return null;
	}

	public int getIdRanking() {
		return idRanking;
	}

	public void setIdRanking(int idRanking) {
		this.idRanking = idRanking;
	}

	public List<ItemRankingEntity> getItems() {
		return items;
	}

	public void setItems(List<ItemRankingEntity> items) {
		this.items = items;
	}

	/*
	public List<ItemRankingEntity> getCatNovato() {
		return catNovato;
	}

	public void setCatNovato(List<ItemRankingEntity> catNovato) {
		this.catNovato = catNovato;
	}

	public List<ItemRankingEntity> getCatCalificado() {
		return catCalificado;
	}

	public void setCatCalificado(List<ItemRankingEntity> catCalificado) {
		this.catCalificado = catCalificado;
	}

	public List<ItemRankingEntity> getCatExperto() {
		return catExperto;
	}

	public void setCatExperto(List<ItemRankingEntity> catExperto) {
		this.catExperto = catExperto;
	}

	public List<ItemRankingEntity> getCatMaster() {
		return catMaster;
	}

	public void setCatMaster(List<ItemRankingEntity> catMaster) {
		this.catMaster = catMaster;
	}
	 */
}
