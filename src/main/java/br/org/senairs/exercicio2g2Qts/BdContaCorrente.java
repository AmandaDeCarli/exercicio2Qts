package br.org.senairs.exercicio2g2Qts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;


public class BdContaCorrente {
	private Connection connection = null;

	private void conectaBanco() {

		try {
			String url = "jdbc:postgresql://localhost:5432/exercicio2g2qts";
			Properties props = new Properties();
			props.setProperty("user", "postgres");
			props.setProperty("password", "teste");
			connection = DriverManager.getConnection(url, props);
			if (connection != null) {
				System.out.println("STATUS--->Conectado com sucesso!");
			} else {
				System.out.println("STATUS--->NÃ£o foi possivel realizar conexÃ£o");
			}

		} catch (Exception e) {
			System.out.println("Error ao conectar o banco de dados");
			e.printStackTrace();
		}
	}

	public int insertConta(ContaCorrente conta) {
		conectaBanco();

		String sql = "insert into \"ContaCorrente\" (\"nomeCorrentista\",saldo) values('" + conta.getNomeCorrentista()
				+ "'," + conta.getSaldo() + ") RETURNING \"idConta\"";

		System.out.println("sql insert " + sql);

		try {
			ResultSet rs = connection.createStatement().executeQuery(sql);
			rs.next();
			int id = rs.getInt(1);
			conta.setIdConta(id);
			return id;

		} catch (Exception e) {
			System.out.println("Error na insercao conta: " + e.getMessage());

			return -1;
		}

	}

	public boolean deleteConta(int idConta) {

		String sql = "delete from \"ContaCorrente\" where id= " + idConta;
		System.out.println("sql delete " + sql);

		try {
			connection.createStatement().execute(sql);
		} catch (Exception e) {
			System.out.println("Erro na remocao" + e);
		}
		return true;
	}

	public ContaCorrente buscaContaCorrente(int idConta) {

		String sql = "select * from \"ContaCorrente\" where \"idConta\" =" + idConta;
		;
		System.out.println("sql select " + sql);
		ContaCorrente conta = null;
		try {
			connection.createStatement().execute(sql);
			ResultSet resultSet = connection.createStatement().executeQuery(sql);

			while (resultSet.next()) {
				conta = new ContaCorrente();
				conta.setIdConta(resultSet.getInt("idConta"));
				conta.setNomeCorrentista(resultSet.getString("nomeCorrentista"));
				conta.setSaldo(resultSet.getFloat("saldo"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conta;
	}

}
