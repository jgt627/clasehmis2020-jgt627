package ual.hmis.sesion07.ejercicion08;

import java.util.ArrayList;

/**
 * @author mi-cu
 *
 */
public class Ferry {
	/**
	 *
	 */
	private int maxVehiculos;
	/**
	 *
	 */
	private int maxPasajeros;
	/**
	 *
	 */
	private double maxPeso;
	/**
	 *
	 */
	private int totalPasajeros;
	/**
	 *
	 */
	private int totalVehiculos;
	/**
	 *
	 */
	private double totalPeso;
	/**
	 *
	 */
	private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

	/**
	 * @param maxVehiculosNuevos
	 */
	public void setMaxVehiculos(final int maxVehiculosNuevos) {
		this.maxVehiculos = maxVehiculosNuevos;
	}

	/**
	 * @param peso
	 */
	public void setMaxPeso(final double peso) {
		this.maxPeso = peso;
	}

	/**
	 * @param v
	 * @return boolean
	 */
	public boolean embarcarVehiculo(final Vehiculo v) {
		// Embarca un vehículo añadiendolo a la lista
		if (v.getPeso() == 0.0) {
			return false;
		}
		listaVehiculos.add(v);
		totalVehiculos++;
		totalPasajeros += v.getPasajeros();
		totalPeso += v.getPeso();
		return true;
	}

	/**
	 * @return totalVehiculos
	 */
	public int totalVehiculos() {
		// Devuelve el número total de vehículos embarcados
		return totalVehiculos;
	}

	/**
	 * @return boolean
	 */
	public boolean vacio() {
		// Verdadero si no hay ningún vehículo
		return listaVehiculos.isEmpty();
	}

	/**
	 * @return boolean
	 */
	public boolean superadoMaximoVehiculos() {
		// Verdadero si el número total de vehículos supera el máximo
		if (totalVehiculos > maxVehiculos) {
			return true;
		}
		return false;
	}

	/**
	 * @return boolean
	 */
	public boolean superadoMaximoPeso() {
		// Verdadero si el peso total de los vehículos supera el máximo
		if (totalPeso > maxPeso) {
			return true;
		}
		return false;
	}
}
