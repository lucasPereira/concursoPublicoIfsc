package br.lucasPereira.concursoPublicoIfsc;

import java.util.ArrayList;
import java.util.List;

public class SistemaBancario {

	public static void main(String[] argumentos) {
		ContaBancaria contaDaMaria = new ContaBancaria();
		ContaBancaria contaDoPedro = new ContaBancaria();
		// contaDaMaria.calcularSaldo() == 0.
		// contaDoPedro.calcularSaldo() == 0.

		contaDaMaria.depositar(20);
		contaDoPedro.depositar(10);
		// contaDaMaria.calcularSaldo() == 20.
		// contaDoPedro.calcularSaldo() == 10.

		List<ContaBancaria> contas = new ArrayList<>();
		contas.add(contaDaMaria);
		contas.add(contaDoPedro);
		Banco caixaEconomica = new Banco(contas, 0.5, 0.1);
		caixaEconomica.pagarJurosMensal();
		// contaDaMaria.calcularSaldo() == 30.
		// contaDoPedro.calcularSaldo() == 15.

		caixaEconomica.transferir(contaDaMaria, contaDoPedro, 10);
		// contaDaMaria.calcularSaldo() == 19.
		// contaDoPedro.calcularSaldo() == 25.
	}

}
