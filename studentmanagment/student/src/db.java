import java.sql.*;
import java.util.Scanner;

public class db {
    private String url = "jdbc:mysql://localhost:3306/student";
    private String username = "root";
    private String password = "qwert123";
    private Scanner sc = new Scanner(System.in);

    public void createtable() throws Exception {
        String query = "CREATE TABLE STUDENT("
                + "roll_no INT PRIMARY KEY,"
                + "student_name VARCHAR(255),"
                + "dept VARCHAR(255),"
                + "cgpa VARCHAR(255))";

        try (Connection con = DriverManager.getConnection(url, username, password);
                Statement st = con.createStatement()) {

            st.executeUpdate(query);
            System.out.println("Table created successfully");
        }
    }

    public void read() throws Exception{
    String query = "SELECT * FROM student";
    try (Connection con = DriverManager.getConnection(url, username, password);
    )
    }
}
