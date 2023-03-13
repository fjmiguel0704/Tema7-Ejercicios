package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
		double cantidad=0;
		
		Scanner read = new Scanner (System.in);
		
		CuentaCorriente objeto = new CuentaCorriente("", 0);
		
		System.out.println("Introduce su DNI: ");
		objeto.DNI=read.nextLine();
		
		System.out.println("Introduce su nombre completo: ");
		objeto.nombre=read.nextLine();
		
		System.out.println("Introduce el saldo actual de su cuenta: ");
		objeto.saldo=read.nextDouble();
		
		System.out.println("1.  Ingresar Dinero");
		System.out.println("2.  Sacar Dinero");
		opcion=read.nextInt();
		
		switch (opcion) {
		case 1: {
			System.out.println("Cuánto dinero desea ingresar: ");
			cantidad=read.nextDouble();
			objeto.ingresarDinero(cantidad);
			break;
		}
		case 2: {
			System.out.println("Cuánto dinero desea sacar: ");
			cantidad=read.nextDouble();
			objeto.sacarDinero(cantidad);
			break;
		}
		default:
			System.out.println("La opción introducida no es correcta");
		}
	
		System.out.println(objeto.toString());
	}

}
