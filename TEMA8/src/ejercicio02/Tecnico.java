package ejercicio02;

/**
 * Clase 'Tecnico', hereda de 'Operario'
 * 
 * @author Admin
 *
 */
public class Tecnico extends Operario {

	/**
	 * Constructor de 'Tecnico', asigna valores a los objetos de este tipo
	 * 
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString que muestra los datos de la clase y del empleado
	 */
	@Override
	public String toString() {
		return super.toString() + " --> " + getClass().getSimpleName();
	}
}
