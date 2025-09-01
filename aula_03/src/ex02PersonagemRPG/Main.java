// Cria um personagem de RPG. Lê o nome do personagem, classe, nível e vida.
// Depois confere se os valores digitados são válidos e os escreve na tela
package ex02PersonagemRPG;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		PersonagemRPG personagem01 = new PersonagemRPG();

		System.out.println("-- Criação do personagem --\n");

		System.out.print("Olá, como o seu personagem vai se chamar? ");
		personagem01.setNome(input.nextLine());

		System.out.println("Classes disponíveis:");

		// Lista o array com todas as classes disponíveis
		for (int i = 0; i < personagem01.getClasseLista().length; i++) {
			System.out.printf("[ %d ] - %s\n", i + 1,
				personagem01.percorrerClasses(i));
		}

		// Loop para conferir a classe
		do {
			System.out.print("\nDigite o valor da classe escolhida: ");
			personagem01.setClasse(input.nextInt());
		} while (!personagem01.getClasseAceita());

		// Loop para conferir o nível
		do {
			System.out.print("Digite o nível do seu personagem: ");
			personagem01.setNivel(input.nextInt());
		} while (!personagem01.getNivelAceito());

		// Loop para conferir a vida
		do {
			System.out.print("Digite a vida do seu personagem: ");
			personagem01.setVida(input.nextInt());
		} while (!personagem01.getVidaAceita());

		System.out.println("Personagem criado!\n");

		System.out.printf("Nome do personagem: %s\n"
			+ "Classe: %s\n"
			+ "Nível: Lv %d\n"
			+ "Vida: %d HP\n", personagem01.getNome(), personagem01.getClasse(),
			personagem01.getNivel(), personagem01.getVida());

		if (personagem01.getVida() == 0) {
			System.out.println("O seu personagem tá morto, foi de base, não "
				+ "tankou, virou lost media");
		}

		System.out.println("Saindo da criação de personagem...");

		input.close();
	}
}
