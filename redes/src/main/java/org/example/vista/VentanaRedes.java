package org.example.vista;
import javax.swing.*;
import java.awt.*;
public class VentanaRedes extends JFrame{
    private JLabel lblid;
    private JTextField txtid;
    private JLabel lblnombre;
    private JTextField txtnombre;
    private JLabel lbldesarrollador;
    private JTextField txtdesarrollador;
    private JLabel lblpais;
    private JTextField txtpais;
    private JLabel lblanio;
    private JTextField txtanio;
    private JLabel lblduenio;
    private JTextField txtduenio;
    private JLabel lblurlimagen;
    private JTextField txturlimagen;
    private JButton btnAgregar;
    private JButton btnLimpiar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnModificar;
    private JTable tblRedes;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1; //Introducir redes sociales
    private JPanel panel2; //Tabla
    private JPanel panel3; //Imagen url
    private JPanel panel4; //Mover tabla

    public VentanaRedes(String title) throws HeadlessException {
        super(title);
        this.setSize(900, 900);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);

        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(193, 195, 255));
        lblid = new JLabel("ID: ");
        lblid.setFont(new Font("Footlight MT Light", Font.BOLD, 15));

        lblnombre = new JLabel("Nombre: ");
        lblnombre.setFont(new Font("Footlight MT Light", Font.BOLD, 15));

        lbldesarrollador = new JLabel("Desarrollador: ");
        lbldesarrollador.setFont(new Font("Footlight MT Light", Font.BOLD, 15));

        lblpais = new JLabel("Pais: ");
        lblpais.setFont(new Font("Footlight MT Light", Font.BOLD, 15));

        lblanio = new JLabel("Anio de lanzamiento: ");
        lblanio.setFont(new Font("Footlight MT Light", Font.BOLD, 15));

        lblduenio = new JLabel("Duenio: ");
        lblduenio.setFont(new Font("Footlight MT Light", Font.BOLD, 15));

        lblurlimagen = new JLabel("Url de la imagen: ");
        lblurlimagen.setFont(new Font("Footlight MT Light", Font.BOLD, 15));

        txtid = new JTextField(2);
        txtid.setFont(new Font("Arial", Font.PLAIN, 15));
        txtid.setText("0");
        txtid.setEnabled(false);

        txtnombre = new JTextField(20);
        txtnombre.setFont(new Font("Arial", Font.ITALIC, 15));

        txtdesarrollador = new JTextField(20);
        txtdesarrollador.setFont(new Font("Arial", Font.ITALIC, 15));

        txtpais = new JTextField(11);
        txtpais.setFont(new Font("Arial", Font.ITALIC, 15));

        txtanio = new JTextField(4);
        txtanio.setFont(new Font("Arial", Font.ITALIC, 15));

        txtduenio = new JTextField(20);
        txtduenio.setFont(new Font("Arial", Font.ITALIC, 15));

        txturlimagen = new JTextField(30);
        txturlimagen.setFont(new Font("Arial", Font.ITALIC, 15));

        btnAgregar = new JButton("Agregar");
        btnLimpiar = new JButton("Limpiar");

        panel1.add(lblid);
        panel1.add(txtid);
        panel1.add(lblnombre);
        panel1.add(txtnombre);
        panel1.add(lbldesarrollador);
        panel1.add(txtdesarrollador);
        panel1.add(lblpais);
        panel1.add(txtpais);
        panel1.add(lblanio);
        panel1.add(txtanio);
        panel1.add(lblduenio);
        panel1.add(txtduenio);
        panel1.add(lblurlimagen);
        panel1.add(txturlimagen);
        panel1.add(btnAgregar);
        panel1.add(btnLimpiar);


        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(255, 139, 244));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblRedes = new JTable();
        scrollPane = new JScrollPane(tblRedes);
        panel2.add(scrollPane);

        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(126, 255, 126));
        lblurlimagen = new JLabel(" ");
        panel3.add(lblurlimagen);

        //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(75, 98, 255));
        JLabel accion = new JLabel("¿Que desea hacer?");
        accion.setFont(new Font("Arial", Font.BOLD, 15));
        btnEliminar = new JButton("Eliminar");
        btnModificar = new JButton("Modificar");
        panel4.add(btnModificar);

        panel4.add(accion);
        panel4.add(btnEliminar);
        panel4.add(btnCargar);

        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblid() {
        return lblid;
    }

    public void setLblid(JLabel lblid) {
        this.lblid = lblid;
    }

    public JTextField getTxtid() {
        return txtid;
    }

    public void setTxtid(JTextField txtid) {
        this.txtid = txtid;
    }

    public JLabel getLblnombre() {
        return lblnombre;
    }

    public void setLblnombre(JLabel lblnombre) {
        this.lblnombre = lblnombre;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JLabel getLbldesarrollador() {
        return lbldesarrollador;
    }

    public void setLbldesarrollador(JLabel lbldesarrollador) {
        this.lbldesarrollador = lbldesarrollador;
    }

    public JTextField getTxtdesarrollador() {
        return txtdesarrollador;
    }

    public void setTxtdesarrollador(JTextField txtdesarrollador) {
        this.txtdesarrollador = txtdesarrollador;
    }

    public JLabel getLblpais() {
        return lblpais;
    }

    public void setLblpais(JLabel lblpais) {
        this.lblpais = lblpais;
    }

    public JTextField getTxtpais() {
        return txtpais;
    }

    public void setTxtpais(JTextField txtpais) {
        this.txtpais = txtpais;
    }

    public JLabel getLblanio() {
        return lblanio;
    }

    public void setLblanio(JLabel lblanio) {
        this.lblanio = lblanio;
    }

    public JTextField getTxtanio() {
        return txtanio;
    }

    public void setTxtanio(JTextField txtanio) {
        this.txtanio = txtanio;
    }

    public JLabel getLblduenio() {
        return lblduenio;
    }

    public void setLblduenio(JLabel lblduenio) {
        this.lblduenio = lblduenio;
    }

    public JTextField getTxtduenio() {
        return txtduenio;
    }

    public void setTxtduenio(JTextField txtduenio) {
        this.txtduenio = txtduenio;
    }

    public JLabel getLblurlimagen() {
        return lblurlimagen;
    }

    public void setLblurlimagen(JLabel lblurlimagen) {
        this.lblurlimagen = lblurlimagen;
    }

    public JTextField getTxturlimagen() {
        return txturlimagen;
    }

    public void setTxturlimagen(JTextField txturlimagen) {
        this.txturlimagen = txturlimagen;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JTable getTblRedes() {
        return tblRedes;
    }

    public void setTblRedes(JTable tblRedes) {
        this.tblRedes = tblRedes;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
    public void limpiar(){
        txtnombre.setText("");
        txtdesarrollador.setText("");
        txtpais.setText("");
        txtanio.setText("");
        txtduenio.setText("");
        txturlimagen.setText("");
    }
}
