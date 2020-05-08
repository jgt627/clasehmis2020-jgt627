package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicion05.Actividad;
import ual.hmis.sesion07.ejercicion05.Alumno;
import ual.hmis.sesion07.ejercicion05.Ejercicio;
import ual.hmis.sesion07.ejercicion05.Profesor;

class ProfesorTest {
	
	@CsvSource({"Francisco,'[Francisco]'"})
	@ParameterizedTest 
	void testSetNombre(String input, String expected) {
		Profesor p = new Profesor();
		Alumno a = new Alumno();
		a.setNombre(input);
		ArrayList<Alumno> aL = new ArrayList<Alumno>();
		aL.add(a);
		p.setAlumnosDePracticas(aL);
		assertEquals(expected,p.getAlumnosDePracticas().toString());
	}
	
	@CsvSource({"Francisco, actividad1,ejercicio1, ejercicio2,5.0,6.0,true","Francisco, actividad1,ejercicio1, ejercicio2,2.0,1.0,false"})
	@ParameterizedTest 
	void testCalificarAlumnos(String input1, String input2, String input3, String input4, double input5, double input6, boolean expected) {
		Profesor p = new Profesor();
		Alumno a = new Alumno();
		Actividad ac = new Actividad();
		Ejercicio e1 = new Ejercicio();
		Ejercicio e2 = new Ejercicio();
		a.setNombre(input1);
		ac.setNombre(input2);
		e1.setNombre(input3);
		e2.setNombre(input4);
		e1.setPuntuacion(input5);
		e2.setPuntuacion(input6);
		ArrayList<Ejercicio> aL = new ArrayList<Ejercicio>();
		aL.add(e1);
		aL.add(e2);
		ArrayList<Actividad> aL2 = new ArrayList<Actividad>();
		aL2.add(ac);
		ArrayList<Alumno> aL3 = new ArrayList<Alumno>();
		aL3.add(a);
		ac.setEjercicios(aL);
		a.setActividadesAsignadas(aL2);
		p.setAlumnosDePracticas(aL3);
		p.calificarAlumnos();
		assertEquals(expected,ac.isApta());
	}

}
