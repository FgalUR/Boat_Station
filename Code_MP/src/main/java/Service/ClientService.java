package Service;

import People.Client;
import Repository.ClientRepository;

import java.sql.SQLException;
import java.util.List;

public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void addClient(String firstName, String lastName, String patronymic
    ,String telephone, String address) throws SQLException {
        Client client = new Client(0, firstName, lastName, patronymic,telephone,address); // ID генерируется базой данных
        clientRepository.addClient(client);
    }

    public List<Client> getAllClients() throws SQLException {
        return clientRepository.getAllClients();
    }

    public void updateClient( String firstName, String lastName, String patronymic
            ,String telephone, String address) throws SQLException {
        Client client = new Client(0,firstName, lastName, patronymic,telephone,address);
        clientRepository.updateClient(client);
    }

    public void deleteClient(int id) throws SQLException {
        clientRepository.deleteClient(id);
    }
}