import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//for each
		
		String [] vect = new String[] {"Caio", "Fabio", "Andressa", "Daniel"};
		
		for(String obj:vect) { //For each percorre todos os elementos de um vetor sem precisar realizar condcionais
			//Sintaxe = Tipo do vetor nome de cada elemento : nome do vetor declarado.
			System.out.println(obj);
		}
		
		
		System.out.println("  ");
		//Listas
		
		//Obs: list é um tipo interface, não pode ser instanciado por ele mesmo, sendo necessario uma classe diferente da mesma, como: Arraylist
		
		List<String> list = new ArrayList<>(); //Declarando List (importando tanto List como ArrayList)
		
		list.add("Maria");
		list.add("Caio");
		list.add("Ana clara");
		list.add(2, "Cleber");
		list.remove(1); //Remove tanto pela posição.
		list.remove("Maria"); //Ou pela comparação do atributo na lista.
		
		for(String obj : list) {
			System.out.println(obj);
		}
		System.out.println("  ");
		
		list.add("Anne");
		list.add("Thalia");
		list.add("Marcos");
		list.add("Mavis");
		
		for(String obj : list) {
			System.out.println(obj);
		}
		
		list.removeIf(x -> x.charAt(0) == 'M'); //Função que remove atributo com certa condição, expressão Lambda
		System.out.println("  ");
		for(String obj : list) {
			System.out.println(obj);
		}
		System.out.println("  ");
		System.out.println("A posição do nome Anne na lista é: " + list.indexOf("Anne")); //Função que retorna o valor da posição na lista
		
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println("  ");
		
		//Explicação função acima: A questão foi filtrar somente os atributos que começavam com A, para realizar isso
		//Foi necessario a criação de outra lista do mesmo tipo. Essa lista receberá (=) a lista anterior com o stream() (List.stream())
		//O stream permite que utilizamos expressões e funções em lambda como o caso do filter() sem o stream ele não funciona.
		//Após utilizar o filter com a expressão em lambda (ilter(x -> x.charAt(0) == 'A')) fechamos o ciclo do stream com o collect(Collectors.toList())
		//Que completa a linhas de expressões anteriores às finalizando.
		//Logo a lista "resultado" só terá os nomes que começam com a letra A.
		
		//OBS: "começo = stream" + "Meio = Operações variadas" + "Final = collect" não necessariamente essas funções, mas sempre quando a um fluxo esse é o caminho!!
		
		for(String obj : resultado) {
			System.out.println(obj);
		}
		
		System.out.println("  ");
		
		String primeiroNome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		//Já essa retorna o primeiro nome com a letra A, começamos com o Stream normalmente para aceitar expressões em lambda.
		//E utilizamos a função findFirst(), o nome já diz muito, após isso colocamos o orElse(null) que se a expressção não achar um valor que começe com A ele retorna Null ou oq vc quiser que retorne.
		
		System.out.println(primeiroNome);
		
		//Obs: Há varias outras funções presentes na lista get() retorna o valor com base no endereço 0,1,2 etc
	}

}
