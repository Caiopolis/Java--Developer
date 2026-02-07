package Classes;

public class Conversor {
		
	public static double valorUnitarioDolar;
	public static double valorDolar;
	
	
	
	public static double convercao() {
		
		return valorUnitarioDolar * (valorDolar*6/100 + valorDolar); 
	}
}
