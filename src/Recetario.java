import java.util.ArrayList;

public class Recetario {
    private ArrayList<Receta> receta;
    private String autor, titulo;

    public Recetario(ArrayList<Receta> recetario, String autor, String titulo) {
        this.receta = recetario;
        this.autor = autor;
        this.titulo = titulo;
    }

    public ArrayList<Receta> getReceta() {
        return receta;
    }

    public void setreceta(ArrayList<Receta> recetario) {
        this.receta = recetario;
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
    public void mostrarRecetario(){
        System.out.println(titulo);
        System.out.println(autor);
        for(Receta receta: receta) {
            receta.mostrarReceta();
        }
        }

        }

