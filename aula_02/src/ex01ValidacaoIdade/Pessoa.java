// Classe Pessoa utilizada na Main
package ex01ValidacaoIdade;

public class Pessoa {
	// Atributos
	private String nome;
	private int idade;
	private boolean idadeValida;

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
			idadeValida = true;
		} else {
			System.out.println("A idade deve ser um valor positivo ou nulo\n");
		}
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public boolean getIdadeValida() {
		return idadeValida;
	}
}
