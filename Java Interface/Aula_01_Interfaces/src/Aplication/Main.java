package Aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Entities.AluguelVeiculo;
import Entities.Veiculo;
import Service.BrasilSevice;
import Service.FaturaService;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do aluguel");	
		System.out.print("Modelo do carro: ");	
		String nomeCarro = sc.next();
		System.out.println("Retirada (dd/MM/yyyy hh:mm): ");	
		sc.nextLine();
		LocalDateTime comeco = LocalDateTime.parse(sc.nextLine(), fm);
		System.out.println("Retorno (dd/MM/yyyy hh:mm): ");	 	
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fm);
		
		AluguelVeiculo aluguelVeiculo = new AluguelVeiculo(comeco, fim, new Veiculo(nomeCarro));
		
		
		System.out.println("Entre com o preço por hora: ");	
		double precoPorHora = sc.nextDouble();
		System.out.println("Entre com o preço por hora: ");	
		double precoPorDia = sc.nextDouble();
	
		FaturaService faturaService = new FaturaService(precoPorHora, precoPorDia, new BrasilSevice());
			
		faturaService.processoFatura(aluguelVeiculo);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + aluguelVeiculo.getFatura().getPagamentoBasico());
		System.out.println("Imposto: " + aluguelVeiculo.getFatura().getTaxa());
		System.out.println("Pagamento Total: " + aluguelVeiculo.getFatura().getTotalFatura());
		
		
		
		
		sc.close();

	}

}
