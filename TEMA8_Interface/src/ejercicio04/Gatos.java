package ejercicio04;

public class Gatos extends AnimalDomestico{

	public Gatos(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	public void hacerRuido() {
		System.out.println("Miau! Miau!");
	}
	
	public boolean hacerCaso() {
		boolean caso = false;
		int probabilidad = (int)Math.random()*100;
		
		if(probabilidad >= 0 && probabilidad < 5) {
			caso = true;
		}
		
		return caso;
	}
	
	public void toserBolaPelo() {
		System.out.println("¡Tu gato tiene muchas ganas de toser una bola de pelo!");
	}
}