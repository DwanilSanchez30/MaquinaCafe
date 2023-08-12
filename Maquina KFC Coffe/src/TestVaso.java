import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVaso {

	@Test
	public void deberiaDevolverVerdaderoSiExistenVasos() {
		Vaso vasosPequeños= new Vaso(2,10);
		boolean result = vasosPequeños.hasVasos(1);
		assertEquals(true, result);
	}
	@Test
	public void deberiaDevolverFalsoSiNoExistenVasos() {
		Vaso vasosPequeños=new Vaso(1,10);
		boolean result = vasosPequeños.hasVasos(2);
		assertEquals(false, result);
	}
	
	@Test
	public void deberiaRestarCantidadDeVaso() {
		Vaso vasosPequeños= new Vaso(5,10);
		vasosPequeños.giveVasos(1);
		assertEquals(4, vasosPequeños.getCantidadVasos());
	}
	
	

}
