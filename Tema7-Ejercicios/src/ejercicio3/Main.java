package ejercicio3;

public class Main {

	public static void main(String[] args) {
		Punto objeto1 = new Punto(4, 5);
		Punto objeto2 = new Punto(7, -5);
		
		objeto1.desplaza(2, 5);
		System.out.println(objeto1.imprime());
		objeto1.distancia(objeto2);
		System.out.println(objeto1.distancia(objeto2));
	}

}
