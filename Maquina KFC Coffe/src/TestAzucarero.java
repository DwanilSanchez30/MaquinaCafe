import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAzucarero {

	
	@Test
	public void deberiadevolverVerdaderoSiHaySuficienteAzucarEnElAzuquero() {
		Azuquero azuquero = new Azuquero(10);
		boolean result= azuquero.hasAzucar(5);
		assertEquals(true, result);
	}
	
	@Test
	public void deberiadevolverFalsoPorqueNoHaySuficienteAzucarEnElAzuquero() {
		Azuquero azuquero = new Azuquero(10);
		boolean result= azuquero.hasAzucar(15);
		assertEquals(false, result);
	}
	
	@Test
	public void deberiaRestarAzucarAlAzuquero() {
		Azuquero azuquero = new Azuquero(10);
		azuquero.giveAzucar(5);
		assertEquals(5, azuquero.getCantidadDeAzucar());
	}


}
