package ejercicio05;

public class Triangulo extends Poligono{
	double lado1 = 0;
	double lado2 = 0;
	double lado3 = 0;

	public Triangulo(int numLados, double lado1, double lado2, double lado3) {
		super(numLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	double area() {
		double area;
		double semiPeri;
		
		semiPeri = (lado1 + lado2 +lado3) /2;
		area = Math.sqrt(semiPeri*(semiPeri - lado1)*(semiPeri - lado2)*(semiPeri - lado3));
		
		return area;
	}

	@Override
	public String toString() {
		return super.toString() + " Sus lados miden " + lado1 + ", " + lado2 + " y " + lado3;
	}
	
	

}


