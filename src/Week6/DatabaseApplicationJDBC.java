package Week6;

import java.sql.*;

public class DatabaseApplicationJDBC {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/employes";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "12345";

    public static void main(String[] args) {
        Connection cn = null;
        Statement st = null;
        String sql = "SELECT * FROM ogretmen";

        try {
            cn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            st = cn.createStatement();
           ResultSet data = st.executeQuery(sql);

            while (data.next()) {
                System.out.println("ID: " + data.getInt("id"));
                System.out.println("Adı: " + data.getString("name"));
                System.out.println("Pozisyon: " + data.getString("position"));
                System.out.println("Maaş: " + data.getInt("salary"));
                System.out.println("##################");
            }
            st.close();
            cn.close();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }
}
