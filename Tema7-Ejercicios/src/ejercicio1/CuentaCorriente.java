package ejercicio1;

/**
 * Esta clase obtendrá el DNI, nombre y saldo de un titular de una cuenta y
 * devolverá sus datos con el saldo disponible de la cuenta
 * 
 * @author fjmiguel
 *
 */
public class CuentaCorriente {

	/**
	 * Guardará el DNI del cliente
	 */
	String DNI;
	/**
	 * Nombre del cliente
	 */
	String nombre;
	/**
	 * Saldo actual de la cuenta del cliente
	 */
	double saldo;

	/**
	 * Constructor que asigna valores a DNI y saldo de un titular
	 * 
	 * @param DNI   del titular
	 * @param saldo actual de la cuenta
	 */
	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
	}

	/**
	 * Constructor que asigna valores a DNI, nombre y saldo de un titular
	 * 
	 * @param DNI    del titular
	 * @param nombre del titular
	 * @param saldo  actual de la cuenta
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	/**
	 * Este método devolverá el saldo actual de la cuenta después de sacar una
	 * cantidad de dinero de la cuenta
	 * 
	 * @param cantidad a sacar
	 * @return saldo actual después de sacar el dinero
	 */
	boolean sacarDinero(double cantidad) {
		boolean resultado = false;
		if (cantidad <= saldo) {
			resultado = true;
			saldo -= cantidad;
		}

		return resultado;
	}

	/**
	 * Este método devolverá el saldo actual de la cuenta después de ingresar una
	 * cantidad de dinero
	 * 
	 * @param cantidad a ingresar
	 * @return el saldo actual después de ingresar el dinero
	 */
	double ingresarDinero(double cantidad) {
		saldo += cantidad;
		return saldo;
	}

	/**
	 * Este método devuelve la información de un titular de una cuenta de banco
	 */
	public String toString() {
		String informacion;
		informacion = "DNI: " + DNI + "\n" + "Nombre completo: " + nombre + "\n" + "Saldo disponible: " + saldo;
		return informacion;
	}
}
