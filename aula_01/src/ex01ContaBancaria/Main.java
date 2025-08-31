// Tipo de conta bancária. Permite consultar o saldo e realizar saques e
// depósitos

// Coloca ambas as classes no mesmo pacote
package ex01ContaBancaria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Cria um objeto do tipo ContaBancaria com saldo 0
		ContaBancaria conta01 = new ContaBancaria(0);

		int menuEscolha;
		boolean menu = true;

		System.out.println("-- Conta bancária --\n");
		System.out.println("Olá, como podemos te ajudar?");

		while(menu) {
			System.out.println("\nEscolha uma das opções abaixo:\n"
				+ "[ 1 ] - Consultar o saldo da conta\n"
				+ "[ 2 ] - Realizar depósito na conta\n"
				+ "[ 3 ] - Realizar saque da conta\n"
				+ "[ 4 ] - Sair da conta");
			menuEscolha = input.nextInt();

			switch (menuEscolha) {
				// Escolhas do menu
				case 1:
					System.out.printf("O saldo da conta é R$ %.2f\n",
						conta01.getSaldo());
					break;
				case 2:
					System.out.print("Digite o valor a ser depositado: ");
					conta01.depositarValor(input.nextDouble());
					break;
				case 3:
					System.out.print("Digite o valor a ser sacado: ");
					conta01.sacarValor(input.nextDouble());
					break;
				case 4:
					// Finaliza a execução
					System.out.println("Saindo da conta...");
					menu = false;
					break;
				default:
					System.out.printf("'%d' não é uma opção válida\n",
						menuEscolha);
					break;
			}
		}

		input.close();
	}
}
