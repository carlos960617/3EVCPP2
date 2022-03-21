package Maps;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class coloresMap {

    public static void main(String[] args) {

        Map<String, String> colores = new HashMap<>();

        colores.put("rojo", "red");
        colores.put("blanco", "white");
        colores.put("negro", "black");

        System.out.println("\nValores del mapa:");

        System.out.println(colores.values());

        System.out.println("\nTraducciones:");

        for(String color: colores.keySet()){
            System.out.println("El color "+color+" se dice en inglés \""+colores.get(color)+"\"");
        }

        System.out.println("\nClaves:");

        for(String color: colores.keySet()){
            System.out.println(color);
        }

        System.out.println("\nClaves (forma 2)");

        System.out.println(colores.keySet());



        colores.get("rosa");

        /*Default value puede ser un put que añada malva y su valor a la lista o
        * cualquier otra cosa que quires que ahg appor defecto*/

        colores.getOrDefault("Malva", "No tenemos clave para ese color");

        colores.containsValue("pink");



        colores.remove("rojo");

        System.out.println("\nMapa habiendo eliminado el rojo:");

        for(String color: colores.keySet()){
            System.out.println("El color "+color+" se dice en inglés \""+colores.get(color)+"\"");
        }

        System.out.println("\nImprimiendo mapa con formato por defecto de su toString");
        System.out.println(colores);

        Iterator<String> it = colores.keySet().iterator();

        System.out.println("");
        while(it.hasNext()){
            String clave = it.next();
            System.out.println(clave+"-"+colores.get(clave));
        }



        //metodo getOrDefault para ahorrarte ifs con gets nulos
    }
}
