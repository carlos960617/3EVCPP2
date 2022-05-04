package LinkedList.EjClase.veintidosdemarzo;

import java.util.LinkedList;

enum Armas {Espada, Maza, Trueno, Pistola}

public class Jugador implements Saveable{

    private String nombre;
    private int hitPoints, fuerza, vida;
    private  Armas armas;

    public Jugador(String n, int hP, int f){
        nombre = n;
        hitPoints = hP;
        fuerza = f;
        vida = 500;
        armas = Armas.Espada;
    }

    public Jugador(String n, int hP, int f, Armas arma){
        nombre = n;
        hitPoints = hP;
        fuerza = f;
        vida = 500;
        armas = arma;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public Armas getArmas(Jugador j1) {return j1.armas;}

    public int getHitPoints() {
        return hitPoints;
    }

    public int getFuerza() {
        return fuerza;
    }

    /*public int inflingeDaño(Monstruo objetivo, int daño, Jugador j1){

        //int dañoArma = Lucha.dañoArma(this.getArmas(j1));

        System.out.println("El jugador usa su "+this.getArmas(j1));

        //int dañoTotal = objetivo.getVida()-((daño + dañoArma)*getFuerza());

        if(dañoTotal > 0){
            System.out.println("Al monstruo le quedan "+dañoTotal+" puntos de vida ");
            return dañoTotal;
        }else{
            System.out.println("Has matado a tu oponente");
            return -1;
        }

    }*/

    @Override
    public LinkedList<String> write(){
        LinkedList<String> lista = new LinkedList<>();

        lista.add(nombre);
        /*Dos formas de convertir a String:*/
        lista.add(""+hitPoints);
        lista.add(Integer.toString(fuerza));
        //lista.add(armas);

        return lista;
    };

    @Override
    public void read(LinkedList<String> lista){

        if(!lista.isEmpty()){
            nombre = lista.get(0);
            hitPoints = Integer.parseInt(lista.get(1));
            fuerza = Integer.parseInt(lista.get(2));
           // armas = lista.get(3);
        }

    }

    @Override
    public String toString(){
        return "Jugador{nombre= "+nombre+", hitPoints= "+hitPoints+", fuerza= "+fuerza+", arma= "+armas+"}";
    }
}
