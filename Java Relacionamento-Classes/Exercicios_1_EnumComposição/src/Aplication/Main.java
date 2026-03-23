package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entities.ContratoHora;
import Entities.Departamento;
import Entities.Trabalhador;
import Entities.Enum.LevelTrabalhador;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("MM/yyyy");
		
		System.out.print("Digite o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		Departamento departamento = new Departamento(nomeDepartamento);
		
		
		System.out.println("Digite os dados do trabalhador");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.next();
		System.out.print("Digite o nivel de experiência:");
		String level = sc.next().toUpperCase();
		System.out.print("Digite a base salarial: ");
		double salarioBase = sc.nextDouble();
	
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, LevelTrabalhador.valueOf(level), salarioBase,departamento ); //Para utilizar o Enum usar ValueOf na classe enum para ler o String.

		System.out.println("Qauntos contratos esse trabalhador terá: ");
		int numContratos = sc.nextInt();
		
		for(int i = 0; i < numContratos; i++) {
			
			System.out.println("Entre com os dados do contrato " + i+1 + "#");
			System.out.println("Data: ");
			Date dataContrato = format1.parse(sc.next());
			
			System.out.println("Valor por Hora: ");
			double valorHora = sc.nextDouble();
			
			System.out.println("Horas de trabalho: ");
			int horasDeTrabalho = sc.nextInt();
			
			ContratoHora contrato = new ContratoHora(dataContrato,valorHora,horasDeTrabalho);
			
			trabalhador.addContrato(contrato);
			
		}
		
		System.out.println("Digite o mês e o ano para calcular montante (MM/YYYY): ");
		String mesAno = sc.next();
		
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome: " + trabalhador.getName());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
		System.out.println("O Montante de "+mesAno+": " + String.format("%.2f", trabalhador.montantePorMes(ano, mes)));
		
		
		
		sc.close();

	}

}
