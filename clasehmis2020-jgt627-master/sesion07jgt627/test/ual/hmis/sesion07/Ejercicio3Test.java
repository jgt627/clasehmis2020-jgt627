package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicion03.Ejercicio3;

public class Ejercicio3Test {

	@CsvSource({"-1,número erróneo",
		"4,*****",
		"13,************",
		"7,*******"})

	@ParameterizedTest (name = "{index} => Con entrada input ({0}) sale expected {1}")

	void testEscrituraDeAsteriscos(int input, String expected){
		Ejercicio3 e3 = new Ejercicio3();
		assertEquals(expected ,e3.escrituraDeAsteriscos(input));
	}
}
