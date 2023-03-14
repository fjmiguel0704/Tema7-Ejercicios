package ejercicio3;

import java.util.Arrays;

public class Punto {
	int x;
	int y;
	
	public Punto (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	String imprime () {
		String resultado;
		resultado = "(" + x + ", " + y + ")";
		return resultado;
	}
	
	void setXY (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void desplaza (int dx, int dy) {
		x+=dx;
		y+=dy;
	}
	
	double distancia (Punto p) {
		double result;
		result = Math.sqrt((Math.pow(p.x-this.x, 2))+(Math.pow(p.y-this.y, 2)));
		return result;
	}
}
