package sistem.akuntan.mahasiswa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author AJI SETIAJI
 */
public class KoneksiDatabase {
    
    private final String url = "jdbc:postgresql://localhost/mahasiswa";
    private final String user = "postgres";
    private final String password = "12345";
    
    public Connection connect(){
        
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            if(conn != null){
                System.out.println("Koneksi berhasil");
            }else{
                System.out.println("Koneksi Gagal");
            }
                    
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
            return conn;
    }
    
    public static void main(String[] args) {
        KoneksiDatabase app = new KoneksiDatabase();
        app.connect();
    }
}
