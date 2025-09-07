// Calcula o tempo de viagem de uma bicicleta, um ônibus e um carro com
// velocidades médias diferentes. Leva em conta o número de paradas do ônibus
package ex01SistemaTransporte;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int escolhaMenu;
		boolean menu;
		float distancia;

		Bicicleta bicicleta01 = new Bicicleta(20);
		Onibus onibus01 = new Onibus(60);
		Carro carro01 = new Carro(80);

		String[] veiculoTipo = {"Bicicleta", "Ônibus", "Carro"};
		Veiculo[] veiculoLista = {bicicleta01, onibus01, carro01};

		System.out.println("-- Sistema de Transporte: Cálculo do tempo de "
			+ "viagem para diferentes veículos --\n");

		menu = true;

		while(menu) {
			System.out.println("Velocidade média de cada veículo:");

			// Lista a velocidade média de cada tipo de veículo
			for (int i = 0; i < veiculoTipo.length; i++) {
				System.out.printf("%s: %.0f Km/h\n", veiculoTipo[i],
					veiculoLista[i].getVelocidadeMedia());
			}

			System.out.print("\nOlá, ");
			for (int i = 0; i < veiculoTipo.length; i++) {
				if (i < 1) {
					System.out.printf("digite o modelo da %s: ",
						veiculoTipo[i]);
				} else {
					System.out.printf("Digite o modelo do %s: ",
						veiculoTipo[i]);
				}
				veiculoLista[i].setModelo(input.nextLine());
			}

			System.out.print("Digite a quantidade de paradas do ônibus\n(cada "
				+ "parada acrescenta 15 minutos na viagem): ");
			onibus01.setNumeroParadas(input.nextInt());

			System.out.print("Digite a distância total do percurso: ");
			distancia = input.nextFloat();

			System.out.printf("\nCálculo para uma viagem de %.0f Km:\n",
				distancia);

			// Calcula e escreve o tempo do percurso para cada veículo no array
			for (int i = 0; i < veiculoTipo.length; i++) {
				System.out.printf("\n- %s -\n", veiculoTipo[i]);
				veiculoLista[i].calcularTempo(distancia);
			}

			do {
				System.out.println("\nDeseja calcular novamente com outros "
					+ "valores?\n"
					+ "[ 1 ] - Sim\n"
					+ "[ 2 ] - Não");
				escolhaMenu = input.nextInt();

				switch (escolhaMenu) {
					case 1:
						input.nextLine();
						break;
					case 2:
						System.out.println("Saindo do sistema...");
						menu = false;
						break;
					default:
						System.out.println("Opção inválida");
						break;
				}
			} while(escolhaMenu < 1 || escolhaMenu > 2);
		}

		input.close();
	}
}
