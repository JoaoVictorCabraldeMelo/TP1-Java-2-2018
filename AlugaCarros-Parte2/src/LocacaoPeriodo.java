import java.time.Period;

public class LocacaoPeriodo implements Locacao {

	@Override
	public double devolver(HorarioDeLocacao horarioDeLocacao, Automovel automovel) {
		Period diferenca = Period.between(horarioDeLocacao.getDataQueAlugou(),
				horarioDeLocacao.getDataQueDevolveu());
		
		return diferenca.getDays() * (automovel.getValorDeLocacao() * 0.8) + automovel.getValorDeLocacao();
	}

}
