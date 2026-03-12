import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// Operações Data Hora NOW
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
				
				System.out.println("Data Local padrão: " + d01);
				System.out.println("Data Local com Horas (Time): " + d02);
				System.out.println("Data Global com tipo instant: " + d03);
				
			//Obs: Sempre que a data ter horário colocar Time.
				
		//Operação Transformando String formato ISO 8601 em Data Hora
				
		LocalDate d04 = LocalDate.parse("2026-03-12");
		LocalDateTime d05 = LocalDateTime.parse("2026-03-12T00:09");
		Instant d06 = Instant.parse("2026-03-12T00:09:23Z"); //Obs: Sempre que Transformar em Global é necessario ter os segundos.
		Instant d07 = Instant.parse("2026-03-12T00:09:23-03:00"); //Com Fuso horário de 3 horas de diferença.
		
				System.out.println("Data Local Transformada (Parse): " + d04);
				System.out.println("Data Local Transformada (Parse) com Hora (Time): " + d05);
				System.out.println("Data Global Transformada (Parse) com Hora (Time): " + d06);
				System.out.println("Data Global Transformada (Parse) com Hora (Time) e Fuso horario: " + d07); //Out = 3:09 horas, porque pega como parametro o horario de londres que é 3 a mais que de São Paulo
	
				
		//Operação Transformando String formato customizado em Data Hora
				
		DateTimeFormatter formato01 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Obs: Verificar documentação (Oracle), pois possui a especificação de todas as formatações possiveis.
		DateTimeFormatter formato02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
		LocalDate d08 = LocalDate.parse("20/02/2026", formato01);
		LocalDateTime d09 = LocalDateTime.parse("25/02/2026 02:07", formato02);
		
		System.out.println("Data transformada com tipo classe Formatter: " + d08);
		System.out.println("Data Hora transformada com tipo classe Formatter: " + d09);

		//Operação Transformando String formato Dia, Mês e Ano Data Hora
		
		LocalDate d10 = LocalDate.of(2025, 9, 23);
		LocalDateTime d11 = LocalDateTime.of(2025, 5, 12, 12, 10);
		
		System.out.println(d10);
		System.out.println(d11);
		
	}

}
