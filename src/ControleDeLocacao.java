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

	public HorarioDeLocacao aluga(Cliente cliente, Automovel automovel, Agencia agencia) {
		if (carrosDisponiveis.contains(automovel)) {
			HorarioDeLocacao horarioQueAlugou = setHorarioQueAlugou(agencia);
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

	public void devolve(Cliente cliente, Automovel automovel, HorarioDeLocacao horarioDeLocacao, Agencia agencia,
			int tipoDeLocacao) {
		if (carrosDisponiveis.contains(automovel)) {
			throw new AlreadyAvaliable("Este automovel ja está disponível");
		} else if (!(getMapClienteAutomovel().containsKey(cliente))) {
			throw new NothingOrNotAvailable("O senhor não alugou nada ou automovel não esta disponivel");
		} else if (!getMapClienteAutomovel().get(cliente).contains(automovel)) {
			throw new NotRented("O senhor não alugou esse carro");
		} else {
			if (horarioDeLocacao != null) {


				if (tipoDeLocacao == 1) {

					int i = getMapAutomovelHorariosDeLocacao().get(automovel).indexOf(horarioDeLocacao);
					setHorarioQueDevolveu(getMapAutomovelHorariosDeLocacao().get(automovel).get(i), agencia);
					System.out.println("Devolvendo Automovel");
					LocacaoDiaria locacao = new LocacaoDiaria();
					System.out.println("O valor da alocação por diaria foi : " + locacao.devolver(horarioDeLocacao, automovel));
					carrosAlugados.remove(automovel);
					carrosDisponiveis.add(automovel);

				} else {
					int i = getMapAutomovelHorariosDeLocacao().get(automovel).indexOf(horarioDeLocacao);
					setHorarioQueDevolveu(getMapAutomovelHorariosDeLocacao().get(automovel).get(i), agencia);
					System.out.println("Devolvendo Automovel");
					LocacaoPeriodo locacaoPeriodo = new LocacaoPeriodo();
					System.out.println("O valor da alocação por periodo foi : " + locacaoPeriodo.
							devolver(horarioDeLocacao, automovel));
					carrosAlugados.remove(automovel);
					carrosDisponiveis.add(automovel);

					System.out.println("Obrigado por utilizar a Azure Locadora");

				}

			} else {
				System.out.println("O horario alugado e inexistente");
			}
		}
	}

	private HorarioDeLocacao setHorarioQueAlugou(Agencia agencia) {

		HorarioDeLocacao horarioQueAlugou = new HorarioDeLocacao();

		horarioQueAlugou.setHorarioQueAlugou();
		horarioQueAlugou.setDataQueAlugou();
		horarioQueAlugou.setAgenciaQueAlugou(agencia);

		return horarioQueAlugou;
	}

	private void setHorarioQueDevolveu(HorarioDeLocacao horarioQueAlugou, Agencia agencia) {

		horarioQueAlugou.setDataQueDevolveu();
		horarioQueAlugou.setHorarioQueDevolveu();
		horarioQueAlugou.setAgenciaQueDevolveu(agencia);

	}

}
