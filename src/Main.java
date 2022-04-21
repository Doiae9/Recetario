import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crear algunos ingredientes
        Ingrediente sal = new Ingrediente("sal",true,0.20f);
        Ingrediente aceite =new Ingrediente("aceite",false,20.0f);
        Ingrediente huevo =new Ingrediente("huevo",false,2f);
        Ingrediente cebolla =new Ingrediente("Cebolla",false,100f);

        //guardar esos ingredientes en un array list
        ArrayList<Ingrediente> ingredientesDispo= new ArrayList<>(Arrays.asList(sal, aceite, huevo, cebolla));

        //crear algunas recetas
        Receta Huevorevuelto= new Receta("Huevos Revueltos",
                15.30,
                new ArrayList<>(Arrays.asList(cebolla,sal,aceite,huevo)),
                new ArrayList<>(Arrays.asList("")
                ));
        //crear un recetario
        //y guardar las recetas en el recetario
        ArrayList<Receta>recetasactuales= new ArrayList<>(Arrays.asList(Huevorevuelto));
        Recetario miRecetario =new Recetario(
                new ArrayList<>(Arrays.asList(Huevorevuelto)),
          "Leo","Recetas caseras"
        );
        //¿cómo hacer una nueva receta
        //abrir un menú
        //desplegar los ingredientes disponibles y ponerles un número


        //los traigo con un get
        //mostrar las opciones que el usuario tiene

        //pendiente opción para salir
        Scanner scanner= new Scanner(System.in);
        int respuesta, ing, rec;
        do{
            System.out.println("Bienvenido, elige una opción: ");
            System.out.println("1. Agregar un ingrediente nuevo ");
            System.out.println("2. Agregar una receta nueva");
            System.out.println("3. Ver mi recetario");
            System.out.println("4. Eliminar ingrredientes");
            System.out.println("5. Eliminar receta");
            System.out.println("0. Salir");
        respuesta = scanner.nextInt();
        switch (respuesta){
            case 1:
                Ingrediente nuevo= new Ingrediente();
                System.out.println("Ingrese el nombre del ingrediente");
                nuevo.setNombre(scanner.next());
                System.out.println("Ingrese la cantidad");
                nuevo.setPeso(scanner.nextDouble());
                System.out.println("¿Tu ingrediente es salado? 1. Si\t2. No");
                if(scanner.nextInt()==1){
                    nuevo.setSalado(true);
                }else{
                    nuevo.setSalado(false);
                }
                System.out.println("Ingrediente creado");
                ingredientesDispo.add(nuevo);
                    break;

            case 2:
                Receta nueva =new Receta();
                System.out.println("Ingrese el nombre de la receta");
                nueva.setNombre(scanner.next());
                System.out.println("Ingrese el tiempo de preparación");
                nueva.setTiempoPreparacion(scanner.nextDouble());
                System.out.println("Los ingredientes disponibles son: ");
                for (int i = 0; i < ingredientesDispo.size(); i++) {
                    System.out.println(i+1+". "+ingredientesDispo.get(i));
                }
                ArrayList<Ingrediente> ingredientesReceta = new ArrayList<>();
                System.out.println("Ingrese el número del ingrediente correspondiente y de entero,"+
                        "si ya no quiere agregar más escriba 0");
                do {
                    respuesta=scanner.nextInt();
                    if (respuesta != 0) {
                        ingredientesReceta.add(ingredientesDispo.get(respuesta - 1));
                    }
                } while (respuesta != 0);
                //se le agrega un valor albitrario a respuesta para que
                //no se rompa el ciclo y continue corriendo.
                respuesta= 24;
                nueva.setIngredientes(ingredientesReceta);
                ArrayList<String> pasosReceta = new ArrayList<>();
                System.out.println("Ingrese los pasos de uno a uno y de enter,"+
                        "si ya no quiere agregar más escriba 0");
                String res ="";
                do{
                    res= scanner.nextLine();
                    if(!res.equals("0")){
                        pasosReceta.add(res);
                    }
                }while (!res.equals("0"));

                nueva.setPasos(pasosReceta);
                miRecetario.getReceta().add(nueva);
                break;

            case 3:
                miRecetario.mostrarRecetario();
                break;
              case 4:

                System.out.println("Cual desea eliminar?");
                System.out.println("si ya no deesea eliminar mas ingredientes presione 0");
                System.out.println("Los ingredientes disponibles son: ");

                    for (int i = 0; i < ingredientesDispo.size(); i++) {
                        System.out.println(i + 1 + ". " + ingredientesDispo.get(i));
                    }
                  System.out.println("Si ya no quiere eliminar mas ingredientes presione 0");
                do {

                        ing = scanner.nextInt();
                        if (ingredientesDispo.size()-ing>0 &&ing>0) {
                            ingredientesDispo.remove(ing - 1);
                            System.out.println("Ingrediente retirado");
                        }
                        else {
                            System.out.println("No existe este ingrediente");
                            continue;
                        }



                } while(ing!=0);
                break;
            case 5:
                System.out.println("Las recetas disponibles son:");
                miRecetario.mostrarRecetario();
                System.out.println("Cual desea eliminar");
                System.out.println("Si ya no quiere eliminar recetas presione 0");
                }
                do{
                    rec= scanner.nextInt();
                    if (miRecetario.getReceta().size()-rec>0 && rec>0){
                        miRecetario.getReceta().remove(rec-1);
                        System.out.println("Receta retirada");
                    }else{
                        System.out.println("No existe esa receta");
                        continue;
                }
                }while (rec!=0);
          break;
        }while (respuesta!=0);


    }
}
        //reto para las recetas;
//Agregar dos opciones para
//>Quitar ingredientes
//>Quitar recetas
//  Numero para cada receta
//  Pedirle al usuario el número de la receta
//