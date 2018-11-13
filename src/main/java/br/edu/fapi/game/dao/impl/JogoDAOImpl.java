package br.edu.fapi.game.dao.impl;

import br.edu.fapi.game.dao.JogoDAO;
import br.edu.fapi.game.dao.connection.MySqlConnectionProvider;
import br.edu.fapi.game.model.Jogo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class JogoDAOImpl implements JogoDAO {

    @Override
    public int cadastrarJogo(Jogo jogo) {
        try (Connection connection = MySqlConnectionProvider.abrirConexao()){
            PreparedStatement preparedStatement;

            preparedStatement = connection.prepareStatement(
                    "insert into jogo(nome, idDificuldade, vidas)" +
                            "values (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,jogo.getNome());
            preparedStatement.setInt(2,jogo.getDificuldade().getId());
            preparedStatement.setInt(3,jogo.getVidas());

            int result = preparedStatement.executeUpdate();

            ResultSet res = preparedStatement.getGeneratedKeys();
            if (res.first()) {
                jogo.setId(res.getInt(1));
            }

            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public boolean cadastrarPalavra(Jogo jogo) {
        //TODO implementar cadastrar palavra

        try(Connection connection = MySqlConnectionProvider.abrirConexao()){
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery("select * from jogo where id = " + jogo.getId());
            if (resultSet.first()) {
                resultSet.updateString("palavra", jogo.getPalavra());
                resultSet.updateRow();
                return resultSet.rowUpdated();
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public Jogo pesquisarJogoEmAndamento(Jogo jogo) {
        try (Connection connection = MySqlConnectionProvider.abrirConexao()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select * from jogo where nome = ? and idDificuldade = ?",
                    Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, jogo.getNome());
            preparedStatement.setInt(2, jogo.getDificuldade().getId());

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.first()) {
                jogo.setPalavra(resultSet.getString("palavra"));
                return jogo;
            }
        } catch (SQLException e) {
            System.out.println("Conexão não estabelecida.");
            System.out.println(e.getMessage());
        }
        return null;
    }
}
