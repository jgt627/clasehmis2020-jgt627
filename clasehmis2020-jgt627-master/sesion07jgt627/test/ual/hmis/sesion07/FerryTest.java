package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicion08.Ferry;
import ual.hmis.sesion07.ejercicion08.Vehiculo;
public class FerryTest {

	@CsvSource({"5,10.0,true","5,0,false"})
	@ParameterizedTest 
	public void testEmbarcarVehiculo(int input1,double input2,boolean expected) {
		Ferry f = new Ferry();
		Vehiculo v = new Vehiculo();
		v.setPasajeros(input1);
		v.setPeso(input2);
		assertEquals(expected,f.embarcarVehiculo(v));
		
	}

	@CsvSource({"5,6,7,10.0,11.0,12.0,3","5,5,7,0.0,10.0,12.0,2"})
	@ParameterizedTest 
	public void testTotalVehiculos(int input1, int input2, int input3, double input4, double input5, double input6,  int expected) {
		Ferry f = new Ferry();
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo();
		Vehiculo v3 = new Vehiculo();
		v1.setPasajeros(input1);
		v2.setPasajeros(input2);
		v3.setPasajeros(input3);
		v1.setPeso(input4);
		v2.setPeso(input5);
		v3.setPeso(input6);
		f.embarcarVehiculo(v1);
		f.embarcarVehiculo(v2);
		f.embarcarVehiculo(v3);
		assertEquals(expected,f.totalVehiculos());
	}

	@CsvSource({"5,10.0,false","0,10.0,false","1,0.0,true"})
	@ParameterizedTest 
	public void testVacio(int input1, double input2, boolean expected) {
		Ferry f = new Ferry();
		Vehiculo v = new Vehiculo();
		v.setPasajeros(input1);
		v.setPeso(input2);
		f.embarcarVehiculo(v);
		assertEquals(expected, f.vacio());
	}

	@CsvSource({"5,6,7,10.0,11.0,12.0,2,true","5,5,7,0.0,10.0,12.0,2,false"})
	@ParameterizedTest 
	public void testSuperadoMaximoVehiculo(int input1, int input2, int input3, double input4, double input5, double input6,  int input7, boolean expected) {
		Ferry f = new Ferry();
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo();
		Vehiculo v3 = new Vehiculo();
		v1.setPasajeros(input1);
		v2.setPasajeros(input2);
		v3.setPasajeros(input3);
		v1.setPeso(input4);
		v2.setPeso(input5);
		v3.setPeso(input6);
		f.setMaxVehiculos(input7);
		f.embarcarVehiculo(v1);
		f.embarcarVehiculo(v2);
		f.embarcarVehiculo(v3);
		assertEquals(expected,f.superadoMaximoVehiculos());
	}
	@CsvSource({"5,6,7,10.0,11.0,12.0,33.0,false","5,5,7,0.0,10.0,12.0,2.0,true"})
	@ParameterizedTest 
	public void testSuperadoMaximoPeso(int input1, int input2, int input3, double input4, double input5, double input6,  double input7, boolean expected) {
		Ferry f = new Ferry();
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo();
		Vehiculo v3 = new Vehiculo();
		v1.setPasajeros(input1);
		v2.setPasajeros(input2);
		v3.setPasajeros(input3);
		v1.setPeso(input4);
		v2.setPeso(input5);
		v3.setPeso(input6);
		f.setMaxPeso(input7);
		f.embarcarVehiculo(v1);
		f.embarcarVehiculo(v2);
		f.embarcarVehiculo(v3);
		assertEquals(expected,f.superadoMaximoPeso());
	}
}
