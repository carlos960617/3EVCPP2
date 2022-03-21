package Maps;

import java.util.HashMap;
import java.util.Map;

public class personaMap {

    public String nombre;
    public int identificador, altura;

    public personaMap(String n, int id, int alt){
        nombre =n;
        identificador=id;
        altura=alt;
    }

    @Override
    public String toString(){
        return "Persona-> ID: "+identificador+" Nombre: "+nombre+" Altura: "+altura+"\n";
    }

    public static void main(String[] args) {

        Map<Integer, personaMap> listaPersonas = new HashMap<>();

        listaPersonas.put(1, new personaMap("Lorena Ferrero Rocher", 7453458, 165));
        listaPersonas.put(2, new personaMap("Gimena Ferrero Rocher", 7445458, 185));
        listaPersonas.put(3, new personaMap("Rosaura Ferrero Rocher", 743553458, 160));
        listaPersonas.put(4, new personaMap("Sarita Ferrero Rocher", 745566458, 175));

        System.out.println(listaPersonas);
    }
}
