package ejercicio3;

import java.util.Arrays;

public class Punto {
	int x;
	int y;
	
	public Punto (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void imprime () {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	void setXY (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void desplaza (int dx, int dy) {
		x+=dx;
		y+=dy;
	}
	
	void distancia (Punto p) {
		System.out.println((p.x-this.x)+(p.y-this.y));
	}
}
