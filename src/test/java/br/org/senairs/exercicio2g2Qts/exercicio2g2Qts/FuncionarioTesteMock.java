package br.org.senairs.exercicio2g2Qts.exercicio2g2Qts;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import br.org.senairs.exercicio2g2Qts.Funcionario;

public class FuncionarioTesteMock {

	@Test
	public void testFuncionario() {
		Funcionario bancoDados = Mockito.mock(Funcionario.class);
		when(bancoDados.buscaSetor("Administrativo")).thenReturn("Luana");

		assertEquals("Luana", bancoDados.buscaSetor("Administrativo"));

		when(bancoDados.buscaSetor("Financeiro")).thenReturn("Fabrine");

		assertEquals("Fabrine", bancoDados.buscaSetor("Financeiro"));

	}
}
