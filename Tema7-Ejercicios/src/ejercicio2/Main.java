package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
		
		Scanner read = new Scanner (System.in);
		
		Libro objeto = new Libro();
		
		System.out.println("Cuántos ejemplares disponibles hay: ");
		objeto.ejemplares=read.nextInt();
		
		System.out.println("Cuántos préstamos ha hecho: ");
		objeto.prestados=read.nextInt();
		
		System.out.println("1. Dar libro");
		System.out.println("2. Recoger libro");
		opcion=read.nextInt();
		read.nextLine();
		
		switch (opcion) {
		case 1: {
			System.out.println("Introduce el título del libro que quieres solicitar: ");
			objeto.titulo=read.nextLine();
			
			System.out.println("Introduce el nombre del autor del libro que quieres solicitar: ");
			objeto.autor=read.nextLine();
			
			objeto.prestamo();
			break;
		}
		case 2: {
			System.out.println("Introduce el título del libro que quieres devolver: ");
			objeto.titulo=read.nextLine();
			
			System.out.println("Introduce el nombre del autor del libro que quieres devolver: ");
			objeto.autor=read.nextLine();
			
			objeto.devolucion();
			break;
		}
		default:
			System.out.println("La opción introducida no es correcta");
		}
		
		System.out.println(objeto.toString());
	}

}
