
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ControleDeAlocacaoTest {

	@Test
	void testAluga() {
		Empresa empresa = new Empresa("Azure");

		Carro carro1 = new Carro("333-222", "Verde", 2009, "Gasolina", 4, 0, "444-01", "224", 500.0, "BMW", "3000");

		Carro carro2 = new Carro("343-222", "Preto", 2014, "Gasolina", 4, 0, "444-11", "222", 200.0, "Fiat", "Uno");

		Carro carro3 = new Carro("345-256", "Prata", 2009, "Gasolina", 4, 0, "454-11", "322", 250.0, "Chevrolet",
				"Celta");

		Carro carro4 = new Carro("669-KCV", "Vermelho", 2013, "Gasolina", 4, 0, "954-17", "333", 100.0, "Ford",
				"EcoSport");

		empresa.addAutomoveis(carro1);
		empresa.addAutomoveis(carro2);
		empresa.addAutomoveis(carro3);
		empresa.addAutomoveis(carro4);

				
		Agencia agencia4 = new Agencia("Azure", "Porto Alegere", 8);


		Cliente cliente = new Cliente("Seu Medina", "000-222-65");
		
		ControleDeLocacao controleDeLocacao = new ControleDeLocacao();

		controleDeLocacao.setCarrosDisponiveis(empresa);
		
		controleDeLocacao.aluga(cliente, carro3, agencia4);
						
		assertEquals(carro3, controleDeLocacao.getCarrosAlugados().get(0));
		
		
	}
	
	@Test
	void testDevolve() {
		
		Empresa empresa = new Empresa("Azure");

		Carro carro1 = new Carro("333-222", "Verde", 2009, "Gasolina", 4, 0, "444-01", "224", 500.0, "BMW", "3000");

		Carro carro2 = new Carro("343-222", "Preto", 2014, "Gasolina", 4, 0, "444-11", "222", 200.0, "Fiat", "Uno");

		Carro carro3 = new Carro("345-256", "Prata", 2009, "Gasolina", 4, 0, "454-11", "322", 250.0, "Chevrolet",
				"Celta");

		Carro carro4 = new Carro("669-KCV", "Vermelho", 2013, "Gasolina", 4, 0, "954-17", "333", 100.0, "Ford",
				"EcoSport");

		empresa.addAutomoveis(carro1);
		empresa.addAutomoveis(carro2);
		empresa.addAutomoveis(carro3);
		empresa.addAutomoveis(carro4);

		HorarioDeLocacao retornoAluga1;

				
		Agencia agencia4 = new Agencia("Azure", "Porto Alegere", 8);


		Cliente cliente = new Cliente("Seu Medina", "000-222-65");
		
		ControleDeLocacao controleDeLocacao = new ControleDeLocacao();

		controleDeLocacao.setCarrosDisponiveis(empresa);
		
		retornoAluga1 = controleDeLocacao.aluga(cliente, carro3, agencia4);
		
		controleDeLocacao.devolve(cliente, carro3, retornoAluga1, agencia4, 1);
		
		assertEquals(true, controleDeLocacao.getCarrosAlugados().isEmpty());
		
	}

}
