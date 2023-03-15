package ejercicio4;

public class Articulo {
	String nombre;
	double precio;
	static final double IVA = 1.21;
	int cuantosQuedan;

	public Articulo(String nombre, double precio, int cuantosQuedan) {
		this.nombre = nombre;
		if (nombre == null) {
			System.out.println("El nombre no es válido");
		}
		this.precio = precio;
		if (precio == 0.0) {
			System.out.println("El precio no es válido");
		}
		this.cuantosQuedan = cuantosQuedan;
		if (cuantosQuedan <= 0) {
			System.out.println("La cantidad de artículos disponible no es válida");
		}
	}

	String imprime() {
		String resultado;
		resultado = "Nombre Artículo: " + nombre + "\n" + "Precio Artículo: " + precio + "\n" + "IVA: " + IVA + "\n"
				+ "Disponibles: " + cuantosQuedan;
		return resultado;
	}
	
	double getPVP () {
		return precio*=IVA;
	}
	
	double getPVPDescuento (int descuento) {
		precio = precio - (precio*descuento)/100;
		return precio;
	}
}
