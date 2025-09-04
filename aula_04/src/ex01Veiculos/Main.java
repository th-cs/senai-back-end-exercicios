// Cria uma superclasse Veiculo e uma subclasse Carro que a estende. O método
// iniciar() da classe Veiculo é sobrescrito na classe Carro
package ex01Veiculos;

public class Main {
	public static void main(String[] args) {

		Veiculo veiculo01 = new Veiculo();
		Carro carro01 = new Carro();

		veiculo01.iniciar();
		carro01.iniciar();
	}
}
