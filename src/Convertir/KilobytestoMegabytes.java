package Convertir;

import java.util.Scanner;

public class KilobytestoMegabytes {

	Scanner lector = new Scanner(System.in);
	double v, r;
	
	public void Kilobytes() {
		System.out.print("Ingrese el numero de Kilobytes a convertir: ");
		v = lector.nextDouble();
		
		r = v / 1024; 
		
		System.out.println(v+" Equivalen a " +r+ " Megabytes");{
			
		}
}
}
