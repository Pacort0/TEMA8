package ejercicio02;

/**
 * Clase 'Directivo', hereda de la clase 'Empleado'
 * 
 * @author Admin
 *
 */
public class Directivo extends Empleado {

	/**
	 * Constructor de 'Directivo', asigna valores al objeto
	 * 
	 * @param nombre Recibe por parámetros el nombre del directivo
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString que llama al toString padre e imprime el nombre de la clase
	 * 'Directivo'
	 */
	@Override
	public String toString() {
		return super.toString() + " --> Directivo";
	}

}
