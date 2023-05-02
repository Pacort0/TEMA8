package ejercicio03;

public class Polideportivo implements instalacion, edificio{
	protected String nombre;
	protected double superficie;
	
	public Polideportivo(String nombre, double superficie) {
		super();
		this.nombre = nombre;
		this.superficie = superficie;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public int getTipoInstalacion() {
		
		return 0;
	}

	@Override
	public double getSuperficieEdificio() {
		
		return superficie;
	}

	public String getNombre() {
		return nombre;
	}

}