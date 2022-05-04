package Maps.viernes25marzo;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Principal {

    static Scanner sc = new Scanner(System.in);

    private static Map<Integer, Ubicacion> ubicaciones = new HashMap<>();

    public Principal(){

        ubicaciones.put(0, new Ubicacion(0, "Estás sentado en la clase de programación"));
        ubicaciones.put(1, new Ubicacion(1, "Estás en la cima de una montaña"));
        ubicaciones.put(2, new Ubicacion(2, "Estás bañándote en la playa"));
        ubicaciones.put(3, new Ubicacion(3, "Estás dentro de un edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4,"Estás de pie en un puente"));
        ubicaciones.put(5, new Ubicacion(5, "Estás en un bosque"));

        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("S", 4);
        ubicaciones.get(1).addExit("O", 2);
        ubicaciones.get(1).addExit("E", 3);
        //ubicaciones.get(1).addExit("Q", 0);

        ubicaciones.get(2).addExit("N", 5);
        ubicaciones.get(2).addExit("S", 4);
        ubicaciones.get(2).addExit("E", 1);
        //ubicaciones.get(2).addExit("Q", 0);

        ubicaciones.get(3).addExit("O", 1);
        //ubicaciones.get(3).addExit("Q", 0);

        ubicaciones.get(4).addExit("O", 2);
        ubicaciones.get(4).addExit("N", 1);
        //ubicaciones.get(4).addExit("Q", 0);

        ubicaciones.get(5).addExit("O", 2);
        ubicaciones.get(5).addExit("S", 1);
        //ubicaciones.get(5).addExit("Q", 0);

    }

    /*public Map<Integer, Ubicacion> getUbicaciones() {
        return ubicaciones;
    }*/

    public static void main(String[] args) {

        Principal posicion = new Principal();

        String opcion = "N";

        int direccion =1;



        while(!opcion.equals("Q")){

            System.out.println(ubicaciones.get(direccion).getDescripcion());

            System.out.println("Salidas disponibles");

            System.out.println(ubicaciones.get(direccion).getExits().keySet());

            System.out.println("¿A donde quieres ir ahora?");

            opcion = sc.nextLine().toUpperCase();
            boolean dirCorrecta = false;

            while(!dirCorrecta && !opcion.equalsIgnoreCase("Q")){
                if(ubicaciones.get(direccion).getExits().containsKey(opcion)){
                    direccion = ubicaciones.get(direccion).getExits().get(opcion);
                    dirCorrecta = true;
                }else{
                    System.out.println("No puedes ir en esa dirección, introduce un valor adecuado");
                    opcion = sc.nextLine().toUpperCase();
                }
            }

        }

        System.out.println(ubicaciones.get(0).getDescripcion());

        /*Controlando poder añadir una salida nueva*/

        System.out.println(ubicaciones);



    }
}
