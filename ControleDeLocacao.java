import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ControleDeLocacao {

	private ArrayList<Automovel> carrosDisponiveis;
	private ArrayList<Automovel> carrosAlugados;
	private Map<Cliente, ArrayList<Automovel>> mapClienteAutomovel;

	public ControleDeLocacao() {
		this.carrosDisponiveis = new ArrayList<Automovel>();
		this.carrosAlugados = new ArrayList<Automovel>();
		this.mapClienteAutomovel = new HashMap<Cliente, ArrayList<Automovel>>();
	}

	public void setCarrosDisponiveis(Empresa empresa) {
		this.carrosDisponiveis = empresa.getAutomoveis();
	}

	public ArrayList<Automovel> getCarrosDisponiveis() {
		return carrosDisponiveis;
	}

	public ArrayList<Automovel> getCarrosAlugados() {
		return carrosAlugados;
	}

	public Map<Cliente, ArrayList<Automovel>> getMapClienteAutomovel() {
		return mapClienteAutomovel;
	}

	public void aluga(Cliente cliente, Automovel automovel) {
		if (carrosDisponiveis.contains(automovel)) {
			System.out.println("O automovel esta disponivel");
			System.out.println("Alugando Automovel");
			carrosDisponiveis.remove(automovel);
			carrosAlugados.add(automovel);
			if (mapClienteAutomovel.get(cliente) == null) {
				mapClienteAutomovel.put(cliente, new ArrayList<Automovel>());
			} else {
				mapClienteAutomovel.get(cliente).add(automovel);
			}
		} else {
			System.out.println("O carro não esta disponivel");
		}
	}

	public void devolve(Cliente cliente, Automovel automovel) {
		if(carrosDisponiveis.contains(automovel)) {
			System.out.println("O automovel que o senhor esta tentando devolver ja esta disponivel");
		}else if(!(getMapClienteAutomovel().containsKey(cliente))) {
			System.out.println("O senhor não alugou nada ou automovel não esta disponivel");
		}else if(!getMapClienteAutomovel().get(cliente).contains(automovel)) {
			System.out.println("O senhor não alugou esse automovel");
		}
		else {
			System.out.println("Devolvendo Automovel");
			carrosAlugados.remove(automovel);
			carrosDisponiveis.add(automovel);
			
			System.out.println("Obrigado por utilizar a Azure Locadora");
			
		}
	}

}

