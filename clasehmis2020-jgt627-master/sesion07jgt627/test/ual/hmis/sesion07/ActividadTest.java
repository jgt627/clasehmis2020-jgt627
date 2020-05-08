package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicion05.Actividad;
import ual.hmis.sesion07.ejercicion05.Ejercicio;

class ActividadTest {

	@CsvSource({"actividad1,actividad1","actividad2,actividad2"})
	@ParameterizedTest
	void testSetNombre(String input, String expected) {
		Actividad a = new Actividad();
		a.setNombre(input);
		assertEquals(expected,a.getNombre());
	}

	@CsvSource({"ejercicio1,ejercicio2,5.0,7.0,'[ejercicio1 5.0, ejercicio2 7.0]'"})
	@ParameterizedTest
	void testSetEjercicios(String input1, String input2, double input3, double input4,
			String expected) {
		Actividad a = new Actividad();
		Ejercicio e1 = new Ejercicio();
		Ejercicio e2 = new Ejercicio();
		e1.setNombre(input1);
		e1.setPuntuacion(input3);
		e2.setNombre(input2);
		e2.setPuntuacion(input4);
		ArrayList<Ejercicio> aL = new ArrayList<Ejercicio>();
		aL.add(e1);
		aL.add(e2);
		a.setEjercicios(aL);
		assertEquals(expected,a.getEjercicios().toString());
	}

	@CsvSource({"7.0,7.0","5.0,5.0"})
	@ParameterizedTest
	void testSetPuntuacionTotal(double input, double expected){
		Actividad a = new Actividad();
		a.setPuntuacionTotal(input);
		assertEquals(expected,a.getPuntuacionTotal());
	}

	@CsvSource({"true,true","false,false"})
	@ParameterizedTest
	void testSetApta(boolean input, boolean expected){
		Actividad a = new Actividad();
		a.setApta(input);
		assertEquals(expected,a.isApta());
	}

	@CsvSource({"ejercicio1,7.0,1"})
	@ParameterizedTest
	void testAgregarEjercicioCalificado(String input1, double input2, int expected){
		Actividad a = new Actividad();
		a.agregarEjercicioCalificado(input1, input2);
		assertEquals(expected,a.getEjercicios().size());
	}

	@CsvSource({"actividad1,7.0,true,'actividad1 7.0 apta'","actividad1,3.0,false,"
			+ "'actividad1 3.0 no apta'"})
	@ParameterizedTest
	void testToString(String input1, double input2, boolean input3, String expected){
		Actividad a = new Actividad();
		a.setApta(input3);
		a.setNombre(input1);
		a.setPuntuacionTotal(input2);
		assertEquals(expected,a.toString());
	}
}
