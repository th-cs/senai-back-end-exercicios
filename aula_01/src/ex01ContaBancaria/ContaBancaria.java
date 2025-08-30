// Classe utilizada na Main

// Coloca ambas as classes no mesmo pacote
package ex01ContaBancaria;

public class ContaBancaria {

	// Atributo
	private double saldo;

	// Construtor
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}

	// Getter
	public double getSaldo() {
		return saldo;
	}

	// Métodos
	public void depositarValor(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito realizado!");
		} else if (valor == 0) {
			System.out.println("Você precisa digitar algum valor maior que 0");
		} else {
			System.out.println("Valor digitado inválido");
		}
	}

	public void sacarValor(double saque) {
		if (saldo >= saque && saque > 0) {
			saldo -= saque;
			System.out.println("Saque realizado!");
		} else if (saldo < saque) {
			System.out.println("Saldo insuficiente para realizar esta "
				+ "operação");
		} else if (saque == 0) {
			System.out.println("Você precisa digitar algum valor maior que 0");
		} else {
			System.out.println("Valor digitado inválido");
		}
	}
}
