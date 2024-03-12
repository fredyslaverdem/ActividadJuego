package juego;

public class juego {

	public static void main(String[] args) {
		
		//crear un Soldado
		Unidad soldado = new Unidad(new EstrategiaAtaqueSoldado());
		soldado.atacar(); // El soldado ataca con su espada
		
		//crear un arquero
		Unidad arquero = new Unidad(new EstrategiaAtaqueArquero());
		arquero.atacar(); // El arquero dispara una flecha
		
		// crear un caballero
		Unidad caballero = new Unidad(new EstrategiaAtaqueCaballero());
		caballero.atacar(); // El caballero carga con su lanza!
		
		//Cambiar la estrategia de ataque del soldado a la del arquero 
		soldado.setEstrategiaAtaque(new EstrategiaAtaqueArquero());
		soldado.atacar(); // El soldado dispara una flecha
	}

}
