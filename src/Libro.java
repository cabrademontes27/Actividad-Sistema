import java.util.ArrayList;
import java.util.List;

public class Libro {

    private static int contador = 1;
    private int id;
    private String autor;
    private String titulo;
    private boolean disponibilidad = true;
    
    public Libro(String autor, String titulo, boolean disponibilidad){
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
        this.id = contador++;
    }

    public static List<Libro> listaLibroa = new ArrayList<Libro>();
    static{
        listaLibroa.add(new Libro("Gabriel García Márquez", "Cien Años de Soledad", true));
        listaLibroa.add(new Libro("George Orwell", "1984", true));
        listaLibroa.add(new Libro("Miguel de Cervantes", "El Quijote", true));
        listaLibroa.add(new Libro("Antoine de Saint-Exupéry", "El Principito", true));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro [contador=" + contador + ", id=" + id + ", autor=" + autor + ", titulo=" + titulo
                + ", disponibilidad=" + disponibilidad + "]";
    }

}
