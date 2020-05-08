package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicion02.Ejercicio2;

public class Ejercicio2Test {
	@CsvSource({
		"'',Pass1,false",
		"user,'',false",
		"nombredeusuariosuperiora30caracteres,Pass1,false",
		"user,passwordsuperiora30caracteress,false",
		"user,pass1,false",
		"user,PASS1,false",
		"user,Pass,false",
		"user,Pass1,true",
		"usuario,Pass1,false",
		"user,Password1,false",
		"usuario,Password1,false"
		})
	
	@ParameterizedTest
	void testLogin(String username, String password, boolean result) {
		Ejercicio2 e2 = new Ejercicio2();
		assertEquals(result, e2.login(username, password));
	}
}
