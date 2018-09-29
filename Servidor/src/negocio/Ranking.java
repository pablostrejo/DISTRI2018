package negocio;

import java.util.List;

public class Ranking {
	
	private List<ItemRanking> catNovato;
	private List<ItemRanking> catCalificado;
	private List<ItemRanking> catExperto;
	private List<ItemRanking> catMaster;
	
	public void actualizarRanking(List<Jugador> jugadores) {
		
	}
	
	public List<ItemRanking> obtenerRankingNovato(){
		//TODO cuando esté listo el DAO
		return null;
	}
	
	public List<ItemRanking> obtenerRankingNovatos(){
		//TODO cuando esté listo el DAO	
		return null;
	}
	
	public List<ItemRanking> obtenerRankingCalificados(){
		//TODO cuando esté listo el DAO
		return null;
	}
	
	public List<ItemRanking> obtenerRankingExpertos(){
		//TODO cuando esté listo el DAO
		return null;
	}
	
	public List<ItemRanking> obtenerRankingMasters(){
		//TODO cuando esté listo el DAO
		return null;
	}
	
	public List<ItemRanking> obtenerRankingTotal(){
		//TODO cuando esté listo el DAO
		return null;
	}

	public List<ItemRanking> getCatNovato() {
		return catNovato;
	}

	public void setCatNovato(List<ItemRanking> catNovato) {
		this.catNovato = catNovato;
	}

	public List<ItemRanking> getCatCalificado() {
		return catCalificado;
	}

	public void setCatCalificado(List<ItemRanking> catCalificado) {
		this.catCalificado = catCalificado;
	}

	public List<ItemRanking> getCatExperto() {
		return catExperto;
	}

	public void setCatExperto(List<ItemRanking> catExperto) {
		this.catExperto = catExperto;
	}

	public List<ItemRanking> getCatMaster() {
		return catMaster;
	}

	public void setCatMaster(List<ItemRanking> catMaster) {
		this.catMaster = catMaster;
	}

}
