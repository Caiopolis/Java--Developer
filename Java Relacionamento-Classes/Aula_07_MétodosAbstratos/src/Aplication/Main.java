package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Circulo;
import Entities.Forma;
import Entities.Retangulo;
import Entities.Enum.Cor;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Forma> listaForma = new ArrayList<>();
		
		System.out.println("Quantas formas deseja?");
		int quantFormas = sc.nextInt();
		
		for(int i=0; i < quantFormas; i++) {
			
			System.out.printf("Forma #%d%n", i+1);
			System.out.print("Retangulo ou circulo (R/C): ");
			String response = sc.next().toUpperCase();
			
			if(response.equals("R")) {
				
				System.out.println("Qual a cor da forma? (azul, preto ou vermelho)");
				String cor = sc.next().toUpperCase();
				System.out.println("Qual a altura?");
				double altura= sc.nextDouble();
				System.out.println("Qual a largura?");
				double largura= sc.nextDouble();
				
				Forma retangulo = new Retangulo(Cor.valueOf(cor), altura, largura);
				listaForma.add(retangulo);
				
			}else if (response.equals("C")){
				
				System.out.println("Qual a cor da forma? (azul, preto ou vermelho)");
				String cor = sc.next().toUpperCase();
				System.out.println("Qual o raio?");
				double raio= sc.nextDouble();
			
				
				Forma circulo = new Circulo(Cor.valueOf(cor),raio);
				listaForma.add(circulo);
				
				
			}else {
				System.out.println("A forma digitada não existe");
			}
		}
		
		System.out.println("ÁREAS DAS FORMAS");
		
		for(Forma x: listaForma) {
			System.out.println(String.format("%.2f", x.calculoArea()));
		}

	}

}
