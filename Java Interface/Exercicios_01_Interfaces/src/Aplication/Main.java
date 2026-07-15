package Aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Entities.Contrato;
import Entities.Parcelas;
import Services.ContratoService;
import Services.PayPalService;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.println("Numero: ");
		int numeroContrato = sc.nextInt();
		System.out.println("Data: ");
		LocalDate data = LocalDate.parse(sc.next(), fm);
		System.out.println("Valor do contrato: ");
		double valorContrato = sc.nextDouble();
		System.out.println("Entre com o numero de parcelas: ");
		int numParcelas = sc.nextInt();

		
		Contrato contrato = new Contrato(numeroContrato, data , valorContrato);
		ContratoService contratoService = new ContratoService(new PayPalService());
		
		contratoService.processamentoContrato(contrato, numParcelas);
		
		System.out.println("PARCELAS:");
		for(Parcelas x : contrato.getListaParcelas() ) {
			System.out.println(x);
		}

	}

}
