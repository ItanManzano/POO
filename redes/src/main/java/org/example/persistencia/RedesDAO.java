package org.example.persistencia;

import org.example.modelo.Redes;
import org.example.modelo.ModeloTablaRedes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RedesDAO implements InterfazDAO{
    public RedesDAO(){

    }
    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO redes (nombre,desarrollador,pais,anio,duenio,urlimagen) VALUES(?, ?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("redesDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Redes)obj).getNombre());
        pstm.setString(2,((Redes)obj).getDesarrollador());
        pstm.setString(3,((Redes)obj).getPais());
        pstm.setInt(4,((Redes)obj).getAnio());
        pstm.setString(5,((Redes)obj).getDuenio());
        pstm.setString(6,((Redes)obj).getUrlimagen());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE redes SET nombre = ?, desarrollador = ?, pais = ?, anio = ?, duenio = ?, urlimagen = ? WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("redesDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Redes)obj).getNombre());
        pstm.setString(2,((Redes)obj).getDesarrollador());
        pstm.setString(3,((Redes)obj).getPais());
        pstm.setInt(4,((Redes)obj).getAnio());
        pstm.setString(5,((Redes)obj).getDuenio());
        pstm.setString(6,((Redes)obj).getUrlimagen());
        pstm.setInt(7,((Redes) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM redes WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("redesDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM redes";
        ArrayList<Redes> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("redesDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Redes(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5),rst.getString(6),rst.getString(7)));
        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM redes WHERE id = ?;";
        Redes redes = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("redesDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            redes = new Redes(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5),rst.getString(6),rst.getString(7));
            return redes;
        }
        return null;
    }
}
