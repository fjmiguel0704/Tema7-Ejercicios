package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int descuento;
		
		Scanner read = new Scanner (System.in);
		
		Articulo objeto = new Articulo("Keyboard", 5, 9);
		
		System.out.println("Introduce el descuento que desea aplicarle al artículo: ");
		descuento=read.nextInt();
		
		objeto.getPVP();
		objeto.getPVPDescuento(descuento);
		System.out.println(objeto.imprime());

	}

}
