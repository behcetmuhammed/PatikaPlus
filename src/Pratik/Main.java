package Pratik;

import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/school";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            st = conn.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM student");

            while (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt("student_id"));
                System.out.println("Adı : " + resultSet.getString("student_fname"));
                System.out.println("Soyadı : " + resultSet.getString("student_lname"));
                System.out.println("Sınıfı : " + resultSet.getInt("student_class"));
                System.out.println("#################");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}
