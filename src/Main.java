import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //crear algunos ingredientes
        Ingrediente sal = new Ingrediente("sal",true,0.20);
        Ingrediente aceite =new Ingrediente("aceite"false,20.0);
        Ingrediente huevo =new Ingrediente("huevo",false,2);
        Ingrediente cebolla =new Ingrediente("Cebolla",false,);

        //guardar esos ingredientes en un array list
        ArrayList<Ingrediente> ingredientesDispo= new ArrayList<>(Arrays.asList(sal, aceite, huevo, cebolla));

        //crear algunas recetas
        Receta Huevorevuelto= new Receta("Huevos Revueltos",
                15.30,
                new ArrayList<>(Arrays.asList)(cebolla,sal,aceite,huevo)),
                new ArrayList<>(Array.asList("")
        );
        //crear un recetario
        //y guardar las recetas en el recetario

        //¿cómo hacer una nueva receta
        //abrir un menú
        //desplegar los ingredientes disponibles y ponerles un número
        //hacer un arraylist de ingredientes
        //los traigo con un get

    }
}
