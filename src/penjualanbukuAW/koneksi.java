package penjualanbukuAW;
import java.sql.*;
import javax.swing.*;

public class koneksi 
{
    
    Connection konek = null;
    
    public static Connection konek(String user,String pass)
    {
        try
        {
            //Class.forName("com.mysql.jdbc.driver");
            Connection konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/penjualanbuku_db",user,pass);
            return konek;   
        }
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            return null;
        }
    }

}
