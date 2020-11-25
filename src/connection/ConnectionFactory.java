package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
	
	private final static String url="jdbc:sqlserver://localhost:1433;databaseName=bdUsuario";
	private final static String userName="sa";
	private final static String password="gdfasjketral1";
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o banco"+e.getMessage());
			//JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco de dados"+e.getMessage(), "Erro", 1);
		}
		return null;
	}
	
	public static void closeConnection(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão com o Banco de dados"+e.getMessage(), "Erro", 1);
			}
		}
	}
}
