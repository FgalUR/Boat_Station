package Repository;

import People.Client;
import lombok.AllArgsConstructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class ClientRepository {
    private final Connection connection;

    public void addClient(Client client) {
        String sql = "INSERT INTO clients (address, telephone, last_name , " +
                "first_name, patronymic" +
                "VALUES (?, ?, ?, ?, ? )";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, client.getAddress());
            preparedStatement.setString(2, client.getTelephone());
            preparedStatement.setString(3, client.getLastName());
            preparedStatement.setString(4, client.getFirstName());
            preparedStatement.setString(5, client.getPatronymic());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Client> getAllClients() {
        List<Client> clients = new ArrayList<>();
        String sql = "SELECT * from clients";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                clients.add(new Client(resultSet.getInt("client_id"),
                        resultSet.getString("address"),
                        resultSet.getString("telephone"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("patronymic")));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clients;
    }

    public void updateClient(Client client) {
        String sql = "Update clients Set address=?, telephone=? , last_name=?, first_name=?, patronymic=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, client.getAddress());
            preparedStatement.setString(2, client.getTelephone());
            preparedStatement.setString(3, client.getLastName());
            preparedStatement.setString(4, client.getFirstName());
            preparedStatement.setString(5, client.getPatronymic());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteClient(int id) {
        String sql = "Delete from clients where id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
