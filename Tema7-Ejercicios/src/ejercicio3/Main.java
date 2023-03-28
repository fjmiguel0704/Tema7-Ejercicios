package ejercicio3;

public class Main {

	public static void main(String[] args) {
		// Creamos un objeto, al que le pasamos como parámetros al constructor las
		// siguientes coordenadas
		Punto objeto1 = new Punto(4, 5);

		// Creamos otro objeto, al que se le pasa como parámetro las siguientes
		// coordenadas
		Punto objeto2 = new Punto(7, -5);

		// Llamamos al metodo desplaza, pasándole las siguientes coordenadas
		objeto1.desplaza(2, 5);

		// Imprimimos el resultado de desplazar los valores del eje principal
		System.out.println(objeto1.imprime());

		// LLamamos al método distancia, pasándole como parametro las coordenadas del
		// objeto 2 creado
		objeto1.distancia(objeto2);

		// Imprimimos el resultado de calcular la distancia entre el objeto 1 y objeto 2
		System.out.println(objeto1.distancia(objeto2));
	}

}
