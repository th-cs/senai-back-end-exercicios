// Cria um personagem de RPG. Lê o nome do personagem, classe, nível e vida.
// Depois confere se os valores digitados são válidos e os escreve na tela
package ex02PersonagemRPG;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		PersonagemRPG personagem01 = new PersonagemRPG();

		boolean menu;
		int escolhaAtualizar;

		System.out.println("-- Criação do personagem --\n");

		menu = true;

		while(menu) {
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
				System.out.print("Digite o nível do seu personagem (Intervalo: "
					+ "1 - 20): ");
				personagem01.setNivel(input.nextInt());
			} while (!personagem01.getNivelAceito());

			// Loop para conferir a vida
			do {
				System.out.print("Digite a vida do seu personagem (Intervalo: "
					+ "0 - 100): ");
				personagem01.setVida(input.nextInt());
			} while (!personagem01.getVidaAceita());

			System.out.printf("\nNome do personagem: %s\n"
				+ "Classe: %s\n"
				+ "Nível: Lv %d\n"
				+ "Vida: %d HP\n", personagem01.getNome(),
				personagem01.getClasse(), personagem01.getNivel(),
				personagem01.getVida());

			if (personagem01.getVida() == 0) {
				System.out.println("O seu personagem tá morto, foi de base, "
					+ "não tankou, virou lost media");
			}

			// Loop para concluir ou atualizar o personagem
			do {
				System.out.println("\nComo deseja continuar?\n"
					+ "[ 1 ] - Concluir personagem\n"
					+ "[ 2 ] - Atualizar status do personagem");
				escolhaAtualizar = input.nextInt();

				switch(escolhaAtualizar) {
					case 1:
						System.out.println("Personagem criado!");
						System.out.println("Saindo da criação de personagem"
							+ "...");
						menu = false;
						break;
					case 2:
						// Retorna os valores para os iniciais
						personagem01.setClasseAceita(false);
						personagem01.setNivelAceito(false);
						personagem01.setVidaAceita(false);
						input.nextLine();
						break;
					default:
						System.out.printf("'%d' não é uma opção. Por favor, "
							+ "digite 1 ou 2\n", escolhaAtualizar);
						break;
				}
			} while(escolhaAtualizar < 1 || escolhaAtualizar > 2);
		}

		input.close();
	}
}
