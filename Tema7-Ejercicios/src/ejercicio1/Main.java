package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Si desea ingresar o sacar dinero
		int opcion;

		// Cantidad a ingresar o sacar
		double cantidad = 0;

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Creamos el objeto, pasando como parámetro el DNI y el saldo
		CuentaCorriente objeto = new CuentaCorriente("", 0);

		// Solicitamos el DNI
		System.out.println("Introduce su DNI: ");
		objeto.DNI = read.nextLine();

		// Solicitamos el nombre
		System.out.println("Introduce su nombre completo: ");
		objeto.nombre = read.nextLine();

		// Solicitamos el saldo actual de la cuenta
		System.out.println("Introduce el saldo actual de su cuenta: ");
		objeto.saldo = read.nextDouble();

		// Le preguntamos que desea hacer
		System.out.println("1.  Ingresar Dinero");
		System.out.println("2.  Sacar Dinero");
		opcion = read.nextInt();

		// En caso de igresar dinero
		switch (opcion) {
		case 1: {
			// Le preguntamos la cantidad
			System.out.println("Cuánto dinero desea ingresar: ");
			cantidad = read.nextDouble();
			// Y llamamos al método que incrementa el saldo según la cantidad pasada
			objeto.ingresarDinero(cantidad);
			break;
		}

		// En caso de sacar
		case 2: {
			// Le preguntamos la cantidad
			System.out.println("Cuánto dinero desea sacar: ");
			cantidad = read.nextDouble();
			// Y llamamos al método que decrementa el saldo según la cantidad pasada
			objeto.sacarDinero(cantidad);
			break;
		}
		// Si la opción no es correcta, lo muestra
		default:
			System.out.println("La opción introducida no es correcta");
		}

		// Imprimimos la información del titular de la cuenta
		System.out.println(objeto.toString());
	}

}
