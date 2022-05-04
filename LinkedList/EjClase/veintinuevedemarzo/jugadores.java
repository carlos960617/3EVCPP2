package LinkedList.EjClase.veintinuevedemarzo;

import java.util.HashSet;
import java.util.Set;

public class jugadores {

    public static void main(String[] args) {

        Set<String> jugadores = new HashSet();

        jugadores.add("Marc-André");
        jugadores.add("Neto");
        jugadores.add("Arnau Tenas");
        jugadores.add("Ronald Araújo");
        jugadores.add("Eric García");
        jugadores.add("Clément Lenglet");
        jugadores.add("Óscar Minguez");
        jugadores.add("Gerard Piqué");
        jugadores.add("Samuel Umtiti");
        jugadores.add("Jordi Alba");

        for(String x: jugadores){
            System.out.println(x);
        }

        boolean contiene = jugadores.contains("Neymar JR");

        System.out.println("Contiene Neymar JR= "+contiene);

        Set<String> jugadores2 = new HashSet<>();

        jugadores2.add("Piqué");
        jugadores2.add("Busquets");
        boolean intento  = jugadores2.add("Piqué");
        System.out.println("¿Puedo añadir dos Piqués?= "+intento);

        for(String x: jugadores2){
            System.out.println(x);
        }

        //No, porque SET controla que no se introduzcan datos repetidos

        boolean contieneTodos = jugadores.containsAll(jugadores2);

        System.out.println("La lista 1 tiene todos los valores de la 2?= "+contieneTodos);

        jugadores.addAll(jugadores2);

        jugadores2.clear();

        System.out.println("Numero de jugadores en la segunda lista despues de borrar= "+ jugadores2.size());

        System.out.println("Las dos listas unidas:");
        for(String x: jugadores){
            System.out.println(x);
        }

    }
}
