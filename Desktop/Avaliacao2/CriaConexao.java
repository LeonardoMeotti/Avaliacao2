package questao9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaConexao {

	public Connection recuperarConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/questao09?useTimezone=true&serverTimezone=UTC", "root", "SKY123456789");
	}
}
