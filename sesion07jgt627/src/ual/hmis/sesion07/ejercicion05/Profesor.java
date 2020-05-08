package ual.hmis.sesion07.ejercicion05;

import java.util.ArrayList;

/**
 * @author mi-cu
 *
 */
public class Profesor {
	/**
	 *
	 */
	private ArrayList<Alumno> alumnosDePracticas;

	/**
	 * @return alumnosDePracticas
	 */
	public ArrayList<Alumno> getAlumnosDePracticas() {
		return alumnosDePracticas;
	}

	/**
	 * @param alumnosDePracticasNuevos
	 */
	public void setAlumnosDePracticas(final
			ArrayList<Alumno> alumnosDePracticasNuevos) {
		this.alumnosDePracticas = alumnosDePracticasNuevos;
	}

	/**
	 *
	 */
	public void calificarAlumnos() {
		final double notaDeCorte = 5;
		for (int i = 0; i < alumnosDePracticas.size(); i++) {
			for (int j = 0; j < alumnosDePracticas
					.get(i).getActividadesAsignadas()
					.size(); j++) {
				double suma = 0.0;
				for (int k = 0; k < alumnosDePracticas
						.get(i)
						.getActividadesAsignadas()
						.get(j).getEjercicios()
						.size(); k++) {
					double puntuacion = alumnosDePracticas
						.get(i)
						.getActividadesAsignadas()
						.get(j).getEjercicios()
						.get(k).getPuntuacion();
					suma += puntuacion;
				}

				if (suma >= notaDeCorte) {
					alumnosDePracticas.get(i)
					.getActividadesAsignadas()
					.get(j).setApta(true);
				} else {
					alumnosDePracticas.get(i)
					.getActividadesAsignadas()
					.get(j).setApta(false);
				}
			}
		}
	}
}
