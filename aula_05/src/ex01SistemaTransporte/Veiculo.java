// Classe Veiculo utilizada na classe Main
// Superclasse das classes Bicicleta, Onibus e Carro
package ex01SistemaTransporte;

public class Veiculo {
	// Atributos
	private String modelo;
	private float velocidadeMedia;

	// Construtor
	public Veiculo(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	// Setter
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Getters
	public String getModelo() {
		return modelo;
	}

	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}

	// Método
	public void calcularTempo(float distancia) {
		float tempoTotal = (distancia / velocidadeMedia) * 60;
		float calculoHora = (int)(tempoTotal / 60);
		float calculoMinuto = tempoTotal % 60;

		System.out.printf("Modelo: %s\n"
			+ "Velocidade Média: %.0f Km/h\n"
			+ "Tempo total de viagem: %.0f hora(s) e %.0f minuto(s)\n", modelo,
			velocidadeMedia, calculoHora, calculoMinuto);
	}
}
