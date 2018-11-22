import static org.junit.Assert.*;

import org.junit.Test;

public class AgenciaTest {

	@Test
	public void TestSetLocalidade() {
		Agencia ag = new Agencia(null, null, 0);
		
		ag.setLocalidade("Seoul");
		
		assertEquals(ag.getLocalidade(), "Seoul");
		
	}
	
	@Test
	public void TestGetLocalidade() {
		Agencia ag = new Agencia(null, "Paris", 0);
		
		 assertEquals("Paris", ag.getLocalidade());
	}
	
	@Test
	public void TestsetCodigoAgencia() {
		
		Agencia agencia = new Agencia(null, null, 0);
		
		agencia.setCodigoAgencia(30);
		
		assertEquals(30, agencia.getCodigoAgencia());

	}
	
	

}
