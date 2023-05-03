package ejercicio04;

public class Perro extends AnimalDomestico{
	
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	public void hacerRuido() {
		System.out.println("Guau! Guau!");
	}
	
	public boolean hacerCaso() {
		boolean caso = false;
		int probabilidad = (int)Math.random()*100;
		
		if(probabilidad >= 0 && probabilidad < 90) {
			caso = true;
		}
		
		return caso;
	}
	
	public void sacarPaseo() {
		System.out.println("¡Tu perro tiene muchas ganas de salir a pasear contigo!");
	}
}