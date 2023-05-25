package org.example.controlador;

import org.example.vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class ControladorEjemplo extends MouseAdapter {
    private Ventana view;

    public ControladorEjemplo(Ventana view) {
        this.view = view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if (e.getSource() == view.getBtnMensaje()) {
           //System.out.println("Mensaje");
           ImageIcon icono = new ImageIcon("blackpink.png");
           JOptionPane.showMessageDialog(view,"Hola neni",
                   "Que top es programar",
                   JOptionPane.INFORMATION_MESSAGE,
                   icono
           );
       }
       if (e.getSource() == view.getBtnEntrada()) {
           //System.out.println("Entrada");
           String datos = JOptionPane.showInputDialog(view,
                   "Ejemplo0o0o",
                   "Escribe algo0o",
                   JOptionPane.QUESTION_MESSAGE);
           this.view.getLblResultado().setText(datos);
       }
       if (e.getSource() == view.getBtnOpcion()) {
           //System.out.println("Opccion");
          int respuesta = JOptionPane.showConfirmDialog(view,"¿estas seguro de seguir en la carrera?",
                   "Confirmacion",
                   JOptionPane.YES_NO_OPTION
                    );

          if (respuesta == JOptionPane.YES_NO_OPTION){
              view.getLblResultado().setText("Elegiste la opccion Si");
          }else {
              view.getLblResultado().setText("Elegiste la opccion No");
          }
       }
    }
}
