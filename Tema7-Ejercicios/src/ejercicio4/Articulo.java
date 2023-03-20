package ejercicio4;

public class Articulo {
	String nombre = "";
	double precio;
	static final int IVA = 21;
	int cuantosQuedan;

	public Articulo(String nombre, double precio, int cuantosQuedan) {
		if (nombre.isEmpty()) {
			System.out.println("El nombre no es válido");
		} else {
			this.nombre = nombre;
		}
		
		if (precio <= 0.0) {
			System.out.println("El precio no es válido");
		} else {
			this.precio = precio;
		}
		
		if (cuantosQuedan <= 0) {
			System.out.println("La cantidad de artículos disponible no es válida");
		} else {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public String imprime() {
		String resultado = "";
		resultado = "Nombre Artículo: " + nombre + "\n" + "Precio Artículo: " + precio + "€" + "\n" + "IVA: " + IVA + "%" + "\n"
				+ "Disponibles: " + cuantosQuedan;
		return resultado;
	}
	
	double getPVP () {
		precio = precio + ((precio*IVA)/100);
		return precio;
	}
	
	double getPVPDescuento (int descuento) {
		precio = precio - ((precio*descuento)/100);
		return precio;
	}
	
	boolean vender (int cantidad) {
		boolean estado = false;
		if (cuantosQuedan>=cantidad) {
			estado = true;
			cuantosQuedan-=cantidad;
		}
		
		return estado;
	}
	
	void almacenar (int cantidad) {
		cuantosQuedan+=cantidad;
	}
}
