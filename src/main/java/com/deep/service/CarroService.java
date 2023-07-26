package com.deep.service;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;

import static com.deep.connection.DatabaseConnection.getConnection;

public class CarroService {
    private Statement statement;

    public CarroService() {
        try {
            statement = getConnection().createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(String placa, String marca, String modelo) {
        Timestamp timestamp = Timestamp.from(Instant.from(LocalDateTime.now()));
        String sql = String.format("INSERT INTO controle_carros " +
                "(placa, marca, modelo, data_entrada) VALUES ('%s', '%s', '%s', '%s')",
                placa, marca, modelo, timestamp);
        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String placa) {
        String sql = String.format("DELETE FROM controle_carros WHERE placa = '&s'", placa);
        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(String placa, String coluna, String valor) {
        if(!coluna.equalsIgnoreCase("placa")) {
            String sql = String.format("UPDATE controle_carros SET %s = '%s' WHERE placa = '%s'",
                    coluna, valor, placa);
            try {
                statement.executeUpdate(sql);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Não é permitido mudar a placa!");
        }
    }

    public void list() {
        String sql = "SELECT * FROM controle_carros ORDER BY data_entrada";
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                String line = String.format("| %s |" +
                                " %s |" +
                                " %s |" +
                                " %s |",
                        resultSet.getString("placa"),
                        resultSet.getString("marca"),
                        resultSet.getString("modelo"),
                        resultSet.getTimestamp("data_entrada"));
                System.out.println(line);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
