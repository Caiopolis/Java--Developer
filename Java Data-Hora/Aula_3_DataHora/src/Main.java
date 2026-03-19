import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		// Operações com DataHora - e +
		
		LocalDate d01 = LocalDate.parse("2026-03-12");
		LocalDateTime d02 = LocalDateTime.parse("2026-03-12T02:09");
		Instant d03 = Instant.parse("2026-03-12T02:09:23Z");
		
		LocalDate semanaPassada = d01.minusDays(7); //Subtraindo dias, mas existem varias opreções possiveis de meses, horas etc.
		LocalDate semanaQueVem = d01.plusDays(7); // Add dias.
		
		System.out.println("Semana Passada D01 = " + semanaPassada);
		System.out.println("Semana que vem D01 = " + semanaQueVem);
		
		
		LocalDateTime horasAdiantadas = d02.plusHours(4); //Add Horas
		LocalDateTime horasAtrasadas = d02.minusHours(6); //Sub Horas
		LocalDateTime semanaQueVemTime = d02.plusDays(7);
		LocalDateTime semanaPassadaTime = d02.minusDays(7);
		
		System.out.println("Horas adiantadas D02 = " + horasAdiantadas);
		System.out.println("Horas atrasadas D02 = " + horasAtrasadas);
		
		
		Instant semanaPassadaInstant = d03.minus(7, ChronoUnit.DAYS); //Instant não possuí métodos iguais as classes LocalDate, por isso é necessario especificar o tipo que deseja com ChronoUnit 
		Instant semanaQueVemInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana passada Instant = " + semanaPassadaInstant);
		System.out.println("Semana que vem Instant = " + semanaQueVemInstant);
		
		
		
		// Operação Duration
		
		Duration t1 = Duration.between(semanaPassada.atTime(0, 0), d01.atTime(0, 0)); //Não é possivel vomprar as datas pois não há segundos nop LocalDate, por isso é necessario a converção com atTime (Adiciona tempo no localdate)
		Duration t2 = Duration.between(semanaPassadaTime, d02); //Para medir a duração de uma data a outra utilizamos a Classe Duration, e dentro dela há a operação
															    // Duration.between() que vai comparar duas datas distintas e retornar a duração entre elas.
		
		System.out.println("Duração entre d01 e a semana passada do mesmo é = " + t2.toDays());
		System.out.println("Duração entre d01 e a semana passada do mesmo é = " + t1.toDays());
		
		//Obs: Na conversão do LocalDate é possivel utilizar o método atStartOfDay() que considera o valor 00
	}

}
