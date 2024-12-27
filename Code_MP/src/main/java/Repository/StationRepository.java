package Repository;

import BuisnesItem.Station;
import lombok.AllArgsConstructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class StationRepository {
    private final Connection connection;
    public void addStation(Station station) {
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

    public List<Station> getAllStations() {
        List<Station> stations = new ArrayList<>();
        String sql = "SELECT * from boat_station";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                /// stations.add(new Station(!Пропиши все получаемые параметры!resultSet.get));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return stations;
    }

    public void updateStation(Station station) {
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

    public void deleteStation(int id) {
        String sql = "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
