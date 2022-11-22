package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mező Gábor 1995.mg@gmail.com
 */
public class DBModel implements IModel {

    private Connection conn;
    private PreparedStatement getAllKerdesPstmt;

    public DBModel(Connection conn) throws SQLException {
        this.conn = conn;
        getAllKerdesPstmt = conn.prepareStatement("SELECT * FROM kerdes");
    }

    @Override
    public List<Kerdes> getAllKerdes() throws SQLException {
        List<Kerdes> kerdesek = new ArrayList<>();

        try (ResultSet rs = getAllKerdesPstmt.executeQuery()) {
            while (rs.next()) {
                
                List<String> valaszok = new ArrayList<>();
                String szoveg = rs.getString("kerdes");
                
                int id = rs.getInt("id");
                int helyes = rs.getInt("helyesvalasz");
                
                for (int i = 0; i < 4; i++) {
                    valaszok.add(rs.getString("valasz" + i));
                }
                
                kerdesek.add(new Kerdes(id, szoveg, valaszok, helyes));
            }
        }

        return kerdesek;
    }
//lezárjuk

    @Override
    public void close() throws SQLException {
        conn.close();
    }

}
