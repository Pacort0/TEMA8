package ejercicio01;

/**
 * Clase 'Socio', en ella se definen los atributos y métodos de estos objetos
 * 
 * @author frodriguez
 *
 */
public class Socio implements Comparable<Object> {
	/**
	 * Atributo entero 'id', cada socio tiene uno único
	 */
	protected int id = 0;
	/**
	 * Atributo cadena 'nombre', es el nombre del socio
	 */
	protected String nombre = "";
	/**
	 * Atributo entero 'edad', es la edad del socio
	 */
	protected int edad = 18;

	/**
	 * Constructor para objetos 'Socio', les asigna los valores que se le pasen por
	 * parámetros
	 * 
	 * @param id     ID del socio
	 * @param nombre Nombre del socio
	 * @param edad   Edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * Método toString, muestra los datos del socio en cuestión
	 */
	@Override
	public String toString() {
		return "Id de socio = " + id + ", nombre = " + nombre + ", edad = " + edad;
	}

	/**
	 * Método implementado por la interfaz 'Comparable' Devuelve un número entero en
	 * función de si el objeto comparado es mayor o menor al objeto al que está
	 * siendo comparao
	 */
	@Override
	public int compareTo(Object o) {
		int res = 0;

		Socio elegido = (Socio) o;
		if (this.id > elegido.id) {
			res = 1;
		} else {
			res = -1;
		}

		return res;
	}

}