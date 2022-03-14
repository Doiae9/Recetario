import java.util.ArrayList;

public class Recetario {
    private ArrayList<Recetario> recetario;
    private String autor, titulo;

    public Recetario(ArrayList<Recetario> recetario, String autor, String titulo) {
        this.recetario = recetario;
        this.autor = autor;
        this.titulo = titulo;
    }

    public ArrayList<Recetario> getRecetario() {
        return recetario;
    }

    public void setRecetario(ArrayList<Recetario> recetario) {
        this.recetario = recetario;
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
}