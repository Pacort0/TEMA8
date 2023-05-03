package ejercicio02;

/**
 * Clase 'Futbolista', en ella se definen los métodos y atributos de estos
 * objetos
 * 
 * @author frodriguez
 *
 */
public class Futbolista implements Comparable<Object> {
	/**
	 * Atributo entero, número de camiseta del jugador
	 */
	protected int numCam = 0;
	/**
	 * Atributo cadena, nombre del jugador
	 */
	protected String nombre = "";
	/**
	 * Atributo entero, edad del jugador
	 */
	protected int edad = 18;
	/**
	 * Atributo entero, número de goles del jugador
	 */
	protected int numGoles = 0;

	/**
	 * Constructor de futbolista, asigna a los objetos que lo llaman los valores
	 * pertinentes
	 * 
	 * @param numCam   Número de camiseta
	 * @param nombre   Nombre del jugador
	 * @param edad     Edad del jugador
	 * @param numGoles Número de goles del jugador
	 */
	public Futbolista(int numCam, String nombre, int edad, int numGoles) {
		if (numCam > 0 && numCam < 100) {
			this.numCam = numCam;
		}
		this.nombre = nombre;
		if (edad >= 18) {
			this.edad = edad;
		}
		if (numGoles > 0) {
			this.numGoles = numGoles;
		}
	}

	/**
	 * Método toString, imprime los datos de los objetos que lo llaman
	 */
	@Override
	public String toString() {
		return "Número de camiseta: " + numCam + ", nombre: " + nombre + ", edad: " + edad + ", numGoles: " + numGoles;
	}

	/**
	 * Método equals, devuelve true en caso de que el atributo elegido sea igual al
	 * atributo del objeto al que se compara, y false en caso contrario
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;

		Futbolista neymar = (Futbolista) obj;
		if (this.numCam == neymar.numCam && this.nombre.equalsIgnoreCase(neymar.nombre))
			iguales = true;

		return iguales;
	}

	/**
	 * Método compareTo, compara dos objetos en base a un atributo, y devuelve un
	 * entero positivo o negativo en función del resultado
	 */
	@Override
	public int compareTo(Object o) {
		int res = 0;
		Futbolista messi = (Futbolista) o;

		if (this.numCam > messi.numCam) {
			res = 1;
		} else if (this.numCam < messi.numCam) {
			res = -1;
		} else {
			if (this.nombre.compareToIgnoreCase(messi.nombre) > 0) {
				res = 1;
			} else {
				res = -1;
			}
		}

		return res;
	}

}