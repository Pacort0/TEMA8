package ejercicio03;

/**
 * Clase 'EdificioOficina'. En ella se definen los atributos y métodos de una oficina. Implementa la interfaz 'edificio'.
 * @author frodriguez
 *
 */
public class EdificioOficinas implements edificio {
	/**
	 * Atributo entero protegido 'numOficinas', es el número de oficinas del edificio
	 */
	protected int numOficinas = 0;
	/**
	 * Atributo entero privado 'superficie', va a guardar la superficie del edificio
	 */
	private double superficie = 0;
	
	/**
	 * Constante 'OFICINAMEDIA', representa el tamaño medio de una oficina en metros cuadrados
	 */
	private static final double OFICINAMEDIA = 3.5;

	/**
	 * Constructor de 'EdificioOficinas', asigna a los objetos que lo llaman los parámetros que se le pasan
	 * @param numOficinas Número de oficinas de un edificio
	 */
	public EdificioOficinas(int numOficinas) {
		super();
		this.numOficinas = numOficinas;
	}
	
	/**
	 * Método para calcular la superficie de un edificio
	 */
	@Override
	public double getSuperficieEdificio() {
		superficie = numOficinas*OFICINAMEDIA;
		
		return superficie;
	}

	/**
	 * Método getter para el número de oficinas
	 * @return Devuelve el número de oficinas del objeto que lo llama
	 */
	public int getNumOficinas() {
		return numOficinas;
	}

}
