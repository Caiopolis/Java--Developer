import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// Formatação Data Hora 
		
		LocalDate d01 = LocalDate.parse("2026-03-12");
		LocalDateTime d02 = LocalDateTime.parse("2026-03-12T02:09");
		Instant d03 = Instant.parse("2026-03-12T02:09:23Z");
		
		 
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Utilizando withZone para especificar a localidade padrão do sistema local. Instant não possui Format.
		DateTimeFormatter fm4 = DateTimeFormatter.ISO_DATE_TIME; // Na documentação da biblioteca formatter há varios formatos já prontos;
		DateTimeFormatter fm5 = DateTimeFormatter.ISO_INSTANT; // Para data Global
				
		System.out.println(d01);
		System.out.println("D01 = " + d01.format(fm1)); //Para transformar um Data hora em String utilizamos o formatter, e com ele o utilizamops como extensão da variavel com o format
		System.out.println(d02);
		System.out.println("D02 = " + d02.format(fm2));
		System.out.println(d03);
		System.out.println("D03 = " + fm3.format(d03)); //Como Instant não possui Format, é necessario inverter a sintaxe, que funciona igualmente para qualquer dataHora.
		System.out.println("D02 = " + fm4.format(d02));
		System.out.println("D03 = " + fm5.format(d03));
		
		
		
		//Convertendo Data Global para Local
		
		LocalDate resposta1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); // Transformamos a partir do ofInstant uma data global para local especificando o fuso horario com o ZoneId, neste caso, o da maquina padrão.
		LocalDate resposta2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal")); // Já aqui especificamos o local, no caso Portugal com o ZoneId.of();
		LocalDateTime resposta3 = LocalDateTime.ofInstant(d03, ZoneId.of("America/Sao_Paulo"));
		
		System.out.println(resposta1);
		System.out.println(resposta2);
		System.out.println(resposta3);
		
		//Pegando dados especificos do DataHora
		
		System.out.println("Dia D01 = " + d01.getDayOfMonth());
		System.out.println("Num mês D01 = " + d01.getMonthValue());
		System.out.println("Mês D01 = " + d01.getMonth());
		System.out.println("Ano D01 = " + d01.getYear());
		System.out.println("Hora D02 = " + d02.getHour());
		System.out.println("minutos D02 = " + d02.getMinute());
	
	}
	
	
	

}
