package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.tailieu;

public class tailieuDao {
    
    public List<tailieu> getAll(){
        List<tailieu> TL = new ArrayList<tailieu>();
        
        Connection con = ketnoisql.getConnect();
        
        String sql = "select * from TAILIEU";
        
        try{
            PreparedStatement prepare = con.prepareStatement(sql);
            ResultSet rs = prepare.executeQuery();
            
            while(rs.next()){
                tailieu tl = new tailieu();
                
                tl.setMaTL(rs.getString("maTL"));
                tl.setLoai(rs.getString("loai"));
                tl.setTacgia(rs.getString("tacgia"));
                tl.setSotrang(rs.getInt("sotrang"));
                tl.setSophathanh(rs.getInt("sophathanh"));
                tl.setThangphathanh(rs.getInt("thangphathanh"));
                tl.setNgayphathanh(rs.getInt("ngayphathanh "));
                tl.setTenNXB(rs.getString("tenNXB"));
                tl.setSobanphathanh(rs.getInt("sobanphathanh"));
                
                TL.add(tl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tailieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return TL;
    }
    
    
}   

