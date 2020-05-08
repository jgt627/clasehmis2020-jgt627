package ual.hmis.sesion07.ejercicion02;

/**
 * @author mi-cu
 *
 */
public class Ejercicio2 {

	/**
	 * @param username
	 * @param password
	 * @return boolean
	 */
	public boolean login(final String username, final String password) {
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		final int limite = 30;
		// Comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty()) {
			return false;
		}
		// Comprobar que la longitud sea < 30
		if (username.length() >= limite
				|| password.length() >= limite) {
			return false;
		}
		// Comprobar que password tenga mayúsculas, minúsculas y dígitos
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				cont1 += 1;
			}
			if (Character.isLowerCase(password.charAt(i))) {
				cont2 += 1;
			}
			if (Character.isDigit(password.charAt(i))) {
				cont3 += 1;
			}
		}
		if (cont1 == 0 || cont2 == 0 || cont3 == 0) {
			return false;
		}
		// Llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);
	}

	/**
	 * @param username
	 * @param password
	 * @return boolean
	 */
	public boolean compruebaLoginEnBD(final String username,
			final String password) {
		// Método mock (simulado)
		if (username.equals("user") && password.equals("Pass1")) {
			return true;
		}
		return false;
	}
}
