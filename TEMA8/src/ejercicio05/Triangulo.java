package ejercicio05;

/**
 * Clase 'Triangulo'. Se definen los atributos y métodos del objeto. Hereda de
 * Poligono
 * 
 * @author Admin
 *
 */
public class Triangulo extends Poligono {
	/**
	 * Primer lado del triángulo
	 */
	double lado1 = 0;
	/**
	 * Segundo lado del triángulo
	 */
	double lado2 = 0;
	/**
	 * Tercer lado del triángulo
	 */
	double lado3 = 0;

	/**
	 * Constructor de Triangulo. Asigna a los objetos que lo llaman los valores
	 * pertinentes
	 * 
	 * @param numLados Número de lados del polígono
	 * @param lado1    Primer lado
	 * @param lado2    Segundo lado
	 * @param lado3    Tercer lado
	 */
	public Triangulo(int numLados, double lado1, double lado2, double lado3) {
		super(numLados);
		if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
		}
	}

	/**
	 * Función área heredada de 'Poligono'
	 * Se calcula el área del poligono
	 * 
	 * @return Devuelve la medida del área
	 */
	@Override
	double area() {
		double area;
		double semiPeri;

		semiPeri = (lado1 + lado2 + lado3) / 2;
		area = Math.sqrt(semiPeri * (semiPeri - lado1) * (semiPeri - lado2) * (semiPeri - lado3));

		return area;
	}

	/**
	 * Método toString que muestra los datos del polígono
	 */
	@Override
	public String toString() {
		return super.toString() + " Sus lados miden " + lado1 + ", " + lado2 + " y " + lado3;
	}

}
