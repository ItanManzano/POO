package org.example.controlador;

import org.example.modelo.Calculadora;
import org.example.vista.VentanasSumas;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorSumas implements MouseListener {
    private VentanasSumas view;
    private Calculadora  calculadoraModel;

    public ControladorSumas(VentanasSumas view) {
        this.view = view;
        this.view.getBtnBoton().addMouseListener(this);
        this.view.getLblResultado().addMouseListener(this);
        calculadoraModel = new Calculadora();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == this.view.getBtnBoton()) {
            System.out.println("Clickk en botón");
            try {
                String texto1 = this.view.getTxtOperando1().getText();
                double op1 = Double.parseDouble(texto1);
                double op2 = Double.parseDouble(this.view.getTxtOperando2().getText());
                calculadoraModel.setOperando1(op1);
                calculadoraModel.setOperando2(op2);
                String res = "" + calculadoraModel.sumar();
                this.view.getLblResultado().setText(res);

            } catch (NumberFormatException nfe) {
                calculadoraModel.setOperando1(0.0);
                calculadoraModel.setOperando2(0.0);
                JOptionPane.showMessageDialog(view, "Datos incorrectos");
            }
            if (e.getSource() == this.view.getLblResultado()) {
                System.out.println("clickk en la etiqueta resultado");
            }

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
