


public class TesteHM {

	public static void main(String[] args) {
		
		try {

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

		
		Agencia agencia1 = new Agencia("Azure", "São Paulo", 11);
		
		Agencia agencia2 = new Agencia("Azure", "Brasilia", 13);
		
		Agencia agencia3 = new Agencia("Azure", "Bangladesh", 21);
		
		Agencia agencia4 = new Agencia("Azure", "Porto Alegere", 8);


		Cliente cliente = new Cliente("Seu Medina", "000-222-65");

		ControleDeLocacao controleDeLocacao = new ControleDeLocacao();


		HorarioDeLocacao retornoAluga1, retornoAluga2;

		controleDeLocacao.setCarrosDisponiveis(empresa);

		retornoAluga1 = controleDeLocacao.aluga(cliente, carro3, agencia2);

		controleDeLocacao.aluga(cliente, carro2, agencia2);
		
		controleDeLocacao.devolve(cliente, carro3, retornoAluga1, agencia4, 1);

		Cliente cliente2 = new Cliente("Seu Ze", "65478-3332");

		retornoAluga1 = controleDeLocacao.aluga(cliente2, carro3, agencia1);

		retornoAluga2 = controleDeLocacao.aluga(cliente2, carro4, agencia3);

/*		controleDeLocacao.devolve(cliente2, carro2, null, null, 2); descomente essa linha do codigo para testar uma exceçao*/
		
		controleDeLocacao.devolve(cliente2, carro4, retornoAluga2, agencia1, 2);

		Cliente cliente3 = new Cliente("Dona Chica", "555-444");

/*		controleDeLocacao.devolve(cliente3, carro4, null, null, 0); outro teste de exceção */

		retornoAluga1 = controleDeLocacao.aluga(cliente3, carro4, agencia3);
		
		controleDeLocacao.devolve(cliente3, carro4, retornoAluga1, agencia2, 2);
		
		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally {
			System.out.println("Finalizando Metodo Main de Testes");
		}

	}

}
