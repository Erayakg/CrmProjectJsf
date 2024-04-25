import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import constant.SqlConnConstant;

public class DatabaseSetup {

    public static void createTable() {
        // Veritabanı bağlantı URL'si, kullanıcı adı ve şifresi
        String url = SqlConnConstant.Url;
        String user = SqlConnConstant.userName;
        String password = SqlConnConstant.Password;

        // SQL komutları
        String sqlCreate = "CREATE TABLE IF NOT EXISTS customer ("
                + "id BIGINT PRIMARY KEY,"
                + "name VARCHAR(255),"
                + "surname VARCHAR(255)"
                + ");";

        try (Connection conn = DriverManager.getConnection(url, user, password); Statement stmt = conn.createStatement()) {

            // Tabloyu oluştur
            stmt.execute(sqlCreate);
            System.out.println("Tablo başarıyla oluşturuldu.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertInitialData() {
        String url = SqlConnConstant.Url;
        String user = SqlConnConstant.userName;
        String password = SqlConnConstant.Password;

        // Başlangıç verilerini ekleyen SQL sorgusu
        String sqlInsert = "INSERT INTO customer (id, name, surname) VALUES (1, 'John', 'Doe'), (2, 'Jane', 'Roe');";

        try (Connection conn = DriverManager.getConnection(url, user, password); Statement stmt = conn.createStatement()) {

            // Verileri ekle
            int affectedRows = stmt.executeUpdate(sqlInsert);
            if (affectedRows > 0) {
                System.out.println(affectedRows + " satır başarıyla eklendi.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createTable(); // Tabloyu oluşturma metodunu çağır
    }
}
