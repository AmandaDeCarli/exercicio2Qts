package br.org.senairs.exercicio2g2Qts.exercicio2g2Qts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.senairs.exercicio2g2Qts.BdContaCorrente;
import br.org.senairs.exercicio2g2Qts.ContaCorrente;

public class ContaCorrenteTestIntegracao {

	private BdContaCorrente banco;

	@Before
	public void init() {
		banco = new BdContaCorrente();
	}

	@Test
	public void testInsert() {
		ContaCorrente conta = new ContaCorrente();
		conta.setSaldo(2350.00F);
		conta.setNomeCorrentista("Claudia");
		banco.insertConta(conta);
		int id = conta.getIdConta();
		Assert.assertNotNull(banco.buscaContaCorrente(id));
	}

}
