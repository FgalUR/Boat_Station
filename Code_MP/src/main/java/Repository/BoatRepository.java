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
        String sql = "INSERT INTO boats (name, number, brand , variety, client_id, engineer_id, boat_station_id" +
                ") VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, boat.getName());
            preparedStatement.setString(2, boat.getNumber());
            preparedStatement.setString(3, boat.getBrand());
            preparedStatement.setString(4, boat.getVariety());
            preparedStatement.setInt(5, boat.getClient_id());
            preparedStatement.setInt(6, boat.getEng_id());
            preparedStatement.setInt(7, boat.getStation_id());
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
                boats.add(new Boat(resultSet.getInt("boat_id"),
                        resultSet.getString("name"), resultSet.getString("number"),
                        resultSet.getString("brand"), resultSet.getString("variety"),
                        resultSet.getInt("client_id"), resultSet.getInt("engineer_id"),
                        resultSet.getInt("boat_station_id")));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return boats;
    }

    public void updateBoat(Boat boat) {
        String sql = "Update boats Set name=?, number=? , brand=?, variety=?, client_id=?, engineer_id=?, " +
                "boat_station_id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, boat.getName());
            preparedStatement.setString(2, boat.getNumber());
            preparedStatement.setString(3, boat.getBrand());
            preparedStatement.setString(4, boat.getVariety());
            preparedStatement.setInt(5, boat.getClient_id());
            preparedStatement.setInt(6, boat.getEng_id());
            preparedStatement.setInt(7, boat.getStation_id());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteBoat(int id) {
        String sql = "Delete from boats where id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
