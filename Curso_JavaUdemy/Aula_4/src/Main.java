
public class Main {

	public static void main(String[] args) {
		
		double x = 9.1;
		double y = -34.56;
		double z = 3;
		double a, b, c;

			//Funções matemáticas básicas:]
				
				//Raiz quadrada
		
		a = Math.sqrt(z);
		b = Math.sqrt(x);
		c = Math.sqrt(144);
		System.out.printf("Raiz quadrada de %.2f = %.2f%n", z,a);
		System.out.printf("Raiz quadrada de %.2f = %.2f%n", x,b);
		System.out.printf("Raiz quadrada de 144 = %.2f%n", c);
		
				//Potência
		
		a = Math.pow(x,z);
		b = Math.pow(y,z);
		c = Math.pow(12,z);
		System.out.printf("a potência de %.2f elevado a %.2f = %.2f%n", x,z,a);
		System.out.printf("a potência de %.2f elevado a %.2f = %.2f%n", y,z,b);
		System.out.printf("a potência de 12 elevado a %.2f = %.2f%n", z,c);
		
				//Absoluto
		
		a = Math.abs(x);
		b = Math.abs(y);
		System.out.printf("o valor absoluto de %.2f é %.2f%n", x,a);
		System.out.printf("o valor absoluto de %.2f é %.2f%n", y,b);
	}

}
