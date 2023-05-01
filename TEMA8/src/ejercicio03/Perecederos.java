package ejercicio03;

/**
 * Clase de productos 'Perecederos', se definen los métodos y atributos de estos
 * objetos. Hereda de 'Productos'
 * 
 * @author Admin
 *
 */
public class Perecederos extends Productos {
	/**
	 * Atributo privado que representa los días que quedan hasta que el producto
	 * caduque
	 */
	private int diasACaducar = 0;

	/**
	 * Constructor de productos 'Perecederos', asigna valores a los objetos de este
	 * tipo
	 * 
	 * @param nombre       Nombre del producto
	 * @param precio       Precio del producto
	 * @param diasACaducar Días que le quedan al producto hasta que caduque
	 */
	public Perecederos(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	/**
	 * Getter de los días hasta que el producto caduque
	 * 
	 * @return Devuelve la cantidad de días pertinentes del producto que lo llama
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * Setter de los días que quedan hasta que el producto perezca
	 * 
	 * @param diasACaducar Recibe por parámetros la cantidad de días que le quedan
	 *                     al producto
	 */
	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	/**
	 * Método toString que muestra los datos del producto perecedero
	 */
	@Override
	public String toString() {
		return super.getNombre() + ": Producto perecedero que cuesta " + super.getPrecio() + " y caduca en "
				+ diasACaducar + " días.";

	}

	/**
	 * Método que calcula el precio del producto perecedero atendiendo a los
	 * descuentos que se aplican en funcion de los días que restan hasta que
	 * caduque. El descuento se aplica al precio calculado por la clase padre
	 * 
	 * @param Recibe por parámetros el número de productos que se van a vender
	 * @return Devuelve el precio final calculado
	 */
	@Override
	public double calcular(int numProds) {
		double precio = super.calcular(numProds);

		switch (diasACaducar) {
		case 1:
			precio /= 4;
			break;
		case 2:
			precio /= 3;
			break;
		case 3:
			precio /= 2;
			break;
		default:
			System.out.print("No se aplica descuento, el producto cuesta ");
		}
		return precio;
	}

}
