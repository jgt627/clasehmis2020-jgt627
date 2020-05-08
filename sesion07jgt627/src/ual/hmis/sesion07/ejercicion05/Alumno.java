package ual.hmis.sesion07.ejercicion05;

import java.util.ArrayList;

/**
 * @author mi-cu
 *
 */
public class Alumno {
	/**
	 *
	 */
	private String nombre;
	/**
	 *
	 */
	private ArrayList<Actividad> actividadesAsignadas
	= new ArrayList<Actividad>();

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
	 * @return actividadesAsignadas
	 */
	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	/**
	 * @param actividadesAsignadasNuevas
	 */
	public void setActividadesAsignadas(
			final ArrayList<Actividad> actividadesAsignadasNuevas) {
		this.actividadesAsignadas = actividadesAsignadasNuevas;
	}

	/**
	 * @return nombre
	 */
	public String toString() {
		return this.nombre;
	}

	/**
	 * @param nombreActividad
	 * @return suma
	 */
	public double calcularNotaActividad(final String nombreActividad) {
		double suma = 0.0;
		for (Actividad a : this.actividadesAsignadas) {
			if (a.getNombre().equals(nombreActividad)) {
				for (Ejercicio e : a.getEjercicios()) {
					suma += e.getPuntuacion();
				}
				a.setPuntuacionTotal(suma);
			}
		}
		return suma;
	}

	/**
	 * @param nota
	 * @return String
	 */
	public String calificacion(final double nota) {
		final double a = 0.0;
		final double b = 5.0;
		final double c = 7.0;
		final double d = 9.0;
		final double e = 10.0;
		if (nota >= a && nota < b) {
			return "Suspenso";
		}
		if (nota >= b && nota < c) {
			return "Aprobado";
		}
		if (nota >= c && nota < d) {
			return "Notable";
		}
		if (nota >= d && nota < e) {
			return "Sobresaliente";
		}
		if (nota == e) {
			return "Matrícula";
		}
		return "Error en la nota";
	}

	/**
	 * @param anyoNacimiento
	 * @return String
	 */
	public String cursoSegunEdad(final int anyoNacimiento) {
		final int a = 2017;
		final int b = 2016;
		final int c = 2015;
		final int d = 2014;
		final int e = 2013;
		final int f = 2012;
		final int g = 2011;
		final int h = 2010;
		final int i = 2009;
		final int j = 2008;
		final int k = 2007;
		final int l = 2006;
		final int m = 2005;
		switch (anyoNacimiento) {
		case a:
			return "1º Educación Infantil";
		case b:
			return "2º Educación Infantil";
		case c:
			return "3º Educación Infantil";
		case d:
			return "1º Educación Primaria";
		case e:
			return "2º Educación Primaria";
		case f:
			return "3º Educación Primaria";
		case g:
			return "4º Educación Primaria";
		case h:
			return "5º Educación Primaria";
		case i:
			return "6º Educación Primaria";
		case j:
			return "1º Educación Secundaria";
		case k:
			return "2º Educación Secundaria";
		case l:
			return "3º Educación Secundaria";
		case m:
			return "4º Educación Secundaria";
		default: return "";

		}
	}
}
