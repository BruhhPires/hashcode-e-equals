package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
			
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test"; // ATRIBUIÇÃO LITERAL
		String s2 = "Test";

		System.out.println(c1.hashCode());	
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // O == COMPARA AS REFERENCIAS DE MEMORIA, POR ISSO NÃO VAI SER IGUAL
		System.out.println(s1 == s2); // COMO O VALOR FOI DADO LITERAL, A LEITURA VAI ENTENDER QUE É IKGUAL NESSE CASO
	}

}
