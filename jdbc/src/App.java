import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;



public class App {
    public static void main(String[] args) throws Exception {
            try {
                getConnection();
            } catch (SQLException e) {
                System.out.println("There was an error" + e);
            }
    }

    public static void getConnection() throws Exception{
        String url = "jdbc:mysql://127.0.0.1:3306/employee_db";
        String user = "root";
        String password = "@Suda19583";

        Connection connection = DriverManager.getConnection(url,user,password);
        System.out.println("sql server sucessfully connected");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee_table");

        System.out.println(resultSet);

        while(resultSet.next()){
            System.out.println(
                "ID" + resultSet.getInt("id")+"Name" +resultSet.getString("name")
                
            );
        }
    }
}
