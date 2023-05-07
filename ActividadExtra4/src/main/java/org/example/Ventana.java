package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.jar.JarFile;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton botonPanel1;
    private JLabel etiqueta1panel1;
    private JPanel panel2;
    private JLabel etiqueta2Panel2;
    private JPanel panel3;
    private JComboBox<String>comboBoxPanel3;
    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel();
        panel1.setBackground(new Color(236, 177, 151));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        botonPanel1 = new JButton("Presioname!");
        panel1.add(botonPanel1);
        this.getContentPane().add(panel1,0);
        etiqueta1panel1 = new JLabel("...");
        panel1.add(etiqueta1panel1);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta1panel1.setText("Hola, presionaste el botón del panel 1");
            }
        });

        //panel2
        String urlImagen = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_koZxMrXk0B2w312QUr91KNaf3LPKwulh8Q&usqp=CAU";

        panel2 = new JPanel();
        panel2.setBackground(new Color(255, 115, 235));
        panel2.setLayout(new FlowLayout());
        //cargar la imagen de internet
        try{
            URL url = new URL(urlImagen);
            Image imagen= ImageIO.read(url);
            ImageIcon imageIcon = new ImageIcon(imagen);
            etiqueta2Panel2 = new JLabel(imageIcon);
            panel2.add(etiqueta2Panel2);
            this.getContentPane().add(panel2,1);

        }catch (MalformedURLException me){
            System.out.println("Url no valida");
        }catch (Exception e){
            System.out.println("Error al cargar la imagen");
        }

        //panel3
        panel3 = new JPanel();
        panel3.setBackground(new Color(141, 143, 253));

        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opción 1","Opción 2","Opción 3","Opción 4"};
        comboBoxPanel3 = new JComboBox<>(elementos);
        comboBoxPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBoxPanel3.getSelectedIndex());
            }
        });
        panel3.add(comboBoxPanel3);
        this.getContentPane().add(panel3,2);
        //panel4
        panel4 = new JPanel();
        panel1.setBackground(new Color(164, 231, 127));
        this.getContentPane().add(panel4,3);

        this.setVisible(true);

    }
}
