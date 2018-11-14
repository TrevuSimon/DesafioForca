package br.edu.fapi.game.dao.impl;

import br.edu.fapi.game.dao.JogoDAO;
import br.edu.fapi.game.dao.connection.MySqlConnectionProvider;
import br.edu.fapi.game.model.Jogo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class JogoDAOImpl implements JogoDAO {

    @Override
    public int cadastrarJogo(Jogo jogo) {
        try (Connection connection = MySqlConnectionProvider.abrirConexao()){
            PreparedStatement preparedStatement;

            preparedStatement = connection.prepareStatement(
                    "insert into jogo(nome, idDificuldade, vidas, dataInicio, idSituacao)" +
                            "values (?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,jogo.getNome());
            preparedStatement.setInt(2,jogo.getDificuldade().getId());
            preparedStatement.setInt(3,jogo.getVidas());
            preparedStatement.setTimestamp(4,jogo.getDataInicio());
            preparedStatement.setInt(5,jogo.getSituacao().getId());

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
                    "select * from jogo where nome = ? and idDificuldade = ? and idSituacao = 1",
                    Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, jogo.getNome());
            preparedStatement.setInt(2, jogo.getDificuldade().getId());

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.first()) {
                jogo.setId(resultSet.getInt("id"));
                jogo.setPalavra(resultSet.getString("palavra"));
                jogo.setChute(resultSet.getString("chute"));
                jogo.setInterrupcoes(resultSet.getInt("interrupcoes"));
                return jogo;
            }
        } catch (SQLException e) {
            System.out.println("Conexão não estabelecida.");
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean AtualizarJogo(Jogo jogo) {
        try(Connection connection = MySqlConnectionProvider.abrirConexao()){
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery("select * from jogo where id = " + jogo.getId());
            if (resultSet.first()) {
                resultSet.updateString("chute", jogo.getChute());
                resultSet.updateInt("vidas", jogo.getVidas());
                resultSet.updateInt("interrupcoes", jogo.getInterrupcoes());
                resultSet.updateRow();
                return resultSet.rowUpdated();
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean FinalizarJogo(Jogo jogo) {
        try(Connection connection = MySqlConnectionProvider.abrirConexao()){
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery("select * from jogo where id = " + jogo.getId());
            if (resultSet.first()) {
                resultSet.updateInt("idSituacao", 3);
                resultSet.updateTimestamp("dataFim", new Timestamp(System.currentTimeMillis()));
                resultSet.updateRow();
                return resultSet.rowUpdated();
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean PerderJogo(Jogo jogo) {
        try(Connection connection = MySqlConnectionProvider.abrirConexao()){
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery("select * from jogo where id = " + jogo.getId());
            if (resultSet.first()) {
                resultSet.updateInt("idSituacao", 2);
                resultSet.updateTimestamp("dataFim", new Timestamp(System.currentTimeMillis()));
                resultSet.updateRow();
                return resultSet.rowUpdated();
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean DesistirJogo(Jogo jogo) {
        try(Connection connection = MySqlConnectionProvider.abrirConexao()){
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery("select * from jogo where id = " + jogo.getId());
            if (resultSet.first()) {
                resultSet.updateInt("idSituacao", 4);
                resultSet.updateTimestamp("dataFim", new Timestamp(System.currentTimeMillis()));
                resultSet.updateRow();
                return resultSet.rowUpdated();
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
