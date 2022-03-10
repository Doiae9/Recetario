public class Ingrediente {
    String nombre;
    boolean Salado;
    double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSalado() {
        return Salado;
    }

    public void setSalado(boolean salado) {
        Salado = salado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Ingrediente(String nombre, boolean salado, double peso) {
        this.nombre = nombre;
        Salado = salado;
        this.peso = peso;
        System.out.println("Ingrediente creado");
    }
}
