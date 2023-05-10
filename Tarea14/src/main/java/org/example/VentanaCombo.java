package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class VentanaCombo extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private GridLayout layout;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnAgregar;
    private JComboBox<String> combo;
    private ModeloComboNombre modelo;

    public VentanaCombo(String title) throws HeadlessException {
        super(title);
        this.setSize(300,600);
        layout = new GridLayout(2,1);
        this.getContentPane().setLayout(layout);
        panel1 = new JPanel();
        panel1.setBackground(new Color(144, 112, 215));
        this.getContentPane().add(panel1);
        lblNombre = new JLabel("Introduce tu nombre ");
        panel1.add(lblNombre);
        txtNombre = new JTextField(20);
        panel1.add(txtNombre);
        btnAgregar = new JButton("Add");
        panel1.add(btnAgregar);

        btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Evento clic");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entró al botón");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Saliendo");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Dragging...");
            }
        });

        panel2 = new JPanel();
        panel2.setBackground(new Color(80, 206, 174));
        //String[] nombres ={"Eder", "Jose", "Diana", "Susana"};
        ArrayList<String> inicial = new ArrayList<>();
        inicial.add("Susana");
        inicial.add("Diana");
        inicial.add("Diego");
        modelo = new ModeloComboNombre(inicial);
        combo = new JComboBox<>(modelo);
        panel2.add(combo);

        this.getContentPane().add(panel2);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
