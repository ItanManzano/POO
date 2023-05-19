package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanasSumas extends JFrame {
    private JTextField txtOperando1;
    private JLabel lblSignoMas;
    private JTextField txtOperando2;
    private JButton btnBoton;
    private JLabel lblResultado;

    public VentanasSumas(String title) throws HeadlessException {
        super(title);
        this.setSize(540,200);
        this.setLayout(new FlowLayout());

        txtOperando1 = new JTextField(5);
        lblSignoMas = new JLabel("+");
        txtOperando2 = new JTextField(5);
        btnBoton = new JButton("Sumar");
        lblResultado = new JLabel("=0");

        this.getContentPane().add(txtOperando1);
        this.getContentPane().add(lblSignoMas);
        this.getContentPane().add(txtOperando2);
        this.getContentPane().add(btnBoton);
        this.getContentPane().add(lblResultado);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JTextField getTxtOperando1() {
        return txtOperando1;
    }

    public void setTxtOperando1(JTextField txtOperando1) {
        this.txtOperando1 = txtOperando1;
    }

    public JLabel getLblSignoMas() {
        return lblSignoMas;
    }

    public void setLblSignoMas(JLabel lblSignoMas) {
        this.lblSignoMas = lblSignoMas;
    }

    public JTextField getTxtOperando2() {
        return txtOperando2;
    }

    public void setTxtOperando2(JTextField txtOperando2) {
        this.txtOperando2 = txtOperando2;
    }

    public JButton getBtnBoton() {
        return btnBoton;
    }

    public void setBtnBoton(JButton btnBoton) {
        this.btnBoton = btnBoton;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public void setLblResultado(JLabel lblResultado) {
        this.lblResultado = lblResultado;
    }
}
