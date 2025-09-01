// Classe Livro utilizada na classe Main
package ex01Livro;

public class Livro {

	// Atributos
	private String nome;
	private String autor;
	private int numeroPaginas;
	private boolean numeroPaginasValido;

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		if (numeroPaginas >= 5) {
			this.numeroPaginas = numeroPaginas;
			numeroPaginasValido = true;
		} else if (numeroPaginas <= 0) {
			System.out.println("Número de páginas inválido\n");
		} else {
			System.out.println("O livro deve ter 5 páginas ou mais\n");
		}
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public boolean getNumeroPaginasValido() {
		return numeroPaginasValido;
	}
}
