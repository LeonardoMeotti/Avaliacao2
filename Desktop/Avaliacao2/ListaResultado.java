package Questao10;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


public class ListaResultado {

	public static void main(String[] args) throws SQLException {
		
		CriaConexao criaConexao = new CriaConexao();
		Connection connection = criaConexao.recuperarConexao();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Como voce esta se sentindo?");
		String checaTexto = scanner.nextLine();
		
		
		
		String Feliz = ":-)";
		String Triste = ":-(";

	}

	
	
}
