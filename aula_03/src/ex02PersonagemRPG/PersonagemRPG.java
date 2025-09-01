// Classe PersonagemRPG utilizada na classe Main
package ex02PersonagemRPG;

public class PersonagemRPG {

	// Atributos
	private String nome;
	private String classe;
	private String[] classeLista = {"Guerreiro", "Mago", "Arqueiro", "Ladino",
		"Bardo", "Cavaleiro", "Clérigo", "Druída"};
	private boolean classeAceita;
	private int nivel;
	private boolean nivelAceito;
	private int vida;
	private boolean vidaAceita;

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setClasse(int classe) {
		if (classe > 0 && classe <= classeLista.length) {
			this.classe = classeLista[classe - 1];
			classeAceita = true;
		} else {
			System.out.printf("Digite um valor entre 1 e %d\n",
				classeLista.length);
		}
	}

	public void setNivel(int nivel) {
		if (nivel > 0 && nivel <= 20) {
			this.nivel = nivel;
			nivelAceito = true;
		} else {
			System.out.println("O nível do seu personagem deve ser um valor "
				+ "entre 1 e 20\n");
		}
	}

	public void setVida(int vida) {
		if (vida >= 0 && vida <= 100) {
			this.vida = vida;
			vidaAceita = true;
		} else {
			System.out.println("A vida do seu personagem deve ser um valor "
				+ "entre 0 e 100\n");
		}
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public String getClasse() {
		return classe;
	}

	// Getter para obter o número de elementos do array
	public String[] getClasseLista() {
		return classeLista;
	}

	public boolean getClasseAceita() {
		return classeAceita;
	}

	public int getNivel() {
		return nivel;
	}

	public boolean getNivelAceito() {
		return nivelAceito;
	}

	public int getVida() {
		return vida;
	}

	public boolean getVidaAceita() {
		return vidaAceita;
	}

	// Método para passar por cada classe do array
	public String percorrerClasses(int classeEscolhida) {
		return classeLista[classeEscolhida];
	}
}
