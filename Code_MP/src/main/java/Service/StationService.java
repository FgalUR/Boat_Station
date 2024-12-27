package Service;

import BuisnesItem.Station;
import Repository.StationRepository;

import java.sql.SQLException;
import java.util.List;

public class StationService {
    private final StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public void addStation(String address, String telephone, String name){
        Station station = new Station(0, address,telephone,name); // ID генерируется базой данных
        stationRepository.addStation(station);
    }

    public List<Station> getAllStations() throws SQLException {
        return stationRepository.getAllStations();
    }

    public void updateStation(String address, String telephone, String name) throws SQLException {
        Station station = new Station(0, address,telephone,name);
        stationRepository.updateStation(station);
    }

    public void deleteStation(int id) throws SQLException {
        stationRepository.deleteStation(id);
    }
}

