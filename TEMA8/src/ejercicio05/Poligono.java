package ejercicio05;

/**
 * Clase abstracta 'Poligono'. Se definen los atributos y los métodos generales
 * de los polígonos
 * 
 * @author Admin
 *
 */
public abstract class Poligono {
	/**
	 * Atributo que determina el número de lados del poligono
	 */
	protected int numLados = 0;

	/**
	 * Constructor de 'Poligono'. Asigna a los objetos valores
	 * 
	 * @param numLados Número de lados del polígono
	 */
	public Poligono(int numLados) {
		if (numLados > 0) {
			this.numLados = numLados;
		}
	}

	/**
	 * Getter del número de lados del poligono
	 * 
	 * @return Devuelve el número de lados del objeto que le ha llamado
	 */
	public int getNumLados() {
		return numLados;
	}

	/**
	 * Método abstracto 'area'
	 * 
	 * @return Devuelve el área del polígono
	 */
	abstract double area();

	/**
	 * Método toString. Devuelve una cadena con los datos del objeto
	 */
	@Override
	public String toString() {
		String cadena = "El polígono es un " + getClass().getSimpleName() + " y tiene " + numLados + " lados.";

		return cadena;
	}
}
