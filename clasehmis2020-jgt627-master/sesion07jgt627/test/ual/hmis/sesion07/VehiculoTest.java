package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicion08.Vehiculo;

class VehiculoTest {
	
	@CsvSource({"10.0,10.0"})
	@ParameterizedTest 
	void testPeso(double input, double expected) {
		Vehiculo v = new Vehiculo();
		v.setPeso(input);
		assertEquals(expected,v.getPeso());
	}
	
	@CsvSource({"5,5"})
	@ParameterizedTest
	void testPasajeros(int input, int expected) {
		Vehiculo v = new Vehiculo();
		v.setPasajeros(input);
		assertEquals(expected,v.getPasajeros());
	}
}
