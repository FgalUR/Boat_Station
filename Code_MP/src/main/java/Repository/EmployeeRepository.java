package Repository;

import BuisnesItem.Boat;
import People.Employee;
import lombok.AllArgsConstructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
public class EmployeeRepository {
    private final Connection connection;
    public void addEmployee(Employee employee) {
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

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * from employee";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                /// employees.add(new Employee(!Пропиши все получаемые параметры!resultSet.get));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    public void updateEmployee(Employee employee) {
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

    public void deleteEmployee(int id) {
        String sql = "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
