package br.edu.fapi.game.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionProvider {
    public static String url = "jdbc:mysql://localhost:3306/desafioforca";
    public static String usuario = "root";
    public static String senha = "123456";

    public static Connection abrirConexao() throws SQLException {

        return DriverManager.getConnection(url, usuario, senha);
    }
}
