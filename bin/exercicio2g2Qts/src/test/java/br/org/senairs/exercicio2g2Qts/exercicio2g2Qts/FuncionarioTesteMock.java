package br.org.senairs.exercicio2g2Qts.exercicio2g2Qts;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;
import br.org.senairs.exercicio2g2Qts.Funcionario;
import junit.framework.Assert;

public class FuncionarioTesteMock {

	@Test
	public void testFuncionario() {
		Funcionario bancoDados = Mockito.mock(Funcionario.class);
		when(bancoDados.buscaSetor("Administrativo")).thenReturn("Luana");

		Assert.assertEquals("Luana", bancoDados.buscaSetor("Administrativo"));

		when(bancoDados.buscaSetor("Financeiro")).thenReturn("Fabrine");

		Assert.assertEquals("Fabrine", bancoDados.buscaSetor("Financeiro"));

	}
}
