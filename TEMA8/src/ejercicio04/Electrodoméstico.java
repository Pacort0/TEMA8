package ejercicio04;

public class Electrodoméstico {
	enum Consumo {
		A, B, C, D, E, F
	}

	enum Color {
		blanco, negro, rojo, azul, gris
	}

	protected int peso = 5;
	protected double precioBase = 100;
	protected Consumo consumo = Consumo.F;
	protected Color color = Color.blanco;

	public Electrodoméstico() {
	}

	public Electrodoméstico(int peso, double precioBase) {
		if (peso > 0) {
			this.peso = peso;
		}
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	public Electrodoméstico(int peso, double precioBase, Consumo consumo, Color color) {
		this.peso = peso;
		this.precioBase = precioBase;
		this.consumo = consumo;
		this.color = color;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	private boolean comprobarConsumoEnergetico(char letra) {
		boolean letraCorrecta = false;

		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			letraCorrecta = true;
		}

		return letraCorrecta;
	}

	private boolean comprobarColor(String color) {
		boolean colorCorrecto = false;

		if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("azul")
				|| color.equalsIgnoreCase("rojo")) {
			colorCorrecto = true;
		}

		return colorCorrecto;
	}

	private double precioFinal() {
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

		return precio;
	}

}
