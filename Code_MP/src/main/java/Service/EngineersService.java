package Service;

import People.Engineer;
import Repository.EngineersRepository;

import java.sql.SQLException;
import java.util.List;

public class EngineersService {
    private final EngineersRepository engineerRepository;

    public EngineersService(EngineersRepository engineerRepository) {
        this.engineerRepository =engineerRepository;
    }

    public void addEngineer(int salary, String category, String education
            ,String telephone, String address, String lastName,
                            String firstName, String patronymic) throws SQLException {
        Engineer engineer = new Engineer(0, salary,category,education,telephone,
                address,lastName,firstName,patronymic); // ID генерируется базой данных
        engineerRepository.addEngineer(engineer);
    }

    public List<Engineer> getAllEngineers() throws SQLException {
        return engineerRepository.getAllEngineers();
    }

    public void updateEngineer(int salary, String category, String education
            ,String telephone, String address, String lastName,
                               String firstName, String patronymic) throws SQLException {
        Engineer engineer = new Engineer(0, salary,category,education,telephone,
                address,lastName,firstName,patronymic);
        engineerRepository.updateEngineer(engineer);
    }

    public void deleteEngineer(int id) throws SQLException {
        engineerRepository.deleteEngineer(id);
    }
}

