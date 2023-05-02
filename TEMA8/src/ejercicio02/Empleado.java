package ejercicio02;

/**
 * Clase 'Empleado', en ella se definen los valores de un empleado
 * 
 * @author Admin
 *
 */
public class Empleado {
	/*
	 * Atributo privado 'nombre'
	 */
	private String nombre = "";

	/**
	 * Constructor por defecto
	 */
	public Empleado() {
	}

	/**
	 * Constructor de 'Empleado', asigna valores a los objetos de este tipo
	 * 
	 * @param nombre Recibe por parámetros el nombre del empleado
	 */
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del nombre del empleado
	 * 
	 * @return Devuelve el nombre del objeto empleado que lo llame
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre del empleado
	 * 
	 * @param nombre Recibe por parámetros el nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método toString que muestra los datos de la clase y del empleado
	 */
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}

}
