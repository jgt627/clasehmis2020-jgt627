package ual.hmis.sesion07.ejercicion01;

/**
 * @author mi-cu
 *
 */
public class Ejercicio1 {

	/**
	 * @param x
	 * @return resultado
	 */
	public int transformar(final int x) {
		int resultado = 0;
		final int dos = 2;
		final int tres = 3;
		final int cinco = 5;
		if (x % dos == 0) {
			resultado = transformar(x / dos);
		} else if (x % tres == 0) {
			resultado = transformar(x / tres);
		} else if (x % cinco == 0) {
			resultado = transformar(x / cinco);
		} else {
			return x;
		}
		return resultado;
	}
}
