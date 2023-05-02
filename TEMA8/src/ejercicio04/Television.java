package ejercicio04;

/**
 * Clase de 'Television'. En ella se definen los atributos y funciones de estos
 * objetos. Hereda de 'Electrodoméstico'
 * 
 * @author Admin
 *
 */
public class Television extends Electrodomestico {
	/**
	 * Atributo privado 'resolución'
	 */
	private int resolucion = 20;
	/**
	 * Atributo privado 'TDT'
	 */
	private boolean TDT = false;

	/**
	 * Constructor que aplica a los objetos Television que lo llamen todos los
	 * valores posibles
	 * 
	 * @param peso       Peso de la television
	 * @param precioBase Precio base de la television
	 * @param consumo    Consumo de la television
	 * @param color      Color de la television
	 * @param resolucion Resolución de la television
	 * @param tdt        tdt de la television
	 */
	public Television(int peso, double precioBase, char consumo, String color, int resolucion, boolean tdt) {
		super(peso, precioBase, consumo, color);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		TDT = tdt;
	}

	/**
	 * Constructor vacío o por defecto
	 */
	public Television() {
		super();
	}

	/**
	 * Constructor que aplica a los objetos Television que lo llamen un valor de
	 * peso y precio base
	 * 
	 * @param peso       Peso de la television
	 * @param precioBase Precio de la television
	 */
	public Television(int peso, double precioBase) {
		super(peso, precioBase);
	}

	/**
	 * Setter de la resolución de la television
	 * 
	 * @param resolucion Resolución que debe asignar al objeto que lo llama
	 */
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	/**
	 * setter del tdt de la television
	 * 
	 * @param tdt Valor booleano que indica si la televisión tiene o no TDT
	 */
	public void setTDT(boolean tdt) {
		TDT = tdt;
	}

	/**
	 * Método para calcular el valor de la televisión heredado de
	 * 'Electrodoméstico'. Funciona igual que el de la clase padre, pero se añaden
	 * la resolución y el TDT a las consideraciones tomadas
	 * 
	 * @return Devuelve el precio calculado de la television
	 */
	@Override
	double precioFinal() {
		double precio = 0;

		if (resolucion > 40) {
			precio += super.precioBase * 1.3 - super.precioBase;
		}
		if (TDT == true) {
			precio += 50;
		}

		return super.precioFinal() + precio;
	}

}
