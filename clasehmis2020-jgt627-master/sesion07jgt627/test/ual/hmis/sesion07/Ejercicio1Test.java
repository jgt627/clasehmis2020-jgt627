package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicion01.Ejercicio1;


class Ejercicio1Test {

	@CsvSource({"2, 1",
		"5, 1",
		"6, 1",
		"14, 7"})

	@ParameterizedTest (name = "{index} => Con entrada input ({0}) sale expected {1}")


	void testTransformar(int input, int expected) {
		Ejercicio1 c = new Ejercicio1();
		assertEquals(expected, c.transformar(input));
	}
}