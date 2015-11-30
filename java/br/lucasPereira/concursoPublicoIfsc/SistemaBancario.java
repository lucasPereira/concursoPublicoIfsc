package br.lucasPereira.concursoPublicoIfsc;

import java.util.ArrayList;
import java.util.List;

public class SistemaBancario {

	public static void main(String[] argumentos) {
		ContaBancaria contaDaMaria = new ContaBancaria();
		ContaBancaria contaDoPedro = new ContaBancaria();
		// contaDaMaria.saldo = 0.
		// contaDoPedro.saldo = 0.
		System.out.println(contaDaMaria.calcularSaldo());
		System.out.println(contaDoPedro.calcularSaldo());

		contaDaMaria.depositar(20);
		contaDoPedro.depositar(10);
		// contaDaMaria.saldo = 20.
		// contaDoPedro.saldo = 10.
		System.out.println(contaDaMaria.calcularSaldo());
		System.out.println(contaDoPedro.calcularSaldo());

		List<ContaBancaria> contas = new ArrayList<>();
		contas.add(contaDaMaria);
		contas.add(contaDoPedro);
		Banco caixaEconomicaFederal = new Banco(contas, 0.5, 0.1);
		caixaEconomicaFederal.pagarJurosMensalAosClientes();
		// contaDaMaria.saldo = 30.
		// contaDoPedro.saldo = 15.
		System.out.println(contaDaMaria.calcularSaldo());
		System.out.println(contaDoPedro.calcularSaldo());

		caixaEconomicaFederal.transferir(contaDaMaria, contaDoPedro, 10);
		// contaDaMaria.saldo = 19.
		// contaDoPedro.saldo = 25.
		System.out.println(contaDaMaria.calcularSaldo());
		System.out.println(contaDoPedro.calcularSaldo());
	}

}
