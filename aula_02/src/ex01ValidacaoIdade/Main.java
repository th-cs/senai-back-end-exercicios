// Lê uma entrada de nome e uma de idade. Confere se a idade é um valor válido
// e as escreve na tela
package ex01ValidacaoIdade;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Pessoa pessoa01 = new Pessoa();

		System.out.print("Olá, qual é o seu nome? ");
		pessoa01.setNome(input.nextLine());

		// Loop de repetição para ler uma entrada válida
		do {
			System.out.print("E qual é a sua idade? ");
			pessoa01.setIdade(input.nextInt());
		} while(!pessoa01.getIdadeValida());

		System.out.printf("\nVocê se chama %s e tem %d ano(s)\n",
			pessoa01.getNome(), pessoa01.getIdade());

		input.close();
	}
}
