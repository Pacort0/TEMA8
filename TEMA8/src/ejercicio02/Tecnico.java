package ejercicio02;

public class Tecnico extends Operario{

	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Tecnico [toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
