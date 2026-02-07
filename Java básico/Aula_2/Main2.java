
public class Main2 {

	public static void main(String[] args) {
		
		int x, y; // Declarando variaveis 
		double z;
		
		x = 10; //Atribuindo valor
		
		y = x * 10;
		
		z = y / 3;
		
		System.out.println(y);
		System.out.println(x);
		System.out.println(z);

		
		//Medindo area de um trapezio 
		
		double b, B, h, area;
		
		b = 6.89;
		B = 9.0;
		h = 4.76;
		
		area = ((b + B)/2) * h;
		
		System.out.println(area);
		
		
		//Casting
		
		int a, f;
		double resultado;
		
		a = 5;
		f = 2;
        resultado = (double) a / f; // mesmo que as variaveis sejam int o casting transforma elas
        System.out.println(resultado);	
        
        //Obs: Tambem é possivel usar na atribuição das variaveis para variaveis a = (int) resultado
	}

}
