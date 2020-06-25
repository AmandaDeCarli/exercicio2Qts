package br.org.senairs.exercicio2g2Qts.exercicio2g2Qts;

import org.junit.Assert;
import org.junit.Test;
import br.org.senairs.exercicio2g2Qts.Funcionario;
import br.org.senairs.exercicio2g2Qts.ValidaFuncionario;

public class FuncionarioTestUnitario {

	@Test
	public void testvalidaNomeOk() {
		ValidaFuncionario validator = new ValidaFuncionario();
		Funcionario funcionario = criaFuncionario();
		boolean resultado = validator.validar(funcionario);
		Assert.assertEquals(true, resultado);
		Assert.assertTrue(resultado);
	}

	@Test
	public void testvalidaNomeError() {
		ValidaFuncionario validator = new ValidaFuncionario();
		Funcionario funcionario = criaFuncionario();
		funcionario.setNomeFuncionario("");
		Assert.assertFalse(validator.validar(funcionario));
		Assert.assertEquals(false, validator.validar(funcionario));
	}

	private Funcionario criaFuncionario() {
		Funcionario funcionario = new Funcionario();

		funcionario.setNomeFuncionario("Joana");
		funcionario.setSetor("Administrativo");

		return funcionario;
	}

}
