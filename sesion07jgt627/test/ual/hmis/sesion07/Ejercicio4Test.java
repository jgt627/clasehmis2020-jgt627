package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicion04.Ejercicio4;

public class Ejercicio4Test {
	@CsvSource({"P1,P2,P",
		"F1,P2,''",
		"Hmis,Hmis,Hmis"})
	
	@ParameterizedTest (name = "{index} => Con entrada input1 ({0}) e input2 ({1}) sale expected {2}")
	
	void testCaracteresIguales(String input1, String input2,String expected){
		Ejercicio4 e4 = new Ejercicio4();
		assertEquals(expected ,e4.caracteresIguales(input1,input2));
	}
}
