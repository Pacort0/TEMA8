package ejercicio05;

public abstract class Poligono {
	protected int numLados = 0;
	
	public Poligono(int numLados) {
		this.numLados = numLados;
	}

	public int getNumLados() {
		return numLados;
	}

	abstract double area();

	@Override
	public String toString() {
		String cadena = "El polígono es un " + getClass().getSimpleName() + " y tiene " + numLados + " lados.";
		
		return cadena;
	}
}

