package ejercicio03;

/**
 * Clase de productos 'NoPerecederos'. En ella se definen sus atributos y
 * métodos. Hereda de 'Productos'
 * 
 * @author Admin
 *
 */
public class NoPerecederos extends Productos {
	/**
	 * Atributo privado que representa el tipo de producto
	 */
	private String tipo = "";

	/**
	 * Constructor de NoPerecederos. Le asigna valores a este tipo de productos
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 * @param tipo   Tipo de producto
	 */
	public NoPerecederos(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	/**
	 * Getter del tipo de producto
	 * 
	 * @return Devuelve el tipo de producto del objeto que lo llama
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Setter del tipo de producto
	 * 
	 * @param tipo Recibe el tipo que debe asignar al objeto
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método toString que muestra los datos del producto no perecedero
	 */
	@Override
	public String toString() {
		return super.getNombre() + ": Producto no perecedero tipo " + tipo + ", cuesta " + super.getPrecio();
	}

	/**
	 * Método calcular heredado de 'Producto', no tiene alteraciones
	 * 
	 * @param numProds Recibe por parámetros el número de productos que se compran
	 * @return Devuelve un precio calculado
	 */
	@Override
	public double calcular(int numProds) {
		return super.calcular(numProds);
	}
}
