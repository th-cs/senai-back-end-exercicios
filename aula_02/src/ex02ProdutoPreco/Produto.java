// Classe Produto utilizada na Main
package ex02ProdutoPreco;

public class Produto {
	// Atributos
	private String nome;
	private double preco;
	private boolean precoValido;
	private double percentualDesconto;
	private boolean percentualValido;
	private double precoDesconto;

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		if (preco >= 0) {
			this.preco = preco;
			precoValido = true;
		} else {
			System.out.println("Digite um valor positivo ou nulo\n");
		}
	}

	public void setPercentualDesconto(double percentualDesconto) {
		if (percentualDesconto >= 0 && percentualDesconto <= 100) {
			this.percentualDesconto = percentualDesconto;
			percentualValido = true;
		} else {
			System.out.println("O percentual de desconto tem que estar entre "
				+ "0% e 100%\n");
		}
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public boolean getPrecoValido() {
		return precoValido;
	}

	public double getPercentualDesconto() {
		return percentualDesconto;
	}

	public boolean getPercentualValido() {
		return percentualValido;
	}

	public double getPrecoDesconto() {
		return precoDesconto;
	}

	// Método para calcular o desconto
	public void aplicarDesconto() {
		precoDesconto = preco - (preco / 100) * percentualDesconto;
	}
}
