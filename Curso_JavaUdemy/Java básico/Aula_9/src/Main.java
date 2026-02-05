
public class Main {

	public static void main(String[] args) {
		
		//Funções para manipulação de String:
		
		String origem = " abc ABC AbC  SDs   ";
		
		String origemTest1 = origem.toLowerCase(); //Transforma todos os caracteres em minúsculo;
		String origemTest2 = origem.toUpperCase(); //Transforma todos os caracteres em maiúsculo;
		String origemTest3 = origem.trim(); //Remove os espaços em branco (no começo e fim da String os espaços entre os textos não);
		String origemTest4 = origem.substring(3); // Inicializa o outPut da String no ponto determinado pelo paramêtrop da função
		String origemTest5 = origem.substring(3,9); // Inicializa (no caso 3) e finaliza (no caso 9) o outPut da String no ponto determinado pelo paramêtrop da função
		String origemTest6 = origem.replace('A', '8'); // Substitui uma string pela outra.
		int origemTest7 = origem.indexOf('A'); // Localiza a primeira posição de um caracter (referênciado no paramêtro da função) na String.
		int origemTest8 = origem.lastIndexOf('A'); // Localiza a ultima posição de um caracter (referênciado no paramêtro da função) na String.
		
		System.out.println("Original -" + origem + "-");
		System.out.println("LowerCase -"+ origemTest1 + "-");
		System.out.println("UpperCase -"+ origemTest2 + "-");
		System.out.println("Trim -"+ origemTest3 + "-");
		System.out.println("SubString (3) -"+ origemTest4 + "-");
		System.out.println("SubString (3,9) -"+ origemTest5 + "-");
		System.out.println("Replace ('A','8') -"+ origemTest6 + "-");
		System.out.println("indexOf ('A') -"+ origemTest7 + "-");
		System.out.println("indexOf ('A') -"+ origemTest8 + "-");

		
		
		//Split recorta o String com base no paramêtro e guarda essas partes dentro de um vetor
		
		String testandoSplit = "Arroz Feijão Batata";
		
		String[] vect = testandoSplit.split(" ");
		
		System.out.println(vect[1]);
		
			
	}

}
