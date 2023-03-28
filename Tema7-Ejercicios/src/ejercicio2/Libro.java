package ejercicio2;

/**
 * Esta clase registrará la cantidad de ejemplares disponibles para prestar y
 * los prestados. Incrementando los ejemplares en caso de recoger un libro y
 * decrementando los prestado o viceversa. También devolverá la información del
 * libro que se presta o se recoge, además de la cantidad de ejemplares y
 * prestados actualizada
 * 
 * @author fjmiguel
 *
 */
public class Libro {
	
	/**
	 * Título del libro
	 */
	String titulo;
	/**
	 * Autor del libro
	 */
	String autor;
	/**
	 * Ejemplares disponibles
	 */
	int ejemplares;
	/**
	 * Prestados actuales
	 */
	int prestados;

	/**
	 * Constructor vacío
	 */
	public Libro() {

	}

	/**
	 * Constructor que asigna valores al título y autor del libro, y cantidad de
	 * ejemplares y prestados
	 * 
	 * @param titulo     del libro
	 * @param autor      del libro
	 * @param ejemplares disponibles
	 * @param prestados  actuales
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	/**
	 * Este método comprueba si hay ejemplares suficientes para poder prestar un
	 * libro. En caso de ser cierto, sumará uno a los prestados y restará uno a los
	 * ejemplares
	 * 
	 * @return true si se ha podido realizar la operación o false si no
	 */
	boolean prestamo() {
		boolean estado = false;
		if (ejemplares > 0) {
			estado = true;
			prestados += 1;
			ejemplares -= 1;
		}

		return estado;
	}

	/**
	 * Este método comprueba que haya algún libro prestado para poder recoger, y en
	 * caso de ser cierto, sumará uno a ejemplare y restará uno a los prestados
	 * 
	 * @return true si se ha podido realizar la operación o false si no
	 */
	boolean devolucion() {
		boolean estado = false;
		if (prestados > 0) {
			estado = true;
			ejemplares += 1;
			prestados -= 1;
		}

		return estado;
	}

	/**
	 * Este método devuelve la información de un libro que se ha prestado o se ha
	 * recogido, además de la cantidad de ejemplares y prestados actual
	 */
	public String toString() {
		String imprime;
		imprime = "Libro a prestar: " + titulo + "\n" + "Autor: " + autor + "\n" + "Ejemplares disponibles: "
				+ ejemplares + "\n" + "Libros prestados: " + prestados;
		return imprime;
	}
}
