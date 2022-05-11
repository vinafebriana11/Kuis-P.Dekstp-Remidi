package kuisvina;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import motherboardremidi.db.DBHelper;

public class MotherboardDataModel {
    
    private final  Connection conn;

    public MotherboardDataModel() throws SQLException {
        this.conn =DBHelper.getConnection();
    }
    
    public void addMotherboard(Motherboard mtb){
    String insertmtb = "INSERT INTO motherboard ( `tanggal_pembelian`, `merek`, `harga`, `jenis`, `warna`)"
            + "VALUES ('"
            +mtb.getTanggal_pembelian()+"','"
            +mtb.getMerek()+"','"
            +mtb.getHarga()+"','"
            +mtb.getJenis()+"','"
            +mtb.getWarna()+"')";
    try {
    
    PreparedStatement card = (PreparedStatement) conn.prepareStatement(insertmtb);
//    
////    card.setString(1, mtb.getTanggal_pembelian());
////    card.setString(2, mtb.getMerek());
////    card.setInt(3, mtb.getHarga());
////    card.setString(4, mtb.getJenis());
////    card.setString(5, mtb.getWarna());
//    
    card.execute();
    }
    catch(Exception e){
        System.out.println("eror "+e);
    }
    }
    
}
