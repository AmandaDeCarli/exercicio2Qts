package br.org.senairs.exercicio2g2Qts;

public class ValidaFuncionario {
	public boolean validar(Funcionario funcionario) {

		boolean ret = true;

		if (funcionario.getNomeFuncionario().equals("")) {
			return false;
		}
		if (funcionario.getNomeFuncionario().length() > 30) {
			return false;
		}

		return ret;
	}
}
