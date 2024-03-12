package juego;

public class Unidad {
	private EstrategiaAtaque estrategiaAtaque;
	
	public Unidad (EstrategiaAtaque estrategiaAtaque) {
		this.estrategiaAtaque = estrategiaAtaque;
	}
	
	public void setEstrategiaAtaque (EstrategiaAtaque estrategiaAtaque) {
		this.estrategiaAtaque = estrategiaAtaque;
	}
	
	public void atacar() {
		estrategiaAtaque.atacar();
	}
}
