package main;


public class Agencia extends Empresa {
	
	private int codigoAgencia;
	private String localidade;

	public Agencia(String nome, String localidade, int codigoAgencia) {
		super(nome);
		setCodigoAgencia(codigoAgencia);
		setLocalidade(localidade);
	}
	
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	public void setCodigoAgencia(int codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
	}
	
	public int getCodigoAgencia() {
		return codigoAgencia;
	}
	
	public String getLocalidade() {
		return localidade;
	}

}
