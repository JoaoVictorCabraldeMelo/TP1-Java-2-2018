import java.util.ArrayList;

public class Empresa {
	
	private String nome;
	private ArrayList<Automovel> automoveis;
	
	public Empresa(String nome) {
		
		setNome(nome);
		this.automoveis = new ArrayList<Automovel>();
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public ArrayList<Automovel> getAutomoveis() {
		return automoveis;
	}
	
	public void addAutomoveis(Automovel newAutomovel) {
		
		this.automoveis.add(newAutomovel);
		
	}
	
	

}
