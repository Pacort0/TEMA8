package ejercicio03;

public class NoPerecederos extends Productos {
	private String tipo = "";

	public NoPerecederos(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.getNombre() + ". Producto no perecedero tipo " + tipo + ", cuesta " + super.getPrecio();
	}

	@Override
	public double calcular(int numProds) {
		return super.calcular(numProds);
	}
}
