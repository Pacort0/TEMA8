package ejercicio04;

public class Electrodomestico {
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

	public Electrodomestico() {
	}

	public Electrodomestico(int peso, double precioBase) {
		if (peso > 0) {
			this.peso = peso;
		}
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	public Electrodomestico(int peso, double precioBase, String consumo, String color) {
		this.peso = peso;
		this.precioBase = precioBase;
		this.consumo = Consumo.valueOf(consumo);
		this.color = Color.valueOf(color);
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setConsumo(String consumo) {
		this.consumo = Consumo.valueOf(consumo);
	}

	public void setColor(String color) {
		this.color = Color.valueOf(color);
	}

	boolean comprobarConsumoEnergetico(char letra) {
		boolean letraCorrecta = false;

		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			letraCorrecta = true;
		}

		return letraCorrecta;
	}

	boolean comprobarColor(String color) {
		boolean colorCorrecto = false;

		if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("azul")
				|| color.equalsIgnoreCase("rojo")) {
			colorCorrecto = true;
		}

		return colorCorrecto;
	}

	double precioFinal() {
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

		if (peso > 0 && peso < 20) {
			precio += 10;
		} else if (peso >= 20 && peso < 50) {
			precio += 50;
		} else if (peso >= 50 && peso < 80) {
			precio += 80;
		} else {
			precio += 100;
		}

		return precio;
	}

}
