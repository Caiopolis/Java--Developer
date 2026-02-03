import java.util.Scanner;

public class ExercicioRepeticao_4 {

	public static void main(String[] args) {
		
		int quantNum, somaIn = 0, somaOut = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de numeros para verificar quais estão no intervalo de [10,20]:");
		quantNum = sc.nextInt();
		
		for(int i = 0; i != quantNum; i++) {
			
			int num;
			System.out.println("Digite os numero que deseja verificar:");
			num = sc.nextInt();
			
			if(num > 10 && num < 20) {
				somaIn++;
			}else {
				somaOut++;
			}

			
		}
		
		System.out.printf("%d In's%n",somaIn);
		System.out.printf("%d Out's", somaOut);
		
	}

}
