package ual.hmis.sesion07.ejercicion05;

import java.util.ArrayList;

/**
 * @author mi-cu
 *
 */
public class Actividad {
	/**
	 *
	 */
	private String nombre; // nombre de la actividad
	/**
	 *
	 */
	private ArrayList<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
	/**
	 *
	 */
	private boolean apta;
	/**
	 *
	 */
	private double puntuacionTotal;

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
	 * @return ejercicios
	 */
	public ArrayList<Ejercicio> getEjercicios() {
		return ejercicios;
	}

	/**
	 * @param ejerciciosNuevos
	 */
	public void setEjercicios(final ArrayList<Ejercicio> ejerciciosNuevos) {
		this.ejercicios = ejerciciosNuevos;
	}

	/**
	 * @return apta
	 */
	public boolean isApta() {
		return apta;
	}

	/**
	 * @param esApta
	 */
	public void setApta(final boolean esApta) {
		this.apta = esApta;
	}

	/**
	 * @return puntuacionTotal
	 */
	public double getPuntuacionTotal() {
		return this.puntuacionTotal;
	}

	/**
	 * @param value
	 */
	public void setPuntuacionTotal(final double value) {
		this.puntuacionTotal = value;
	}

	/**
	 * @param nombreEjercicio
	 * @param puntuacion
	 */
	public void agregarEjercicioCalificado(
			final String nombreEjercicio, final double puntuacion) {

		Ejercicio nuevoEjercicio = new Ejercicio();

		nuevoEjercicio.setNombre(nombreEjercicio);
		nuevoEjercicio.setPuntuacion(puntuacion);

		ejercicios.add(nuevoEjercicio);
	}

	/**
	 * @return toString
	 */
	public String toString() {
		return this.nombre + " " + this.puntuacionTotal
				+ " " + (apta ? "apta" : "no apta");
	}
}
