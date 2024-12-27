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
        String sql = "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
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
                /// clients.add(new Client(!Пропиши все получаемые параметры!resultSet.get));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clients;
    }

    public void updateClient(Client client) {
        String sql = "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteClient(int id) {
        String sql = "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
