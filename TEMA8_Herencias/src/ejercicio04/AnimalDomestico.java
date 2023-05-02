package ejercicio04;

public class AnimalDomestico implements Animal{
	private String nombre = "";
	private String raza = "";
	private double peso = 8;
	private String color = "";
	
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void comer() {		
	}

	@Override
	public void dormir() {		
	}

	@Override
	public void hacerRuido() {		
	}
	
	public void vacunar() {
		
	}
	
	public boolean hacerCaso() {
		
		return true;
	}

}
