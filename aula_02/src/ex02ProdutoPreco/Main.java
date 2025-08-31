// Lê as entradas de nome de produto, preço e percentual de desconto. Calcula o
// preço com desconto e o escreve na tela
package ex02ProdutoPreco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Produto produto01 = new Produto();

		System.out.println("-- Cálculo de desconto --\n");
		System.out.print("Olá, digite o nome do produto: ");
		produto01.setNome(input.nextLine());

		// Loop para validar o preço
		do {
			System.out.print("Digite o preço do produto: ");
			produto01.setPreco(input.nextDouble());
		} while(!produto01.getPrecoValido());

		// Loop para validar o percentual de desconto
		do {
			System.out.print("Digite o percentual de desconto: ");
			produto01.setPercentualDesconto(input.nextDouble());
		} while(!produto01.getPercentualValido());

		System.out.println("Calculando desconto...");
		produto01.aplicarDesconto();

		System.out.printf("\nProduto: %s\n"
			+ "Preço: R$ %.2f\n"
			+ "Percentual de desconto: %.1f%%\n"
			+ "Preço com desconto: R$ %.2f (Desconto de R$ %.2f)\n",
			produto01.getNome(), produto01.getPreco(),
			produto01.getPercentualDesconto(), produto01.getPrecoDesconto(),
			produto01.getPreco() - produto01.getPrecoDesconto());

		input.close();
	}
}
