
public class TesteHM {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa("Azure");

		Carro carro1 = new Carro("333-222", "Verde", 2009, "Gasolina", 4, 0, "444-01", "224", 500.0, "BMW", "3000");

		Carro carro2 = new Carro("343-222", "Preto", 2014, "Gasolina", 4, 0, "444-11", "222", 200.0, "Fiat", "Uno");
		
		Carro carro3 = new Carro("345-256", "Prata", 2009, "Gasolina", 4, 0, "454-11", "322", 250.0, "Chevrolet", "Celta");
		
		Carro carro4 = new Carro("669-KCV", "Vermelho", 2013, "Gasolina", 4, 0, "954-17", "333", 100.0, "Ford", "EcoSport");
		
		empresa.addAutomoveis(carro1);
		empresa.addAutomoveis(carro2);
		empresa.addAutomoveis(carro3);
		empresa.addAutomoveis(carro4);
		
		
		Cliente cliente = new Cliente("Seu Medina", "000-222-65");
		
		ControleDeLocacao controleDeLocacao = new ControleDeLocacao();
		
		controleDeLocacao.setCarrosDisponiveis(empresa);
		
		controleDeLocacao.aluga(cliente, carro3);
		
		controleDeLocacao.aluga(cliente, carro2);
		
		controleDeLocacao.devolve(cliente, carro1);
		
		Cliente cliente2 = new Cliente("Cassio Brenlla", "65478-3332");
		
		controleDeLocacao.aluga(cliente2, carro3);
		
		controleDeLocacao.aluga(cliente2, carro4);
		
		controleDeLocacao.devolve(cliente2, carro2);
		
		Cliente cliente3 = new Cliente("Faria", "555-444");
		
		controleDeLocacao.devolve(cliente3, carro4);
		
		controleDeLocacao.aluga(cliente3, carro1);
		
		HorarioDeLocacao horarioDeLocacao = new HorarioDeLocacao();
		
		horarioDeLocacao.setHorarioQueAlugou();
		
		horarioDeLocacao.setDataQueAlugou();
		
		horarioDeLocacao.printHorarioEData(horarioDeLocacao.getHorarioQueAlugou(),
				horarioDeLocacao.getDataQueAlugou());
		
	}

}
