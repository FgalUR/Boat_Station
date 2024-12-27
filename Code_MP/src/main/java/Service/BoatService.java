package Service;

import BuisnesItem.Boat;
import Repository.BoatRepository;

import java.sql.SQLException;
import java.util.List;

public class BoatService {
    private final BoatRepository boatRepository;

    public BoatService(BoatRepository boatRepository) {
        this.boatRepository = boatRepository;
    }

    public void addBoat(String name, String number, String brand
            ,String variety, int client_id, int eng_id, int station_id) throws SQLException {
        Boat boat = new Boat(0, name, number, brand,variety,client_id,eng_id,station_id); // ID генерируется базой данных
        boatRepository.addBoat(boat);
    }

    public List<Boat> getAllBoats() throws SQLException {
        return boatRepository.getAllBoats();
    }

    public void updateBoat(String name, String number, String brand
            ,String variety, int client_id, int eng_id, int station_id) throws SQLException {
        Boat boat = new Boat(0, name, number, brand,variety,client_id,eng_id,station_id);
        boatRepository.updateBoat(boat);
    }

    public void deleteBoat(int id) throws SQLException {
        boatRepository.deleteBoat(id);
    }
}

