package Set.viernes1Abril;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    private static Set<CuerpoCeleste> planetas = new HashSet<>();
    private static Set<CuerpoCeleste> soloLunas = new HashSet<>();

    public static void nombresPlanetas(Set<CuerpoCeleste> p){

        System.out.println("Nombres de los planetas:");
        for(CuerpoCeleste x: p){
            System.out.println(x.getNombre());
        }

        System.out.println();
    }

    public static void printPlanetas(Set<CuerpoCeleste> p){

        System.out.println("toString de los planetas:");
        for(CuerpoCeleste x: p){
            System.out.println(x);
        }

        System.out.println();
    }

    public static void printLunasPlaneta(Map<String, CuerpoCeleste> SS, String planeta){
        Set<CuerpoCeleste> lunas= SS.get(planeta).getSatelites();

        for(CuerpoCeleste x: lunas ){
            System.out.println(x.getNombre());
        }

        System.out.println();
    }

    public static void agrupaLunas(Set<CuerpoCeleste> planetas){

        for(CuerpoCeleste x: planetas){
            Set<CuerpoCeleste> lunas = x.getSatelites();
            soloLunas.addAll(lunas);
        }
    }

    public static void printSoloLunas(Set<CuerpoCeleste> lunas){

        System.out.println("Lunas agrupadas de todo el sistema:");
        for(CuerpoCeleste x: lunas){
            System.out.println(x);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Planeta planeta1 = new Planeta("Mercurio", 88.0);
        Planeta planeta2 = new Planeta("Venus", 225.0);
        Planeta planeta3 = new Planeta("La Tierra", 365);
        Planeta planeta4 = new Planeta("Marte", 687);
        Planeta planeta5 = new Planeta("Jupiter", 4332);
        Planeta planeta6 = new Planeta("Saturno", 10759);
        Planeta planeta7 = new Planeta("Urano", 30660);
        Planeta planeta8 = new Planeta("Neptuno", 165);
        Planeta planeta9 = new Planeta("Pluton", 248);

        sistemaSolar.put("Mercurio", planeta1);
        sistemaSolar.put("Venus", planeta2);
        sistemaSolar.put("La Tierra", planeta3);
        sistemaSolar.put("Marte", planeta4);
        sistemaSolar.put("Jupiter", planeta5);
        sistemaSolar.put("Saturno", planeta6);
        sistemaSolar.put("Urano", planeta7);
        sistemaSolar.put("Neptuno", planeta8);
        sistemaSolar.put("Pluton", planeta9);

        planetas.add(planeta1);
        planetas.add(planeta2);
        planetas.add(planeta3);
        planetas.add(planeta4);
        planetas.add(planeta5);
        planetas.add(planeta6);
        planetas.add(planeta7);
        planetas.add(planeta8);
        planetas.add(planeta9);

        Luna luna1 = new Luna("Luna", 27);

        sistemaSolar.put("Luna", luna1);

        boolean entradaCorrecta = planeta3.addSatelite(luna1);

        System.out.println("Luna añadida a La Tierra: "+entradaCorrecta);

        Luna luna2 = new Luna("Deimos", 1.3);
        Luna luna3 = new Luna("Phobos", 0.3);

        sistemaSolar.put("Deimos", luna2);
        sistemaSolar.put("Phobos", luna3);

        planeta4.addSatelite(luna2);
        planeta4.addSatelite(luna3);

        Luna luna4 = new Luna("Io", 1.8);
        Luna luna5 = new Luna("Europa", 3.5);
        Luna luna6 = new Luna("Ganymede", 7.1);
        Luna luna7 = new Luna("Callisto", 16.7);

        sistemaSolar.put("Io", luna4);
        sistemaSolar.put("Europa", luna5);
        sistemaSolar.put("Ganymede", luna6);
        sistemaSolar.put("Callisto", luna7);

        planeta5.addSatelite(luna4);
        planeta5.addSatelite(luna5);
        planeta5.addSatelite(luna6);
        planeta5.addSatelite(luna7);

        nombresPlanetas(planetas);

        System.out.println("Imprime las lunas de Marte:");
        printLunasPlaneta(sistemaSolar, "Marte");

        System.out.println("Agrupamos todas las lunas añadidas hasta ahora...");
        agrupaLunas(planetas);

        printSoloLunas(soloLunas);

        Planeta planeta10 = new Planeta("Pluton", 884);

        sistemaSolar.put("Pluton2", planeta10);
        boolean esplutonañadido = planetas.add(planeta10);


        System.out.println("Planetas con el segundo platon añadido de tipo PLANETA:");
        nombresPlanetas(planetas);
        System.out.println("¿Es pluton añadido siendo de tipo PLANETA?: "+ esplutonañadido);
        /*No se ha añadido porque los atributos en base a los cuales se decide si dos objetos
        * son iguales son el nombre y el tipo, no la orbita para los Set de cuerpos celestes. Como los
        * dos objetos se llaman Pluton y son de tipo PLANETA, el set no admite el duplicado y no lo añade.*/

        System.out.println("Planetas con el segundo platon añadido de tipo PLANETA_ENANO");

        PlanetaEnano planeta11 = new PlanetaEnano("Pluton", 884);
        sistemaSolar.put("Platon3", planeta11);
        esplutonañadido= planetas.add(planeta11);

        printPlanetas(planetas);

        System.out.println("¿Es pluton añadido como planeta enano?: "+esplutonañadido);

        System.out.println("");

        /*Si se añade un cuerpo celeste de tipo diferente el equals de CuerpoCeleste lo considerará un
        * objeto diferente por lo que sí que lo añadirá al Set*/



        Set<CuerpoCeleste> todos = new HashSet<>();

        todos.addAll(planetas);
        todos.addAll(soloLunas);

        System.out.println("Utilzando la intersección y la diferencia:");

        System.out.println("En primer lugar añadimos todos los cuerpos a un set");

        printPlanetas(todos);

        Set<CuerpoCeleste> todos2 = new HashSet<>(todos);

        System.out.println("A continuacion utilizamos la interseccion (retainAll) para quedarnos solo con las lunas");

        todos.retainAll(soloLunas);

        printPlanetas(todos);

        System.out.println("O podriamos usar la diferencia (removeAll) para quedarnos solo con los planetas");

        todos2.removeAll(soloLunas);
        printPlanetas(todos2);


    }
}
