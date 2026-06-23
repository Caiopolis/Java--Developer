package Aplication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import Model.Entities.Reserva;
import Model.Exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		
		//Nessa aula o professor Nélio realizou o versionamento de 3 códigos difernetes, que vão realizar a mesma coisa, porém sua lógica é diferente,
		//Ele separou em: 1 - Muito ruim (Lógica de tratativas de erro na própria Main)
		//				  2 - Ruim (Lógica implementada em um método que retorna uma String com o erro)
		//				  3 - Boa (Lógica que utiliza a tratativas de exceções)
		//Aqui ficará somente a tratativa "Boa" para polpar tempo. Verifiquei as lógicas anteriores mostradas em video, mas não implementei o cógido delas aqui no repositório, já que são exeplos do que "Não" fazer.

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reserva reservation = new Reserva(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.attDatas(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
	
	
		
		
		
		
		
	}
	
	
	

}
