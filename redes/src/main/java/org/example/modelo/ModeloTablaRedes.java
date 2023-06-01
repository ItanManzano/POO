package org.example.modelo;

import org.example.persistencia.RedesDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;


public class ModeloTablaRedes implements TableModel {
    public static final int CLUMNS = 7;
    private ArrayList<Redes> datos;
    private RedesDAO rdao;
    public ModeloTablaRedes(){
        rdao = new RedesDAO();
        datos = new ArrayList<>();
    }
    public ModeloTablaRedes(ArrayList<Redes> datos){
        this.datos = datos;
        rdao = new RedesDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return CLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Desarrollador";
            case 3:
                return "Pais";
            case 4:
                return "Anio";
            case 5:
                return "Duenio";
            case 6:
                return "Urlimagen";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return Integer.class;
            case 5:
                return String.class;
            case 6:
                return String.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Redes tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getDesarrollador();
            case 3:
                return tmp.getPais();
            case 4:
                return tmp.getAnio();
            case 5:
                return tmp.getDuenio();
            case 6:
                return tmp.getUrlimagen();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
    switch (columnIndex){
        case 1:
            datos.get(rowIndex).setNombre((String) o);
            break;
        case 2:
            datos.get(rowIndex).setDesarrollador((String) o);
            break;
        case 3:
            datos.get(rowIndex).setPais((String) o);
            break;
        case 4:
            datos.get(rowIndex).setAnio((int) o);
            break;
        case 5:
            datos.get(rowIndex).setDuenio((String) o);
            break;
        case 6:
            datos.get(rowIndex).setUrlimagen((String) o);
            break;
        default:
            System.out.println("No se modifica nada");
    }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try {
            ArrayList<Redes> carga = rdao.obtenerTodo();
            System.out.println(carga);
            datos = rdao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    public boolean agregarRedes (Redes redes){
        boolean resultado = false;
        try {
            if(rdao.insertar(redes)){
                datos.add(redes);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean modificarRedes(Redes redes) throws SQLException{
        boolean resultado = false;
        try {
            if (rdao.update(redes)){
                datos.add(redes);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean eliminarRedes(String id){
        boolean resultado = false;
        try {
            if (rdao.delete(id)){
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public Redes getRedesAddIndex(int index){
        return datos.get(index);
    }


}
