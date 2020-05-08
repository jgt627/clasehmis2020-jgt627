package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicion05.Actividad;
import ual.hmis.sesion07.ejercicion05.Alumno;
import ual.hmis.sesion07.ejercicion05.Ejercicio;

class AlumnoTest {

	@CsvSource({"Francisco,Francisco"})
	@ParameterizedTest 
	void testSetNombre(String input, String expected) {
		Alumno a = new Alumno();
		a.setNombre(input);
		assertEquals(expected,a.getNombre());
	}
	
	@CsvSource({"actividad1,actividad2,5.0,3.0,true,false,'[actividad1 5.0 apta, actividad2 3.0 no apta]'"})
	@ParameterizedTest 
	void testSetActividadesAsignadas(String input1, String input2, double input3, double input4,boolean input5, boolean input6, String expected) {
		Alumno a = new Alumno();
		Actividad a1 = new Actividad();
		Actividad a2 = new Actividad();
		a1.setNombre(input1);
		a1.setPuntuacionTotal(input3);
		a2.setNombre(input2);
		a2.setPuntuacionTotal(input4);
		a1.setApta(input5);
		a2.setApta(input6);
		ArrayList<Actividad> aL = new ArrayList<Actividad>();
		aL.add(a1);
		aL.add(a2);
		a.setActividadesAsignadas(aL);
		assertEquals(expected,a.getActividadesAsignadas().toString());
	}
	
	@CsvSource({"Francisco,Francisco"})
	@ParameterizedTest 
	void testToString(String input, String expected) {
		Alumno a = new Alumno();
		a.setNombre(input);
		assertEquals(expected,a.toString());
	}
	
	@CsvSource({"actividad1,actividad2,ejercicio1,ejercicio2,5.0,6.0,11.0"})
	@ParameterizedTest 
	void testCalcularNotaActividad(String input1, String input2, String input3,String input4, double input5, double input6, double expected) {
		Alumno a = new Alumno();
		Actividad a1 = new Actividad();
		Actividad a2 = new Actividad();
		Ejercicio e1 = new Ejercicio();
		Ejercicio e2 = new Ejercicio();
		a1.setNombre(input1);
		a2.setNombre(input2);
		e1.setNombre(input3);
		e2.setNombre(input4);
		e1.setPuntuacion(input5);
		e2.setPuntuacion(input6);
		ArrayList<Ejercicio> aL = new ArrayList<Ejercicio>();
		aL.add(e1);
		aL.add(e2);
		a1.setEjercicios(aL);
		ArrayList<Actividad> aL2 = new ArrayList<Actividad>();
		aL2.add(a1);
		aL2.add(a2);
		a.setActividadesAsignadas(aL2);
		assertEquals(expected,a.calcularNotaActividad(input1));
	}
	
	@CsvSource({"actividad1,ejercicio1,ejercicio2,1.0,1.0,Suspenso"
		,"actividad1,ejercicio1,ejercicio2,0.0,-0.1,Error en la nota"
		,"actividad1,ejercicio1,ejercicio2,2.0,3.0,Aprobado"
		,"actividad1,ejercicio1,ejercicio2,4.0,3.0,Notable"
		,"actividad1,ejercicio1,ejercicio2,4.0,5.0,Sobresaliente"
		,"actividad1,ejercicio1,ejercicio2,5.0,5.0,Matrícula"
		,"actividad1,ejercicio1,ejercicio2,11.0,0.0,Error en la nota"})
	@ParameterizedTest 
	void testCalificar(String input1, String input2,String input3, double input4, double input5,String expected) {
		Alumno a = new Alumno();
		Actividad a1 = new Actividad();
		Ejercicio e1 = new Ejercicio();
		Ejercicio e2 = new Ejercicio();
		a1.setNombre(input1);
		e1.setNombre(input2);
		e2.setNombre(input3);
		e1.setPuntuacion(input4);
		e2.setPuntuacion(input5);
		ArrayList<Ejercicio> aL = new ArrayList<Ejercicio>();
		aL.add(e1);
		aL.add(e2);
		a1.setEjercicios(aL);
		ArrayList<Actividad> aL2 = new ArrayList<Actividad>();
		aL2.add(a1);
		a.setActividadesAsignadas(aL2);
		double nota = a.calcularNotaActividad(input1);
		assertEquals(expected,a.calificacion(nota));
	}
	@CsvSource({"2017,1º Educación Infantil","2016,2º Educación Infantil","2015,3º Educación Infantil","2014,1º Educación Primaria","2013,2º Educación Primaria","2012,3º Educación Primaria","2011,4º Educación Primaria","2010,5º Educación Primaria","2009,6º Educación Primaria","2008,1º Educación Secundaria","2007,2º Educación Secundaria","2006,3º Educación Secundaria","2005,4º Educación Secundaria","2000,''"})
	@ParameterizedTest 
	void testCursoSegunEdad(int input,String expected) {
		Alumno a = new Alumno();
		assertEquals(expected,a.cursoSegunEdad(input));
	}
}
