package bicipalma;

public class TarjetaUsuario {

	private String id = null;
	private Boolean activada = false;
	
	public TarjetaUsuario(String id, boolean activada) {
		this.id = id;
		this.activada = activada;
	}
	
	public void setActivada(boolean activada) {
		this.activada = activada;
	}
	
	public String getId() {
		return this.id;
	}
	
	public Boolean getActivada() {
		return this.activada;
	}


}