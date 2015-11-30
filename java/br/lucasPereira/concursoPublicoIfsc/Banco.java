package br.lucasPereira.concursoPublicoIfsc;

import java.util.List;

public class Banco {

	private List<ContaBancaria> contas;
	private Double taxaDeJurosPaga;
	private Double taxaDeOperacoesCobrada;

	public Banco(List<ContaBancaria> contas, Double taxaDeJurosPaga, Double taxaDeOperacoesCobrada) {
		this.contas = contas;
		this.taxaDeJurosPaga = taxaDeJurosPaga;
		this.taxaDeOperacoesCobrada = taxaDeOperacoesCobrada;
	}

	public void pagarJurosMensalAosClientes() {
		for (ContaBancaria conta : contas) {
			Integer saldo = conta.calcularSaldo();
			Double juros = saldo * taxaDeJurosPaga;
			conta.depositar(juros.intValue());
		}
	}

	public void transferir(ContaBancaria origem, ContaBancaria destino, Integer valorDaTransferencia) {
		Double comissaoDoBanco = valorDaTransferencia * taxaDeOperacoesCobrada;
		origem.sacar(valorDaTransferencia);
		origem.sacar(comissaoDoBanco.intValue());
		destino.depositar(valorDaTransferencia);
	}

}
