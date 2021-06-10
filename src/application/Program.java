package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/* List<Integer> list; declarando uma lista do tipo inteiro com nome list, a List diferente
		do Vetor não aceita tipos primitivos */
		
		/* List é uma interface devido a isso torna-se necessário uma classe para instanciação, 
		 * Exemplo errado: List<String> lis = new List();
		 * Exemplo correto: List<String> list = new ArrayList<String>();
		 */
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria"); // Adcionar elemento na lista //
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		list.add(2,"Marco"); // Inserir um elemento na lista depois da posição 1 //
		
		list.remove(3); /* Remove o elemento 3 da lista, no caso: Bob, é possivel também remover
		dados da lista por comparação, Exemplo: list.remove("Ana") */
		
		System.out.println(list.size()+"\n"); // nome_da_lista.size() revela o tamanho da lista //
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		
		/* List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collector.toList();
		
		 * comando cria uma nova lista do tipo String com o nome de result e nessa nova lista atribui
		 * todos os elementos da lista list que comecem com o caractere A, depois converte o resultado
		 * para o tipo List
		 
		 */
		
		/* list.removeIf(x -> x.charAt(0) == 'M'); /* Função Lambda, remove da lista list todo elemento 
		que começe com M */
		
		for (String y : list) {
			System.out.println(y);
		}
		System.out.println("-----------------------");
		System.out.println("Index of Ana: "+ list.indexOf("Ana")); /* Vai procurar na lista list
		o elemento Ana e retornar a sua posição*/
		
		System.out.println("Index of Claudio: "+ list.indexOf("Claudio")); /* Vai procurar na lista 
		list o elemento Claudio, como não vai ser encontrado vai ser retornado o valor -1 */
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
