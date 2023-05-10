package org.example;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaJuego implements TableModel {
    public static final int COLS = 6;
    ArrayList<Videojuego> datos;

    public ModeloTablaJuego(ArrayList<Videojuego> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colName = "";
        switch (columnIndex){
            case 0:
                colName = "id";
                break;
            case 1:
                colName = "nombre";
                break;
            case 2:
                colName = "genero";
                break;
            case 3:
                colName = "peso";
                break;
            case 4:
                colName = "Plataforma";
                break;
            case 5:
                colName = "Desarrollador";
                break;
        }
        return colName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return Integer.class;
            case 2:
                return Integer.class;
            case 3:
                return Integer.class;
            case 4:
                return Integer.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Videojuego tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getGenero();
            case 3:
                return tmp.getPesoenGb();
            case 4:
                return tmp.getPlataforma();
            case 5:
                return tmp.getDesarrollador();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarJuego(Videojuego juego){
        this.datos.add(juego);
    }
}
