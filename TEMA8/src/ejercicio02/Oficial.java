package ejercicio02;

/**
 * Clase 'Oficial', hereda de 'Operario'
 * 
 * @author Admin
 *
 */
public class Oficial extends Operario {

	/**
	 * Constructor de 'Oficial', asigna valores a los objetos de este tipo
	 * 
	 * @param nombre Recibe por parámetros el nombre del oficial
	 */
	public Oficial(String nombre) {
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
