package ejercicio02;

public class Oficial extends Operario{

	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Oficial [toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
