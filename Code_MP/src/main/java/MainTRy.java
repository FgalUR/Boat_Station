import java.sql.*;

public class MainTRy {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:postgresql://localhost:5432/Boat_Station";
        String pass="postgres";
        String user="postgres";
        Connection connection= DriverManager.getConnection(url,user,pass);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM  boats");
        while(resultSet.next()){
            System.out.println(resultSet.getInt("boat_id"));
        }
    }
}
