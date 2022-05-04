package Maps.viernes25marzo;

import java.util.HashMap;
import java.util.Map;

public class Ubicacion {

    private int id;
    private String descripcion;
    private Map<String, Integer> exits;

    public Ubicacion(int id, String desc){
        this.id = id;
        this.descripcion = desc;
        exits = new HashMap<>();
        exits.put("Q", 0);
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

    public void addExit(String direc, int idUbi){
        exits.put(direc, idUbi);
    }


}
