package LinkedList.EjClase.veintidosdemarzo;

import java.util.LinkedList;

public class Jugador implements Saveable{

    private String nombre, arma;
    private int hitPoints, fuerza, vida;

    public Jugador(String n, int hP, int f){
        nombre = n;
        hitPoints = hP;
        fuerza = f;
        vida = 500;
        arma = "Espada";
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArma() {
        return arma;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int inflingeDaño(Monstruo objetivo, int daño){

        int dañoArma = Lucha.dañoArma(this.getArma());

        System.out.println("El jugador usa su "+this.getArma());

        int dañoTotal = objetivo.getVida()-((daño + dañoArma)*getFuerza());

        if(dañoTotal > 0){
            System.out.println("Al monstruo le quedan "+dañoTotal+" puntos de vida ");
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
        lista.add(arma);

        return lista;
    };

    @Override
    public void read(LinkedList<String> lista){

        if(!lista.isEmpty()){
            nombre = lista.get(0);
            hitPoints = Integer.parseInt(lista.get(1));
            fuerza = Integer.parseInt(lista.get(2));
            arma = lista.get(3);
        }

    };

    @Override
    public String toString(){
        return "Jugador{nombre= "+nombre+", hitPoints= "+hitPoints+", fuerza= "+fuerza+", arma= "+arma+"}";
    }
}
