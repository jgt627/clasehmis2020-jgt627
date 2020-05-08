package ual.hmis.sesion07.ejercicion03;

/**
 * @author mi-cu
 *
 */
public class Ejercicio3 {

	/**
	 * @param numAsteriscos
	 * @return asteriscos
	 */
	public String escrituraDeAsteriscos(final int numAsteriscos) {
		String asteriscos = "";
		final int a = 5;
		final int b = 12;
		if (numAsteriscos < 0) {
			asteriscos = "número erróneo";
		} else if (numAsteriscos < a) {
			asteriscos = "*****";
		} else if (numAsteriscos > b) {
			asteriscos = "************";
		} else {
			for (int i = 0; i < numAsteriscos; i++) {
				asteriscos += "*";
			}
		}
		return asteriscos;
	}
}
