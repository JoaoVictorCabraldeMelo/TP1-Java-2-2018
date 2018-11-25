

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmpresaTest {

	@Test
	void testEmpresaAddAutomoveis() {
		
		Empresa empresa = new Empresa("Hi");
		
		empresa.addAutomoveis(null);
		empresa.addAutomoveis(null);
		empresa.addAutomoveis(null);
		
		Iterable<Automovel> exp = new ArrayList<>(Arrays.asList(null, null, null));
		
		Assertions.assertIterableEquals(exp, empresa.getAutomoveis());
	}
	
	@Test 
	void testSetNome() {
		
		Empresa empresa = new Empresa(null);
		
		empresa.setNome("JP");
		
		assertEquals("JP", empresa.getNome());
	}

}
