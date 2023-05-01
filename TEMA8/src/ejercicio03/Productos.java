package ejercicio03;

/**
 * Clase 'Productos', en ella se definen los atributos y métodos necesarios para
 * operar con estos objetos
 * 
 * @author Admin
 *
 */
public class Productos {
	/**
	 * Atributo privado 'nombre'
	 */
	private String nombre = "";
	/**
	 * Atributo privado 'precio'
	 */
	private double precio = 0;

	/**
	 * Constructor de 'Productos', asigna valores a los objetos de este tipo
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Getter del nombre del objeto
	 * 
	 * @return Devuelve el nombre del objeto que lo llama
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre del objeto
	 * 
	 * @param nombre Nombre a asignar del producto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del precio del objeto
	 * 
	 * @return Devuelve el precio del objeto que lo llama
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Setter del precio del objeto
	 * 
	 * @param precio Precio a asignar del producto
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Método toString que devuelve los datos del objeto producto que lo llama
	 */
	@Override
	public String toString() {
		return nombre + ": Producto que cuestra " + precio;
	}

	/**
	 * Método que calcula el precio de varios productos del mismo tipo
	 * 
	 * @param numProds Recibe por parámetros el número de productos que se compran
	 * @return Devuelve un precio calculado
	 */
	public double calcular(int numProds) {
		double precio = numProds * this.precio;

		return precio;
	}

}
