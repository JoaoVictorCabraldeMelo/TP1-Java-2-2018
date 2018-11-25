import static org.junit.Assert.*;

import org.junit.Test;

public class CarroTest {

	@Test
	public void testGets() {
		
		Carro car = new Carro("55-33", "cor", 2009, "Gasolina", 4, 20000, "AAA", "JV", 250.00, "Porscher", "56-E");
		
		assertEquals("55-33", car.getPlaca());
		assertEquals("cor", car.getCor());
		assertEquals(2009, car.getAno());
		assertEquals("Gasolina", car.getTipoDeCombustivel());
		assertEquals(4, car.getNumeroDePortas());
		assertEquals(20000, car.getQuilometragem());
		assertEquals("AAA", car.getRenavam());
		assertEquals("JV", car.getChassi());
		assertEquals(1857.2, car.getValorDeLocacao(), 0.001);

	}
	
	@Test
	public void testSets() {
		
		Carro car = new Carro(null, null, 0, null, 0, 0, null, null, 0, null, null);
		
		car.setAno(2006);
		
		assertEquals(2006, car.getAno());
		
		car.setChassi("GYU");
		
		assertEquals("GYU", car.getChassi());
		
		car.setCor("black");
		
		assertEquals("black", car.getCor());
		
		car.setNumeroDePortas(4);
		
		assertEquals(4, car.getNumeroDePortas());
		
		car.setPlaca("Day-of");
		
		assertEquals("Day-of", car.getPlaca());
		
		car.setQuilometragem(17);
		
		assertEquals(17, car.getQuilometragem());
		
		car.setRenavam("Love");
		
		assertEquals("Love", car.getRenavam());
		
		car.setTipoDeCombustivel("Biodisel");
		
		assertEquals("Biodisel", car.getTipoDeCombustivel());
		
		car.setValorDeLocacao(1700.00);
						
		assertEquals(3304.8, car.getValorDeLocacao(), 0.001);
		
	}



}
