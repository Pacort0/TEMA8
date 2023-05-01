package ejercicio02;

/**
 * Clase 'Operario', hereda de 'Empleado'
 * 
 * @author Admin
 *
 */
public class Operario extends Empleado {

	/**
	 * Constructor de 'Operario', asigna valores a los objetos de este tipo
	 * 
	 * @param nombre
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString que muestra los datos de la clase y del empleado
	 */
	@Override
	public String toString() {
		return super.toString() + " --> Operario";
	}

}
