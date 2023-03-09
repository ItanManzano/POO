package ICO.fes;

import java.awt.*;

public class Libro {
    private String autor;
    private double npaginas;
    private String tematica;
    private Color cportada;

    //Constructor por defecto
    public Libro(String autor) {
        this.autor = autor;
    }

    //Constructor cargado

    public Libro(String autor, double npaginas, String tematica, Color cportada) {
        this.autor = autor;
        this.npaginas = npaginas;
        this.tematica = tematica;
        this.cportada = cportada;
    }

    // Get and set

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(double npaginas) {
        this.npaginas = npaginas;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public Color getCportada() {
        return cportada;
    }

    public void setCportada(Color cportada) {
        this.cportada = cportada;
    }

    //To string

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", npaginas=" + npaginas +
                ", tematica='" + tematica + '\'' +
                ", cportada=" + cportada +
                '}';
    }

    //Metodos
    public boolean leer(){
        System.out.println("Leyendo libro de" + autor );
        return true;
    }
    public boolean cerrar(){
        System.out.println("Terminamos de leer por hoy el libro de" + tematica);
    return true;
    }
}
