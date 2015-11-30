package br.lucasPereira.concursoPublicoIfsc;

public class ContaBancaria {

	private Integer saldo;

	public ContaBancaria() {
		this.saldo = 0;
	}

	public void depositar(Integer valor) {
		saldo = saldo + valor;
	}

	public void sacar(Integer valor) {
		saldo = saldo - valor;
	}

	public Integer calcularSaldo() {
		return saldo;
	}

}
