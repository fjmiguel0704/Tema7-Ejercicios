package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Si desea dar o recoger un libro
		int opcion;

		// Sacanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Objeto que llama a la clase Libro
		Libro objeto = new Libro();

		// Introducimos la cantidad de ejemplares disponibles
		System.out.println("Cuántos ejemplares disponibles hay: ");
		objeto.ejemplares = read.nextInt();

		// Prestamos actuales
		System.out.println("Cuántos préstamos ha hecho: ");
		objeto.prestados = read.nextInt();

		// Le pedimos que desea hacer
		System.out.println("1. Dar libro");
		System.out.println("2. Recoger libro");

		// Leemos la opción
		opcion = read.nextInt();
		read.nextLine();

		switch (opcion) {
		// En caso de dar un libro
		case 1: {

			// Pedimos títuo del libro
			System.out.println("Introduce el título del libro que quieres solicitar: ");
			objeto.titulo = read.nextLine();

			// Autor del libro
			System.out.println("Introduce el nombre del autor del libro que quieres solicitar: ");
			objeto.autor = read.nextLine();

			// Y llamamos al método prestamo para realizar la acción
			objeto.prestamo();
			break;
		}

		// En caso de recoger un libro
		case 2: {

			// Pedimos títuo del libro
			System.out.println("Introduce el título del libro que quieres devolver: ");
			objeto.titulo = read.nextLine();

			// Autor del libro
			System.out.println("Introduce el nombre del autor del libro que quieres devolver: ");
			objeto.autor = read.nextLine();

			// Y llamamos al método devolución para realizar la acción
			objeto.devolucion();
			break;
		}

		// Si la opción intoducida no es correcta, lo mostrará
		default:
			System.out.println("La opción introducida no es correcta");
		}

		// Imprimimos la información del libro a prestar o recoger
		System.out.println(objeto.toString());
	}

}
