
public abstract class Automovel {

	private String placa;
	private String cor;
	private int ano;
	private String tipoDeCombustivel;
	private int numeroDePortas;
	private int quilometragem;
	private String renavam;
	private String chassi;
	private double valorDeLocacao;

	public Automovel(String placa, String cor, int ano, String tipoDeCombustivel, int numeroDePortas, int quilometragem,
			String renavam, String chassi, double valorDeLocacao) {
		
		setPlaca(placa);
		setCor(cor);
		setAno(ano);
		setTipoDeCombustivel(tipoDeCombustivel);
		setNumeroDePortas(numeroDePortas);
		setQuilometragem(quilometragem);
		setRenavam(renavam);
		setChassi(chassi);
		setValorDeLocacao(valorDeLocacao);
		
	}
	
	
	public abstract Marca getMarca();

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}

	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public double getValorDeLocacao() {
		return valorDeLocacao;
	}

	public void setValorDeLocacao(double valorDeLocacao) {
		this.valorDeLocacao = valorDeLocacao + getAno()*0.8;
	}

}
