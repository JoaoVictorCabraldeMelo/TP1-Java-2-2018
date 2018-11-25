package main;
import java.time.Period;

public class LocacaoDiaria implements Locacao {

	@Override
	public double devolver(HorarioDeLocacao horarioDeLocacao, Automovel automovel) {
		Period diferenca = Period.between(horarioDeLocacao.getDataQueAlugou(),
				horarioDeLocacao.getDataQueDevolveu());
		
		return diferenca.getDays() * automovel.getValorDeLocacao() + automovel.getValorDeLocacao();
	}

}
