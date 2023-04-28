package ejercicio03;

public class Perecederos extends Productos {
	private int diasACaducar = 0;

	public Perecederos(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	@Override
	public String toString() {
		return super.getNombre() + ": Producto perecedero que cuesta " + super.getPrecio() + " y caduca en "
				+ diasACaducar + " días.";

	}

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
			System.out.println("No se aplica descuento, ya que quedan " + diasACaducar
					+ " días hasta de que el producto caduque.");
		}
		return precio;
	}

}
