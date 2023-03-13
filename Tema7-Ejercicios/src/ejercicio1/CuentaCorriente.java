package ejercicio1;

public class CuentaCorriente {
	String DNI;
	String nombre;
	double saldo;

	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
	}

	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	boolean sacarDinero(double cantidad) {
		boolean resultado = false;
		if (cantidad <= saldo) {
			resultado = true;
			saldo -= cantidad;
		}

		return resultado;
	}
	
	double ingresarDinero(double cantidad) {
		saldo+=cantidad;
		return saldo;
	}
	
	 public String toString () {
		String informacion;
		informacion = "DNI: " + DNI +"\n" + "Nombre completo: " + nombre + "\n" + "Saldo disponible: " + saldo;
		return informacion;
	}
}
