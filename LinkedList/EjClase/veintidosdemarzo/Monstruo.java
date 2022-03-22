package LinkedList.EjClase.veintidosdemarzo;

import java.util.LinkedList;

public class Monstruo implements Saveable{

    private String nombre;
    private int hitPoints, fuerza, vida;

    public Monstruo(String n, int hP, int f){

        nombre = n;
        hitPoints = hP;
        fuerza = f;
        vida= 600;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int inflingeDaño(Jugador objetivo, int daño){


        int dañoTotal = objetivo.getVida()-(daño*fuerza);

        if(dañoTotal > 0){
            System.out.println("Al jugador le quedan "+dañoTotal+" puntos de vida ");
            return dañoTotal;
        }else{
            System.out.println("Has matado a tu oponente");
            return -1;
        }

    }

    @Override
    public LinkedList<String> write(){
        LinkedList<String> lista = new LinkedList<>();

        lista.add(nombre);
        /*Dos formas de convertir a String:*/
        lista.add(""+hitPoints);
        lista.add(Integer.toString(fuerza));

        return lista;
    };

    @Override
    public void read(LinkedList<String> lista){

        if(!lista.isEmpty()){
            nombre = lista.get(0);
            hitPoints = Integer.parseInt(lista.get(1));
            fuerza = Integer.parseInt(lista.get(2));
        }

    }

    @Override
    public String toString(){
        return "Monstruo{nombre= "+nombre+", hitPoints= "+hitPoints+", fuerza= "+fuerza+"}";
    }
}
