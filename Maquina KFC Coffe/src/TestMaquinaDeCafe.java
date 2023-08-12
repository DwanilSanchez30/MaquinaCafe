import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaquinaDeCafe {
	
	
	@SuppressWarnings("static-access")
	@Test
	void deberiaDevolverUnVasoPequeno() {
		Cafetera cafetera = new Cafetera(50);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Vaso vasoMediano = new Vaso(5,20);
		Vaso vasoGrande = new Vaso(5,30);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setVasosMediano(vasoMediano);
		maquinaDeCafe.setVasosGrande(vasoGrande);
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");
		assertEquals(maquinaDeCafe.vasosPequeño, vaso);
	}
	
	@SuppressWarnings("static-access")
	@Test
	void deberiaDevolverUnVasoMediano() {
		Cafetera cafetera = new Cafetera(50);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Vaso vasoMediano = new Vaso(5,20);
		Vaso vasoGrande = new Vaso(5,30);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setVasosMediano(vasoMediano);
		maquinaDeCafe.setVasosGrande(vasoGrande);
		Vaso vaso = maquinaDeCafe.getTipoVaso("mediano");
		assertEquals(maquinaDeCafe.vasoMediano, vaso);
	}
	
	@SuppressWarnings("static-access")
	@Test
	void deberiaDevolverUnVasoGrande() {
		Cafetera cafetera = new Cafetera(50);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Vaso vasoMediano = new Vaso(5,20);
		Vaso vasoGrande = new Vaso(5,30);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setVasosMediano(vasoMediano);
		maquinaDeCafe.setVasosGrande(vasoGrande);
		Vaso vaso = maquinaDeCafe.getTipoVaso("grande");
		assertEquals(maquinaDeCafe.vasoGrande, vaso);
	}
	
	@SuppressWarnings("static-access")
	@Test
	void deberiaDevolverNoHayVasos() {
		Cafetera cafetera = new Cafetera(50);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Vaso vasoMediano = new Vaso(5,20);
		Vaso vasoGrande = new Vaso(5,30);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setVasosMediano(vasoMediano);
		maquinaDeCafe.setVasosGrande(vasoGrande);
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");
		String result = maquinaDeCafe.getVasoDeCafe(vaso, 10, 2);
		assertEquals("Disculpe, No hay Vasos", result);
	}
	
	@SuppressWarnings("static-access")
	@Test
	void deberiaDevolverNoHayCafe() {
		Cafetera cafetera = new Cafetera(5);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setCafetera(cafetera);
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");
		String result = maquinaDeCafe.getVasoDeCafe(vaso, 5, 2);
		assertEquals("Disculpe, No hay Cafe", result);
	}
	
	@SuppressWarnings("static-access")
	@Test
	void deberiaDevolverNoHayAzucar() {
		Cafetera cafetera = new Cafetera(15);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Azuquero azucar= new Azuquero(5);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setCafetera(cafetera);
		maquinaDeCafe.setAzuquero(azucar);
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");
		String result = maquinaDeCafe.getVasoDeCafe(vaso, 5, 8);
		assertEquals("Disculpe, No hay Azucar", result);
	}
	
	@Test
	void pruebaRestarCafe() {
	
	    Cafetera cafetera = new Cafetera(60);
	    Maquina_Cafe maquinaCafe = new Maquina_Cafe();
	    Vaso vasoPequeño = new Vaso(5, 10);
	    Azuquero azucar = new Azuquero(5);

	    maquinaCafe.setCafetera(cafetera);
	    maquinaCafe.setAzuquero(azucar);
	    maquinaCafe.setVasosPequeño(vasoPequeño);
	 
	    Vaso vasoPreparado = maquinaCafe.getTipoVaso("pequeño");
	    maquinaCafe.getVasoDeCafe(vasoPreparado, 5, 2);

	    int cafeRestante = maquinaCafe.getCafetera();
	    assertEquals(10, cafeRestante);
	}

	@Test
	void deberiaRestarAzucar() {
		Cafetera cafetera1 = new Cafetera(60);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Azuquero azucar= new Azuquero(10);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setCafetera(cafetera1);
		maquinaDeCafe.setAzuquero(azucar);
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");
		maquinaDeCafe.getVasoDeCafe(vaso, 5, 5);
		int result = maquinaDeCafe.getAzuquero();
		assertEquals(5, result);
	}
	
	/*@Test
	void deberiarestarVaso() {
		vaso = maquinaDeCafe.getTipoDeVaso("pequeño")
				maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		Int result = maquinaDeVafe.getVasospeuqeños().getCantidadVasor().
				
		
	}*/
	
	@Test
	void deberiaDevolverFelicitaciones() {
		Cafetera cafetera1 = new Cafetera(60);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Azuquero azucar= new Azuquero(5);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setCafetera(cafetera1);
		maquinaDeCafe.setAzuquero(azucar);
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");
		String result = maquinaDeCafe.getVasoDeCafe(vaso, 5, 5);
		assertEquals("Felicidades, aqui tiene su café solicitado!", result);
	}

}
