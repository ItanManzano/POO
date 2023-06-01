package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Redes extends Object{
    private int id;
    private String nombre;
    private String desarrollador;
    private String pais;
    private int anio;
    private String duenio;
    private String urlimagen;

    public Redes() {
    }

    public Redes(int id, String nombre, String desarrollador, String pais, int anio, String duenio, String urlimagen) {
        this.id = id;
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.pais = pais;
        this.anio = anio;
        this.duenio = duenio;
        this.urlimagen = urlimagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }

    @Override
    public String toString() {
        return "Redes{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                ", pais='" + pais + '\'' +
                ", año=" + anio +
                ", dueño='" + duenio + '\'' +
                ", urlimagen='" + urlimagen + '\'' +
                '}';
    }
    public ImageIcon getImagenI () throws MalformedURLException{
        URL urlI = new URL(this.urlimagen);
        return new ImageIcon(urlI);
    }
}
