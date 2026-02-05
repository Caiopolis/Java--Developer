import java.util.Scanner;

public class ExercicioRepeticao_3 {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor maior que 1, porém menor que 1000");
		x = sc.nextInt();
		

		if(x < 1 || x > 1000 ) {
			System.out.println("valor invalido!!");
		}else {
			
			for(int i = 0; i < x; i++) {
				
				if(i % 2 == 1) {
					
					System.out.println(i);
				}else {
					System.out.println("");
				}
				
			}
			
		}
		
		
	}

}
