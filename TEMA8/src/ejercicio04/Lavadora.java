package ejercicio04;

/**
 * Clase 'Lavadora', en ella se definen sus atributos y métodos. Hereda de
 * 'Electrodoméstico'
 * 
 * @author Admin
 *
 */
public class Lavadora extends Electrodomestico {
	/**
	 * Atributo privado 'carga'. Por defecto vale 5
	 */
	private int carga = 5;

	/**
	 * Constructor vacío o por defecto
	 */
	public Lavadora() {
		super();
	}

	/**
	 * Constructor que aplica a los objetos Lavadora que lo llamen valores de peso y
	 * precioBase
	 * 
	 * @param peso       Peso de la lavadora
	 * @param precioBase Precio base de la lavadora
	 */
	public Lavadora(int peso, double precioBase) {
		super(peso, precioBase);
	}

	/**
	 * Constructor que aplica a los objetos Lavadora que lo llamen todos los valores
	 * posibles
	 * 
	 * @param peso       Peso de la lavadora
	 * @param precioBase Precio base de la lavadora
	 * @param consumo    Consumo de la lavadora
	 * @param color      Color de la lavadora
	 * @param carga      Carga de la lavadora
	 */
	public Lavadora(int peso, double precioBase, char consumo, String color, int carga) {
		super(peso, precioBase, consumo, color);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * Getter de la carga de la lavadora
	 * 
	 * @return Devuelve la carga del objeto lavadora que lo llama
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Método heredado de 'electrodoméstico' que calcula el precio final de la
	 * lavadora. Funciona igual que el de la clase padre, pero se añade la carga de
	 * la lavadora a las consideraciones tomadas
	 * 
	 * @return Devuelve un precio final de la lavadora
	 */
	@Override
	double precioFinal() {
		int precioExtra = 0;

		if (carga > 30) {
			precioExtra = 50;
		}

		return super.precioFinal() + precioExtra;
	}

}
