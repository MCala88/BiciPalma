package bicipalma;

public class TargetaUsuario {
	private int id = 0;
	private boolean activada = false;
	
	public void setTarId(int identifier) {
		this.id = identifier;
	}
	public int getTarId() {
		return this.id;
	}
	
	public void setActivada(boolean activate) {
		this.activada = activate;
	}
	
	public boolean getActivada() {
		return this.activada;
	}
}
