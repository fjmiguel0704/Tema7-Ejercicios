package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Descuento a aplicar al producto
		int descuento;

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Objeto, al que se le pasa como parametros al contructor el nombre del
		// artículo, precio y cantidad
		Articulo objeto = new Articulo("Keyboard", 5, 9);

		// Mientras el nombre del objeto no esté vacío y precio sea mayor a 0 y cantidad
		// mayor a 0
		while (!objeto.nombre.isEmpty() && objeto.precio > 0 && objeto.cuantosQuedan > 0) {
			// Pedimos el porcentaje del descuento a aplicar
			System.out.println("Introduce el porcentaje de descuento que desea aplicarle al artículo: ");
			descuento = read.nextInt();

			// Llamamos al método que aplica el IVA
			objeto.getPVP();

			// Llamamos al método que aplica el descuento
			objeto.getPVPDescuento(descuento);

			// Llamamos al método que actualiza la cantidad de stock según las ventas,
			// pasando como parámetro un total de 5 ventas
			objeto.vender(5);

			// Llamamos al método que actualiza la cantidad de stock según las unidades
			// almacenadas, pasando como parámetro un total de 2 unidades a almacenar
			objeto.almacenar(2);

			// Imprimimos la información del artículo
			System.out.println(objeto.imprime());
			break;
		}

	}

}
