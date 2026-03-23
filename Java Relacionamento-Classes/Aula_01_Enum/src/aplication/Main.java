package aplication;


import java.util.Date;
import entities.Pedido;
import entities.Enum.Status;

public class Main {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(324, new Date(),Status.AGUARDANDO_PAGAMENTO); //Instanciando objeto com o construtor utilizando o Enum
		
		System.out.println(pedido1);
		
		Status statusEnum = Status.ENTREGUE; // É possivel criar variaveis que recebem o tipo do Enum.
		Status statusEnum2 = Status.valueOf("ENVIADO"); // Também é possivel transformar Strings em um valor de Enum (ValueOf()), desde que a String esteja escrita da mesma forma que está na classe.
		
		System.out.println(statusEnum);
		System.out.println(statusEnum2);
	}

}
