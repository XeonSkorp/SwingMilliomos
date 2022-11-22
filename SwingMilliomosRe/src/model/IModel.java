package model;

import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Mező Gábor 1995.mg@gmail.com
 */
public interface IModel {

    List<Kerdes> getAllKerdes() throws SQLException;

    void close() throws SQLException;
}
