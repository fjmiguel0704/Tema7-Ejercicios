package ejercicio2;

public class Libro {
	String titulo;
	String autor;
	int ejemplares;
	int prestados;

	public Libro() {
		// Constructor vacío
	}
	
	public Libro (String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	
	boolean prestamo () {
		boolean estado = false;
		if (ejemplares>0) {
			estado = true;
			prestados+=1;
			ejemplares-=1;
		}
		
		return estado;
	}
	
	boolean devolucion () {
		boolean estado = false;
		if (prestados>0) {
			estado=true;
			ejemplares+=1;
			prestados-=1;
		}
		
		return estado;
	}
	
	public String toString() {
		String imprime;
		imprime = "Libro a prestar: " + titulo + "\n" + "Autor: " + autor + "\n" + "Ejemplares disponibles: " + ejemplares + "\n" + "Libros prestados: " + prestados;
		return imprime;
	}
}
