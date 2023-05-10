package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDEsarrollador;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDEsarrollador;
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<Videojuego>info;
    private JScrollPane scoll;
    private JTable tblTabla;


    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500,700);
        layout = new GridLayout(2,1);
        this.setLayout(layout);

        //PANEL 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(146, 146, 253));
        lblId = new JLabel("Id: ");
        txtId = new JTextField(4);
        panel1.add(lblId);
        panel1.add(txtId);
        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        lblGenero = new JLabel("Genero: ");
        txtGenero = new JTextField(15);
        panel1.add(lblGenero);
        panel1.add(txtGenero);
        lblPeso = new JLabel("Peso en Gb: ");
        txtPeso = new JTextField(5);
        panel1.add(lblPeso);
        panel1.add(txtPeso);
        lblPlataforma = new JLabel("Plataforma: ");
        txtPlataforma = new JTextField(15);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);
        lblDEsarrollador = new JLabel("Desarrollador: ");
        txtDEsarrollador = new JTextField(25);
        panel1.add(lblDEsarrollador);
        panel1.add(txtDEsarrollador);

        btnAgregar = new JButton("Agregar juego");
        panel1.add(btnAgregar);

        this.getContentPane().add(panel1,0);


        //PANEL 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(255, 166, 245));
        info = new ArrayList<>();
        info.add(new Videojuego(1,"LOL","MOBA",
                4.5,"Windows y MAC",
                "Riot GAMES"));
        modelo = new ModeloTablaJuego(info);
        tblTabla = new JTable(modelo);
        scoll = new JScrollPane(tblTabla);
        panel2.add(scoll);


        this.getContentPane().add(panel2,1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Videojuego nuevo = new Videojuego();
                nuevo.setId(Integer.parseInt(txtId.getText()));
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoenGb(Double.parseDouble(txtPeso.getText()));
                nuevo.setPlataforma(txtPlataforma.getText());
                nuevo.setDesarrollador(txtDEsarrollador.getText());

                modelo.agregarJuego(nuevo);
                tblTabla.updateUI();
            }
        });


        this.setVisible(true);
    }
}
