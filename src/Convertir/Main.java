package Convertir;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner (System.in);
		
		int opt;
		BytestoKilobytes p = new BytestoKilobytes();
		KilobytestoMegabytes g = new KilobytestoMegabytes();
		
		do {
		System.out.println("Seleccione un opcion: \n");
		System.out.println("1. Convertir Bytes a Kilobytes");
		System.out.println("2. Convertir Kilobytes a Bytes");
		System.out.println("3. Salir\n");
		
		opt = lector.nextInt();
		
		switch(opt) {
		case 1:
			p.Bytes();
			break;
		case 2:
			g.Kilobytes();
			break;
		case 3:
			break;
		default:
			System.out.println("Error error");
			System.out.println("Usted ha seleccionado la opcion incorrecta");
		}
	}while(opt!=3);
	}
	
}
