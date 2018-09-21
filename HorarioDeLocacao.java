import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HorarioDeLocacao {
	
	private LocalTime horarioQueAlugou;
	private LocalDate dataQueAlugou;
	private LocalTime horarioQueDevolveu;
	private LocalDate dataQueDevolveu;
	
	public void setDataQueAlugou() {
		LocalDate dataQueAlugou = LocalDate.now();
		this.dataQueAlugou = dataQueAlugou;
	}
	
	public void setHorarioQueAlugou() {
		LocalTime horarioQueAlugou = LocalTime.now();
		this.horarioQueAlugou = horarioQueAlugou;
	}
	
	public void setHorarioQueDevolveu() {
		LocalTime horarioQueDevolveu = LocalTime.now();
		this.horarioQueDevolveu = horarioQueDevolveu;
	}
	
	public void setDataQueDevolveu() {
		LocalDate dataQueDevolveu = LocalDate.now();
		this.dataQueDevolveu = dataQueDevolveu;
	}
	
	public LocalDate getDataQueAlugou() {
		return dataQueAlugou;
	}
	
	public LocalDate getDataQueDevolveu() {
		return dataQueDevolveu;
	}
	
	public LocalTime getHorarioQueAlugou() {
		return horarioQueAlugou;
	}
	
	public LocalTime getHorarioQueDevolveu() {
		return horarioQueDevolveu;
	}
	
	public void printHorarioEData(LocalTime horario, LocalDate data) {
		
		DateTimeFormatter formatHour = DateTimeFormatter.ofPattern("hh:mm:ss");

		DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato ele pra dia/mes/ano

		System.out.println(horario.format(formatHour));

		System.out.println(data.format(formatData));

		
	}
	

}
