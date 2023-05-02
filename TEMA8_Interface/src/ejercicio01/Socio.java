package ejercicio01;

public class Socio implements Comparable <Object> {
	protected int id = 0;
	protected String nombre = "";
	protected int edad = 18;
	
	public Socio(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Id de socio = " + id + ", nombre = " + nombre + ", edad = " + edad;
	}

	@Override
	public int compareTo(Object o) {
		int res = 0;
		
		Socio elegido = (Socio) o;
		if(this.id > elegido.id) {
			res = 1;
		} else {
			res = -1;
		}
		
		return res;
	}
	
	
}