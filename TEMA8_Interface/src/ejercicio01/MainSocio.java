package ejercicio01;

import java.util.Arrays;

public class MainSocio {

	public static void main(String[] args) {
		int res = 0;
		
		Socio s1 = new Socio(1, "Pepe Viyuela", 19);
		Socio s2 = new Socio(2, "Youssef En-Nessyri", 28);
		
		res = s1.compareTo(s2);
		System.out.println(res);
		
		Socio[] lista = new Socio[5];
		lista[0] = new Socio(5, "Fran Perea", 40);
		lista[1] = new Socio(2, "Alejandro Sanz", 53);
		lista[2] = new Socio(1, "Pablo Alborán", 48);
		lista[3] = new Socio(4, "Joaquín Sardina", 64);
		lista[4] = new Socio(5, "C Tangana", 32);
		
		for(Socio s : lista) {
			System.out.println(s.toString());
		}
		
		System.out.println();
		
		Arrays.sort(lista);
		
		System.out.println("ARRAY ORDENADO: \n");
		
		for(Socio s : lista) {
			System.out.println(s.toString());
		}
	}

}