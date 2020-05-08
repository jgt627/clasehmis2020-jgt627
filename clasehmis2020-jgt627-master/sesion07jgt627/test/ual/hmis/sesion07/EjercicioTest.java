package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicion05.Ejercicio;
class EjercicioTest {

	@CsvSource({"Francisco,Francisco"})
	@ParameterizedTest 
	void testSetNombre(String input, String expected) {
		Ejercicio e = new Ejercicio();
		e.setNombre(input);
		assertEquals(expected,e.getNombre());
	}
	@CsvSource({"10.0,10.0"})
	@ParameterizedTest 
	void testSetPuntuacion(double input, double expected) {
		Ejercicio e = new Ejercicio();
		e.setPuntuacion(input);
		assertEquals(expected,e.getPuntuacion());
	}
	
	@CsvSource({"ejercicio1,7.0,'ejercicio1 7.0'"})
	@ParameterizedTest 
	void testToString(String input1, double input2, String expected){
		Ejercicio e = new Ejercicio();
		e.setNombre(input1);
		e.setPuntuacion(input2);
		assertEquals(expected,e.toString());
	}
}
