package entities;

import java.util.List;

public class RankingEntity {
	
	private List<ItemRankingEntity> catNovato;
	private List<ItemRankingEntity> catCalificado;
	private List<ItemRankingEntity> catExperto;
	private List<ItemRankingEntity> catMaster;
	
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

}
