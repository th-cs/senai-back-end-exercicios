// Adiciona livros a uma biblioteca digital. Lê o nome do livro, autor e número
// de paǵinas e retorna as informações
package ex01Livro;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Cria um objeto do tipo Livro
		Livro livro01 = new Livro();

		System.out.println("-- Biblioteca digital --\n");

		System.out.print("Olá, digite o nome do livro que deseja adicionar: ");
		livro01.setNome(input.nextLine());

		System.out.print("Agora digite o nome do autor do livro: ");
		livro01.setAutor(input.nextLine());

		// Loop para verificar o número de páginas do livro
		do {
			System.out.print("Digite o número de páginas do livro: ");
			livro01.setNumeroPaginas(input.nextInt());
		} while(!livro01.getNumeroPaginasValido());

		System.out.println("Livro adicionado à biblioteca!\n");

		System.out.printf("Título: %s\n"
			+ "Autor: %s\n"
			+ "Número de páginas: %d\n", livro01.getNome(), livro01.getAutor(),
			livro01.getNumeroPaginas());

		input.close();
	}
}
