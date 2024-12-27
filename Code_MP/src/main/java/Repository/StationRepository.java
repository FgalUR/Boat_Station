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
        String sql = "INSERT INTO boat_station (address, telephone," +
                " station_name" +
                "VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, station.getAddress());
            preparedStatement.setString(2, station.getTelephone());
            preparedStatement.setString(3, station.getName());
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
                stations.add(new Station(resultSet.getInt("boat_station_id"),
                        resultSet.getString("telephone"),
                        resultSet.getString("station_name"),resultSet.getString("address")));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return stations;
    }

    public void updateStation(Station station) {
        String sql ="Update station Set address=?, telephone=? , station_name=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, station.getAddress());
            preparedStatement.setString(2, station.getTelephone());
            preparedStatement.setString(3, station.getName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteStation(int id) {
        String sql ="Delete from clients where id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
