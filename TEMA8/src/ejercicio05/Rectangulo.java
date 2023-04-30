package ejercicio05;

public class Rectangulo extends Poligono{
	double base = 0;
	double altura = 0;

	public Rectangulo(int numLados, double base, double altura) {
		super(numLados);
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	double area() {
		double area = 0;
		
		area = base * altura;
		
		return area;
	}

	@Override
	public String toString() {
		return super.toString() + " La base vale " + base + " y la altura vale " + altura;
	}

}
