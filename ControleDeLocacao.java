import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ControleDeLocacao {

	private ArrayList<Automovel> carrosDisponiveis;
	private ArrayList<Automovel> carrosAlugados;
	private Map<Cliente, ArrayList<Automovel>> mapClienteAutomovel;
	private Map<Automovel, ArrayList<HorarioDeLocacao>> mapAutomovelHorariosDeLocacao;

	public ControleDeLocacao() {
		this.carrosDisponiveis = new ArrayList<Automovel>();
		this.carrosAlugados = new ArrayList<Automovel>();
		this.mapClienteAutomovel = new HashMap<Cliente, ArrayList<Automovel>>();
		this.mapAutomovelHorariosDeLocacao = new HashMap<Automovel, ArrayList<HorarioDeLocacao>>();
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

	public Map<Automovel, ArrayList<HorarioDeLocacao>> getMapAutomovelHorariosDeLocacao() {
		return mapAutomovelHorariosDeLocacao;
	}

	public HorarioDeLocacao aluga(Cliente cliente, Automovel automovel) {
		if (carrosDisponiveis.contains(automovel)) {
			HorarioDeLocacao horarioQueAlugou = setHorarioQueAlugou();
			if (mapAutomovelHorariosDeLocacao.get(automovel) == null) {
				mapAutomovelHorariosDeLocacao.put(automovel, new ArrayList<HorarioDeLocacao>());
				mapAutomovelHorariosDeLocacao.get(automovel).add(horarioQueAlugou);
			} else {
				mapAutomovelHorariosDeLocacao.get(automovel).add(horarioQueAlugou);
			}
			if (mapClienteAutomovel.get(cliente) == null) {
				mapClienteAutomovel.put(cliente, new ArrayList<Automovel>());
				mapClienteAutomovel.get(cliente).add(automovel);
			} else {
				mapClienteAutomovel.get(cliente).add(automovel);
			}
			System.out.println("O automovel esta disponivel");
			System.out.println("Alugando Automovel");
			carrosDisponiveis.remove(automovel);
			carrosAlugados.add(automovel);

			return horarioQueAlugou;

		} else {
			System.out.println("O carro não esta disponivel");
			return null;
		}
	}

	public void devolve(Cliente cliente, Automovel automovel, HorarioDeLocacao horarioDeLocacao) {
		if (carrosDisponiveis.contains(automovel)) {
			System.out.println("O automovel que o senhor esta tentando devolver ja esta disponivel");
		} else if (!(getMapClienteAutomovel().containsKey(cliente))) {
			System.out.println("O senhor não alugou nada ou automovel não esta disponivel");
		} else if (!getMapClienteAutomovel().get(cliente).contains(automovel)) {
			System.out.println("O senhor não alugou esse automovel");
		} else {
			if (horarioDeLocacao != null) {

				int i = getMapAutomovelHorariosDeLocacao().get(automovel).indexOf(horarioDeLocacao);
				setHorarioQueDevolveu(getMapAutomovelHorariosDeLocacao().get(automovel).get(i));
				System.out.println("Devolvendo Automovel");
				carrosAlugados.remove(automovel);
				carrosDisponiveis.add(automovel);

				System.out.println("Obrigado por utilizar a Azure Locadora");
			} else {
				System.out.println("O horario alugado e inexistente");
			}
		}
	}

	private HorarioDeLocacao setHorarioQueAlugou() {

		HorarioDeLocacao horarioQueAlugou = new HorarioDeLocacao();

		horarioQueAlugou.setHorarioQueAlugou();
		horarioQueAlugou.setDataQueAlugou();

		return horarioQueAlugou;
	}

	private void setHorarioQueDevolveu(HorarioDeLocacao horarioQueAlugou) {

		horarioQueAlugou.setDataQueDevolveu();
		horarioQueAlugou.setHorarioQueDevolveu();
	}

}
