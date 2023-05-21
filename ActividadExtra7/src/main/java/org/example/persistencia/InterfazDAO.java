package org.example.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfazDAO {
    public abstract boolean inertar (Object obj) throws SQLException;
    public abstract boolean update (Object obj) throws SQLException;
    public abstract boolean delet (Object obj) throws SQLException;
    public abstract ArrayList obtenerTodo( ) throws SQLException;
    public abstract Object buscarPorId (String id) throws SQLException;

}
