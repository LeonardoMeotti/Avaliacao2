package questao9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Questao10.CriaConexao;

public class Produtos {

	public static void main(String[] args) throws SQLException {

		CriaConexao criaConexao = new CriaConexao();
		Connection connection = criaConexao.recuperarConexao();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a opção desejada");
		System.out.println("1 - Para Inserir uma nova oferta");
		String checaResposta = scanner.nextLine();
		
		if(checaResposta.equals("1")) {
			System.out.println("Digite o nome do produto, descricao, desconto e data de inicio");
		
		PreparedStatement stm = connection.prepareStatement("insert into produto (nome, descricao, desconto, data_inicio ) values (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
	}
	}	

}
