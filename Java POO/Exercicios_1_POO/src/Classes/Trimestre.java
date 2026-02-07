package Classes;

public class Trimestre {

		public String nome;
		public double nota1,nota2,nota3, notaFinal;
		
		
		
		public double calculoNota() {
			
			notaFinal = nota1 + nota2 + nota3;
			return notaFinal;
			
		}
		
		public void validarNota() {
			
			if(this.calculoNota() < 60) {
				
				System.out.println("Infelizmente sua nota não é suficiente: " + this.notaFinal);
				System.out.printf("Faltando %.2f pontos", notaFinal - 60);
			}else {
				
				System.out.println("Parabens você passou!! Sua nota foi: "+this.notaFinal);
			}
			
		}
}
