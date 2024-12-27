package Repository;

import BuisnesItem.Boat;
import People.Client;
import lombok.AllArgsConstructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
public class BoatRepository {
    private final Connection connection;
    public void addBoat(Boat boat) {
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

    public List<Boat> getAllBoats() {
        List<Boat> boats = new ArrayList<>();
        String sql = "SELECT * from boats";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                /// boats.add(new Boat(!Пропиши все получаемые параметры!resultSet.get));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return boats;
    }

    public void updateBoat(Boat boat) {
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

    public void deleteBoat(int id) {
        String sql = "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
