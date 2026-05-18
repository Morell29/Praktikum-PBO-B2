import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo",
            "root",
            "HekerSql69!"
        );

        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        Statement s = con.createStatement();
        s.executeUpdate(query);

        con.close();
    }
}