package br.org.senairs.exercicio2g2Qts;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setIdConta(9090);
		contaCorrente.setNomeCorrentista("Amanda Katarina");
		contaCorrente.setSaldo(10000);
		
		BdContaCorrente bdContaCorrente = new BdContaCorrente();
		
		bdContaCorrente.insertConta(contaCorrente);
		
		
	}

}
