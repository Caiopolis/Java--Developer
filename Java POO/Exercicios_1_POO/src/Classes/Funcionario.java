package Classes;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	
	public double salarioLiquido() {
		
		return this.salarioBruto - this.taxa;
		
	}
	
	public double calculoAumentoSalario(double porcent) {
		
		return this.salarioLiquido() + (porcent/100 * this.salarioBruto);
		
		
	}
	
}
