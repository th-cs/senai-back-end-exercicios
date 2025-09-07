// Classe Onibus utilizada na classe Main
// Subclasse da classe Veiculo
package ex01SistemaTransporte;

public class Onibus extends Veiculo {

	// Atributos
	private int numeroParadas;

	// Construtor
	public Onibus(float velocidadeMedia) {
		super(velocidadeMedia);
	}

	// Setter
	public void setNumeroParadas(int numeroParadas) {
		this.numeroParadas = numeroParadas;
	}

	// Método sobrescrito
	@Override
	public void calcularTempo(float distancia) {
		float tempoTotal = ((distancia / super.getVelocidadeMedia()) * 60) +
			15 * numeroParadas;
		float calculoHora = (int)(tempoTotal / 60);
		float calculoMinuto = tempoTotal % 60;

		System.out.printf("Modelo: %s\n"
			+ "Velocidade Média: %.0f Km/h\n"
			+ "Número de paradas: %d (+ %d hora(s) e %d minuto(s) de viagem)\n"
			+ "Tempo total de viagem: %.0f hora(s) e %.0f minuto(s)\n",
			super.getModelo(), super.getVelocidadeMedia(), numeroParadas,
			(int)(numeroParadas * 15) / 60, (numeroParadas * 15) % 60,
			calculoHora, calculoMinuto);
	}
}
