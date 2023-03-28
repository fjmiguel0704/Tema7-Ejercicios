package ejercicio3;

import java.util.Arrays;

/**
 * Esta clase guardará información de dos coordenadas (x e y ), y desplazarán
 * sus valores a los nuevos que se les pase. Además calculará la distancia que
 * hay entre el eje principal y otro también pasado. Devolverá el valor actual
 * de las corrdenadas x e y después de desplazar sus valores y la distancia
 * entre dos ejes
 * 
 * @author fjmiguel
 *
 */
public class Punto {
	/**
	 * Valor coordenada x
	 */
	int x;
	/**
	 * Valor coordenada y
	 */
	int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Este método imprime, bien el resultado de las coordenadas después de
	 * desplazar sus valore o la distancia entre dos de ellas
	 * 
	 * @return x e y
	 */
	String imprime() {
		String resultado;
		resultado = "(" + x + ", " + y + ")";
		return resultado;
	}

	/**
	 * Este método modifica el valor de las coordenadas x e y
	 * 
	 * @param x valor de coordenada
	 * @param y valor de coordenada
	 */
	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Este método actualizará el valor de las coordenadas x e y al pasarle por
	 * parámetro dos valores
	 * 
	 * @param dx valor a desplazar la coordenada x
	 * @param dy valor a desplazar la coordenada y
	 */
	void desplaza(int dx, int dy) {
		x += dx;
		y += dy;
	}

	/**
	 * Este método devolverá el resultado de calcular la distancia entre dos ejes de
	 * coordenadas
	 * 
	 * @param p eje para calcular distancia
	 * @return resultado de la distancia
	 */
	double distancia(Punto p) {
		double result;
		result = Math.sqrt((Math.pow(p.x - this.x, 2)) + (Math.pow(p.y - this.y, 2)));
		return result;
	}
}
