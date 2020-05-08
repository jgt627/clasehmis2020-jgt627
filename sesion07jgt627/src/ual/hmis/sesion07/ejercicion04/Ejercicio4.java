package ual.hmis.sesion07.ejercicion04;

/**
 * @author mi-cu
 *
 */
public class Ejercicio4 {
	/**
	 * @param p1
	 * @param p2
	 * @return resultado
	 */
	public String caracteresIguales(final String p1, final String p2) {
		String resultado = "";
		for (int i = 0; i < p1.length(); i++) {
			for (int j = 0; j < p2.length(); j++) {
				if (p1.charAt(i) == p2.charAt(j)) {
					resultado += p1.charAt(i);
				}
			}
		}
		return resultado;
	}
}
