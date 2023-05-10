package org.example;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ModeloComboNombre implements ComboBoxModel {
    ArrayList<String> datos;
    String seleccionado;
    public ModeloComboNombre() {
        datos = new ArrayList<>();
    }

    public ModeloComboNombre(ArrayList<String> datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return this.seleccionado;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return datos.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
    public void agregarNombre(String nom){
        datos.add(nom);
    }
}
