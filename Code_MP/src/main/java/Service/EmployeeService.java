package Service;


import People.Employee;
import Repository.EmployeeRepository;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(int salary, String telephone, String education, String address
            , String position, String firstName, String lastName,
                            String patronymic, int station_id) throws SQLException {
        Employee employee = new Employee(0, salary, telephone, education,
                address, position, firstName, lastName,
                patronymic, station_id); // ID генерируется базой данных
        employeeRepository.addEmployee(employee);
    }

    public List<Employee> getAllEmployees() throws SQLException {
        return employeeRepository.getAllEmployees();
    }

    public void updateEmployee(int salary, String telephone, String education, String address
            , String position, String firstName, String lastName,
                               String patronymic, int station_id) throws SQLException {
        Employee employee = new Employee(0, salary, telephone, education,
                address, position, firstName, lastName,
                patronymic, station_id);
        employeeRepository.updateEmployee(employee);
    }

    public void deleteEmployee(int id) throws SQLException {
        employeeRepository.deleteEmployee(id);
    }
}
