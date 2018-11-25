package main;
import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

	@Test
	public void Getstest() {
		
		Cliente cliente = new Cliente("Dayanne", "333-555-777");
		
		assertEquals("Dayanne", cliente.getNome());
		
		assertEquals("333-555-777", cliente.getCpf());
	}
	
	@Test
	public void Setstest() {
		
		Cliente cliente = new Cliente(null, null);
		
		cliente.setNome("João Victor");
		
		cliente.setCpf("555-894");
		
		assertEquals("João Victor", cliente.getNome());
		
		assertEquals("555-894", cliente.getCpf());
		
	}

}
