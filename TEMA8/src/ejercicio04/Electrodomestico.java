package ejercicio04;

/**
 * Clase 'Electrodomestico'. En ella se definen los atributos y métodos de estos
 * objetos
 * 
 * @author Admin
 *
 */
public class Electrodomestico {
	/**
	 * Enumerado que guarda los posibles valores de consumo de un electrodomestico
	 * 
	 * @author Admin
	 *
	 */
	enum Consumo {
		A, B, C, D, E, F
	}

	/**
	 * Enumerado que guarda los posibles colores de un electrodomestico
	 * 
	 * @author Admin
	 *
	 */
	enum Color {
		blanco, negro, rojo, azul, gris
	}

	/**
	 * Atributo protegido 'peso'. Inicialmente vale 5
	 */
	protected int peso = 5;
	/**
	 * Atributo protegido 'precioBase'. Inicialmente vale 100
	 */
	protected double precioBase = 100;
	/**
	 * Atributo protegido 'consumo'. Es del tipo enumerado 'Consumo'. Inicialmente
	 * vale 'F'
	 */
	protected Consumo consumo = Consumo.F;
	/**
	 * Atributo protegido 'color'. Es del tipo enumerado 'Color'. Inicialmente vale
	 * 'blanco'
	 */
	protected Color color = Color.blanco;

	/**
	 * Constructor de objetos 'Electrodomésticos' vacío
	 */
	public Electrodomestico() {
	}

	/**
	 * Constructor de objetos 'Electrodoméstico' que asigna valores de peso y
	 * precioBase a los objetos
	 * 
	 * @param peso       Peso del electrodoméstico
	 * @param precioBase Precio base del electrodoméstico
	 */
	public Electrodomestico(int peso, double precioBase) {
		if (peso > 0) {
			this.peso = peso;
		}
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	/**
	 * Constructor de objetos 'Electrodoméstico' que asigna todos los valores
	 * posibles a los objetos
	 * 
	 * @param peso       Peso del electrodoméstico
	 * @param precioBase Precio base del electrodoméstico
	 * @param consumo    Consumo del electrodoméstico
	 * @param color      Color del electrodoméstico
	 */
	public Electrodomestico(int peso, double precioBase, char consumo, String color) {
		String cambio;

		if (peso > 0) {
			this.peso = peso;
		}
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (comprobarConsumoEnergetico(consumo)) {
			cambio = String.valueOf(consumo);
			this.consumo = Consumo.valueOf(cambio);
		}

		this.color = Color.valueOf(color);
	}

	/**
	 * setter del peso del electrodoméstico
	 * 
	 * @param peso Peso a asignar al objeto
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * setter del precio base del electrodoméstico
	 * 
	 * @param precioBase Precio base a asignar al objeto
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * setter del consumo del electrodoméstico
	 * 
	 * @param consumo Consumo a asignar al objeto
	 */
	public void setConsumo(String consumo) {
		this.consumo = Consumo.valueOf(consumo);
	}

	/**
	 * setter del color del electrodoméstico
	 * 
	 * @param color Color a asignar al objeto
	 */
	public void setColor(String color) {
		this.color = Color.valueOf(color);
	}

	/**
	 * Método que comprueba e informa de que se haya introducido la letra correcta
	 * en el consumo
	 * 
	 * @param letra Consumo del electrodoméstico
	 * @return Devuelve un valor booleano en función de si la letra es correcta o no
	 */
	boolean comprobarConsumoEnergetico(char letra) {
		boolean letraCorrecta = false;

		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			letraCorrecta = true;
		}

		return letraCorrecta;
	}

	/**
	 * Método que comprueba e informa de que se haya introducido un color existente
	 * en el campo 'color'
	 * 
	 * @param color Color del electrodoméstico
	 * @return Devueve un valor booleano en función de si el color es correcto o no
	 */
	boolean comprobarColor(String color) {
		boolean colorCorrecto = false;

		if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("azul")
				|| color.equalsIgnoreCase("rojo")) {
			colorCorrecto = true;
		}

		return colorCorrecto;
	}

	/**
	 * Calcula el precio final en función de las características del
	 * electrodoméstico
	 * 
	 * @return Devuelve un precio calculado del electrodoméstico
	 */
	double precioFinal() {
		double precio = 0;

		switch (consumo) {
		case A:
			precio = precioBase + 100;
			break;
		case B:
			precio = precioBase + 80;
			break;
		case C:
			precio = precioBase + 60;
			break;
		case D:
			precio = precioBase + 50;
			break;
		case E:
			precio = precioBase + 30;
			break;
		default:
			precio = precioBase + 10;
		}

		if (peso > 0 && peso < 20) {
			precio += 10;
		} else if (peso >= 20 && peso < 50) {
			precio += 50;
		} else if (peso >= 50 && peso < 80) {
			precio += 80;
		} else {
			precio += 100;
		}

		return precio;
	}

}
