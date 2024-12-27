package Repository;

import BuisnesItem.Boat;
import People.Engineer;
import lombok.AllArgsConstructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class EngineersRepository {
    private final Connection connection;

    public void addEngineer(Engineer engineer) {
        String sql = "INSERT INTO engineers (salary, category, education , telephone, address" +
                ",last_name, first_name, partronimyc " +
                "VALUES (?, ?, ?, ?, ?, ?, ? , ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, engineer.getSalary());
            preparedStatement.setString(2, engineer.getCategory());
            preparedStatement.setString(3, engineer.getEducation());
            preparedStatement.setString(4, engineer.getTelephone());
            preparedStatement.setString(5, engineer.getAddress());
            preparedStatement.setString(6, engineer.getLastName());
            preparedStatement.setString(7, engineer.getFirstName());
            preparedStatement.setString(8, engineer.getPatronymic());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Engineer> getAllEngineers() {
        List<Engineer> engineers = new ArrayList<>();
        String sql = "SELECT * from boats";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                engineers.add(new Engineer(resultSet.getInt("engineer_id"),
                        resultSet.getInt("salary"),resultSet.getString("category"),
                        resultSet.getString("education"), resultSet.getString("telephone"),
                        resultSet.getString("address"),resultSet.getString("last_name"),
                        resultSet.getString("first_name"), resultSet.getString("partronymic"))));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return engineers;
    }

    public void updateEngineer(Engineer engineer) {
        String sql ="Update engineers Set salary=?, category=? , education=?, telephone=?, address=?" +
                ",last_name=?, first_name=?, patronimic=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            //Подогнать
            preparedStatement.setInt(1, engineer.getSalary());
            preparedStatement.setString(2, engineer.getCategory());
            preparedStatement.setString(3, engineer.getEducation());
            preparedStatement.setString(4, engineer.getTelephone());
            preparedStatement.setString(5, engineer.getAddress());
            preparedStatement.setString(6, engineer.getLastName());
            preparedStatement.setString(7, engineer.getFirstName());
            preparedStatement.setString(8, engineer.getPatronymic());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEngineer(int id) {
        String sql ="Delete from clients where id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        preparedStatement.setInt(1,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
