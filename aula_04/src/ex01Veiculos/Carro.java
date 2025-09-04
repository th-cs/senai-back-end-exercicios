// Classe Carro utilizada na classe Main
// Subclasse da classe Veiculo
package ex01Veiculos;

public class Carro extends Veiculo{

	// Método sobrescrito
	@Override
	public void iniciar() {
		System.out.println("O carro está iniciando...");
	}
}
