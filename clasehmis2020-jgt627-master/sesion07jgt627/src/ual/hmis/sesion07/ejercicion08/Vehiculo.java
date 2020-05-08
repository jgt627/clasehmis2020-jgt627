package ual.hmis.sesion07.ejercicion08;

/**
 * @author mi-cu
 *
 */
public class Vehiculo {
	/**
	 *
	 */
	private int numPasajeros;
	/**
	 *
	 */
	@SuppressWarnings("unused")
	private int numRuedas;
	/**
	 *
	 */
	private double peso;

	/**
	 * @return numPasajeros
	 */
	public int getPasajeros() {
		return numPasajeros;
	}

	/**
	 * @param pasajeros
	 */
	public void setPasajeros(final int pasajeros) {
		this.numPasajeros = pasajeros;
	}

	/**
	 * @return peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param pesoNuevo
	 */
	public void setPeso(final double pesoNuevo) {
		this.peso = pesoNuevo;
	}
}
