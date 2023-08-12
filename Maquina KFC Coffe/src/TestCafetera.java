import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCafetera {

	@Test
	public void deberiaDevolverVerdaderoSiExisteCafe() {
		Cafetera cafetera= new Cafetera(10);
		boolean result = cafetera.hasCafe(1);
		assertEquals(true, result);
	}
	@Test
	public void deberiaDevolverFalsoSiNoExisteCafe() {
		Cafetera cafetera= new Cafetera(10);
		boolean result = cafetera.hasCafe(11);
		assertEquals(false, result);
	}
	
	@Test
	public void deberiaRestarCafeALaCafetera() {
		Cafetera cafetera= new Cafetera(10);
		cafetera.giveCafe(7);
		assertEquals(3, cafetera.getCantidadDeCafe());
	}

}
