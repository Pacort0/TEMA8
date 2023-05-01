package ejercicio05;

/**
 * Clase 'Rectangulo. Se definen los atributos y métodos del objeto. Hereda de
 * Poligono
 * 
 * @author Admin
 *
 */
public class Rectangulo extends Poligono {
	/**
	 * Atributo privado base, determina las medidas horizontales del rectángulo
	 */
	private double base = 0;
	/**
	 * Atributo privado altura, determina las medidas verticales del rectángulo
	 */
	private double altura = 0;

	/**
	 * Constructor de Rectangulo que asigna a los objetos que lo llaman los valores
	 * pertinentes
	 * 
	 * @param numLados Número de lados del polígono
	 * @param base     Base del polígono
	 * @param altura   Altura del polígono
	 */
	public Rectangulo(int numLados, double base, double altura) {
		super(numLados);
		if (base > 0) {
			this.base = base;
		}
		if (base > 0) {
			this.altura = altura;
		}
	}

	/**
	 * getter de la base del rectángulo
	 * @return Devuelve la base del objeto rectángulo que lo llama
	 */
	public double getBase() {
		return base;
	}

	/**
	 * setter de la base del rectángulo
	 * @param base Valor de la base que debe asignar al objeto que lo llama
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * getter de la altura del rectángulo
	 * @return Devuelve la altura del objeto rectángulo que lo llama
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * setter de la altura del rectángulo
	 * @param altura Valor de la altura que debe asignar al objeto que lo llama
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Función área heredada de 'Poligono'
	 * Se calcula el área del poligono
	 * 
	 * @return Devuelve la medida del área
	 */
	@Override
	double area() {
		double area = 0;

		area = base * altura;

		return area;
	}

	/**
	 * Método toString que muestra los datos del polígono
	 */
	@Override
	public String toString() {
		return super.toString() + " La base vale " + base + " y la altura vale " + altura;
	}

}
