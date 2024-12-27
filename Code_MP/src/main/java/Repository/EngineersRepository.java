package Repository;

import BuisnesItem.Boat;
import People.Engineer;
import lombok.AllArgsConstructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
public class EngineersRepository {
    private final Connection connection;
    public void addEngineer(Engineer engineer) {
        String sql = "INSERT INTO boats (name, number, brand , variety, client_id, engineer_id, boat_station_id " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            //Подогнать
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Engineer> getAllEngineers() {
        List<Engineer> engineers = new ArrayList<>();
        String sql = "SELECT * from boats";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                /// engineers.add(new Boat(!Пропиши все получаемые параметры!resultSet.get));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return engineers;
    }

    public void updateEngineer(Engineer engineer) {
        String sql = "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            //Подогнать
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
            preparedStatement.setString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEngineer(int id) {
        String sql = "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
