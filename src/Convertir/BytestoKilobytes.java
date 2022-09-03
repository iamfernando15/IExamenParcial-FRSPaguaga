package Convertir;

import java.util.Scanner;

public class BytestoKilobytes {

	Scanner lector = new Scanner(System.in);
	double v, r;
	
	public void Bytes() {
		System.out.print("Ingrese el numero de Bytes a convertir: ");
		v = lector.nextDouble();
		
		r = v / 1000; 
		
		System.out.println(v+" Equivalen a " +r+ " Kilobytes");
	}
	
}
