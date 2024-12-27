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
        String sql = "INSERT INTO boats (salary, telephone, education , " +
                "address, e_position,last_name, first_name, partronimic, boat_station_id " +
                "VALUES (?, ?, ?, ?, ?, ?, ?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, employee.getSalary());
            preparedStatement.setString(2, employee.getTelephone());
            preparedStatement.setString(3, employee.getEducation());
            preparedStatement.setString(4, employee.getAddress());
            preparedStatement.setString(5, employee.getPosition());
            preparedStatement.setString(6, employee.getLastName());
            preparedStatement.setString(7, employee.getFirstName());
            preparedStatement.setString(8, employee.getPatronymic());
            preparedStatement.setInt(9, employee.getStation_id());
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
                employees.add(new Employee(resultSet.getInt("emp_id"),
                        resultSet.getInt("salary"), resultSet.getString("telephone"),
                        resultSet.getString("education"), resultSet.getString("address"),
                        resultSet.getString("e_position"), resultSet.getString("last_name"),
                        resultSet.getString("first_name"), resultSet.getString("partronimic"),
                        resultSet.getInt("boat_station_id")));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    public void updateEmployee(Employee employee) {
        String sql = "Update employee Set salary=?, telephone=? ," +
                " education=?, address=?, e_position=?,last_name=?, first_name=?,patronymic=?, boat_station_id";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, employee.getSalary());
            preparedStatement.setString(2, employee.getTelephone());
            preparedStatement.setString(3, employee.getEducation());
            preparedStatement.setString(4, employee.getAddress());
            preparedStatement.setString(5, employee.getPosition());
            preparedStatement.setString(6, employee.getLastName());
            preparedStatement.setString(7, employee.getFirstName());
            preparedStatement.setString(8, employee.getPatronymic());
            preparedStatement.setInt(9, employee.getStation_id());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(int id) {
        String sql ="Delete from clients where id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
