/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author EANDRADA
 */
public class Libro {
    
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int Npaginas;
    
    public Libro () {
        
    }

    public Libro(int ISBN, String Titulo, String Autor, int Npaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Npaginas = Npaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNpaginas(int Npaginas) {
        this.Npaginas = Npaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNpaginas() {
        return Npaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Npaginas=" + Npaginas + '}';
    }

    
    
}
