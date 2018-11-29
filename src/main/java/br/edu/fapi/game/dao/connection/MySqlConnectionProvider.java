package br.edu.fapi.game.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionProvider {
    public static String url = "jdbc:mysql://localhost:3306/desafioforca?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static String usuario = "root";
    public static String senha = "";

    public static Connection abrirConexao() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        return DriverManager.getConnection(url, usuario, senha);
    }
}
