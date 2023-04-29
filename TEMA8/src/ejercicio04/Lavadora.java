package ejercicio04;

public class Lavadora extends Electrodomestico{
	private int carga = 5;

	public Lavadora() {
		super();
	}

	public Lavadora(int peso, double precioBase) {
		super(peso, precioBase);
	}

	public Lavadora(int peso, double precioBase, Consumo consumo, Color color, int carga) {
		super(peso, precioBase, consumo, color);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	@Override
	double precioFinal() {
		int precioExtra = 0;
		
		if(carga > 30) {
			precioExtra = 50;
		}
		
		return super.precioFinal() + precioExtra;
	}
	
}
