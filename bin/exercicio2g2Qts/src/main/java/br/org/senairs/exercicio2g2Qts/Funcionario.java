package br.org.senairs.exercicio2g2Qts;

import java.util.HashMap;
import java.util.Map;

public class Funcionario {

	private int idFuncionario;
	private String nomeFuncionario;
	private String setor;

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	private Map<String, String> mapa = new HashMap<String, String>();

	public Funcionario() {
		mapa.put("Administrativo", "av. assis brasil, porto alegre");
		mapa.put("Financeiro", "av. protario, canoas");
	}

	public String buscaSetor(String setor) {
		return mapa.getOrDefault(setor, "");
	}

}
