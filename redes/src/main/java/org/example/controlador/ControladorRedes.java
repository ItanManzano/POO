package org.example.controlador;

import org.example.modelo.ModeloTablaRedes;
import org.example.modelo.Redes;
import org.example.vista.VentanaRedes;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class ControladorRedes extends MouseAdapter {
    private VentanaRedes view;
    private ModeloTablaRedes modelo;

    public ControladorRedes(VentanaRedes view) {
        this.view = view;
        modelo = new ModeloTablaRedes();
        this.view.getTblRedes().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getTblRedes().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnModificar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnLimpiar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {

            modelo.cargarDatos();
            this.view.getTblRedes().setModel(modelo);
            this.view.getTblRedes().updateUI();
        }
        //Agregar redes sociales
        if (e.getSource() == this.view.getBtnAgregar()){
            Redes redes = new Redes();
            try {
                redes.setId(0);
                redes.setNombre(this.view.getTxtnombre().getText());
                redes.setDesarrollador(this.view.getTxtdesarrollador().getText());
                redes.setPais(this.view.getTxtpais().getText());
                redes.setAnio(Integer.parseInt(this.view.getTxtanio().getText()));
                redes.setDuenio(this.view.getTxtduenio().getText());
                redes.setUrlimagen(this.view.getTxturlimagen().getText());
                    if (modelo.agregarRedes(redes)){

                        ImageIcon icon = new ImageIcon("icons8-add-folder-64.png");
                        JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",
                                JOptionPane.INFORMATION_MESSAGE,icon);
                                modelo.cargarDatos();
                                this.view.getTblRedes().setModel(modelo);
                                this.view.getTblRedes().updateUI();
                    }else {
                        JOptionPane.showMessageDialog(view, "No se agregó a la base de datos, " + "intente de nuevo ", "Error al insertar", JOptionPane.ERROR_MESSAGE);
                    }
                    this.view.limpiar();
                    }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(view,"Ingresa un valor numerico de 4 digitos en el campo Año","Error",JOptionPane.ERROR_MESSAGE);
            }

        }
        //Boton limpiar
        if (e.getSource() == this.view.getBtnLimpiar()){
            this.view.limpiar();
        }
        //Obtener todos los values e imagen
        if (e.getSource()  == this.view.getTblRedes()){
            int index = this.view.getTblRedes().getSelectedRow();
            Redes tmp = modelo.getRedesAddIndex(index);

            this.view.getTxtnombre().setText(tmp.getNombre());
            this.view.getTxtdesarrollador().setText(tmp.getDesarrollador());
            this.view.getTxtpais().setText(tmp.getPais());
            this.view.getTxtanio().setText(Integer.toString(tmp.getAnio()));
            this.view.getTxtduenio().setText(tmp.getDuenio());
            this.view.getTxturlimagen().setText(tmp.getUrlimagen());
            try {
                this.view.getLblurlimagen().setIcon(tmp.getImagenI());
            }catch (MalformedURLException mfue){
                System.out.println(mfue.getMessage());
            }
        }
        //Modificar tabla
        if (e.getSource() == this.view.getBtnModificar()){
            int index = this.view.getTblRedes().getSelectedRow();
            Redes tmp = modelo.getRedesAddIndex(index);
            Redes redes = new Redes();
            try {
                redes.setNombre(this.view.getTxtnombre().getText());
                redes.setDesarrollador(this.view.getTxtdesarrollador().getText());
                redes.setPais(this.view.getTxtpais().getText());
                redes.setAnio(Integer.parseInt(this.view.getTxtanio().getText()));
                redes.setDuenio(this.view.getTxtduenio().getText());
                redes.setUrlimagen(this.view.getTxturlimagen().getText());
                redes.setId(tmp.getId());

                if (modelo.modificarRedes(redes)){
                    ImageIcon icon = new ImageIcon("icons8-edit-property-64.png");
                    JOptionPane.showMessageDialog(view,"Se modifico correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE,icon);
                    modelo.cargarDatos();
                    this.view.getTblRedes().setModel(modelo);
                    this.view.getTblRedes().updateUI();
                }else {
                    JOptionPane.showMessageDialog(view,"No se pudo modificar, " + "intente de nuevo","Error al modificar",JOptionPane.ERROR_MESSAGE);
                }
                this.view.getTblRedes().updateUI();
                this.view.limpiar();
            }catch (SQLException sqle){
                System.out.println(sqle.getMessage());
            }
        }
        //Eliminar
        if (e.getSource() == this.view.getBtnEliminar()){
            ModeloTablaRedes temp = new ModeloTablaRedes();
            int index = this.view.getTblRedes().getSelectedRow();
            Redes tmp = modelo.getRedesAddIndex(index);
            if (temp.eliminarRedes(Integer.toString(tmp.getId()))){
                JOptionPane.showMessageDialog(view, "Se eliminó correctamente", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarDatos();
                this.view.getTblRedes().updateUI();
                this.view.limpiar();
            }else {
                JOptionPane.showMessageDialog(view,"No se pudo eliminar de la base de datos","Error al insertar",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
