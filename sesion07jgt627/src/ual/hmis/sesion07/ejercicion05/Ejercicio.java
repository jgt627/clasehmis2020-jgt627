package ual.hmis.sesion07.ejercicion05;

/**
 * @author mi-cu
 *
 */
public class Ejercicio {
	/**
	 *
	 */
	private String nombre;
	/**
	 *
	 */
	private double puntuacion;

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombreNuevo
	 */
	public void setNombre(final String nombreNuevo) {
		this.nombre = nombreNuevo;
	}

	/**
	 * @return puntuacion
	 */
	public double getPuntuacion() {
		return puntuacion;
	}

	/**
	 * @param puntuacionNueva
	 */
	public void setPuntuacion(final double puntuacionNueva) {
		this.puntuacion = puntuacionNueva;
	}

	/**
	 * @return toString
	 */
	public String toString() {
		return this.nombre + " " + this.puntuacion;
	}
}
