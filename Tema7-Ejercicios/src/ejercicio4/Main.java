package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int descuento;

		Scanner read = new Scanner(System.in);

		Articulo objeto = new Articulo("Keyboard", 5, 9);

		while (!objeto.nombre.isEmpty() && objeto.precio >0 && objeto.cuantosQuedan > 0) {
			System.out.println("Introduce el descuento que desea aplicarle al artículo: ");
			descuento = read.nextInt();
			objeto.getPVP();
			objeto.getPVPDescuento(descuento);
			objeto.vender(5);
			objeto.almacenar(2);
			System.out.println(objeto.imprime());
			break;
		}

	}

}
