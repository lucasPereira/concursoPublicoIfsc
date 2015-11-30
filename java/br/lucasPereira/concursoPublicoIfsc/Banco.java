package br.lucasPereira.concursoPublicoIfsc;

import java.util.List;

import br.lucasPereira.concursoPublicoIfsc.ContaBancaria;

public class Banco {

	private List<ContaBancaria> contas;
	private Double taxaDeJurosPaga;
	private Double taxaCobradaPorOperacao;

	public Banco(List<ContaBancaria> contas, Double taxaDeJurosPaga, Double taxaCobradaPorOperacao) {
		this.contas = contas;
		this.taxaDeJurosPaga = taxaDeJurosPaga;
		this.taxaCobradaPorOperacao = taxaCobradaPorOperacao;
	}

	public void pagarJurosMensal() {
		for (ContaBancaria conta : contas) {
			Integer saldo = conta.calcularSaldo();
			Double juros = saldo * taxaDeJurosPaga;
			conta.depositar(juros.intValue());
		}
	}

	public void transferir(ContaBancaria origem, ContaBancaria destino, Integer valor) {
		Double comissaoDoBanco = valor * taxaCobradaPorOperacao;
		origem.sacar(valor);
		origem.sacar(comissaoDoBanco.intValue());
		destino.depositar(valor);
	}

}
