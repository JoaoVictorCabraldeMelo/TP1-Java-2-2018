
public class Carro extends Automovel {
	
	private Marca marca;

	public Carro(String placa, String cor, int ano, String tipoDeCombustivel, int numeroDePortas, int quilometragem,
			String renavam, String chassi, double valorDeLocacao, String Marca, String Modelo) {
		super(placa, cor, ano, tipoDeCombustivel, numeroDePortas, quilometragem, renavam, chassi, valorDeLocacao);
		this.marca = new Marca(Marca, Modelo);
	}
	
	public Marca getMarca() {
		return marca;
	}
}
