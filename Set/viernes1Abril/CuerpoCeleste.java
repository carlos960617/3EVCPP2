package Set.viernes1Abril;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

enum TipoCuerpoCeleste {ESTRELLA, PLANETA, PLANETA_ENANO, LUNA, COMETA, ASTEROIDE}
public class CuerpoCeleste {

    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String n, double PO, TipoCuerpoCeleste tipo){
        nombre = n;
        periodoOrbital = PO;
        tipoCuerpo = tipo;
        satelites = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public HashSet<CuerpoCeleste> getSatelites() {

        return new HashSet<>(satelites);
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public boolean addSatelite(CuerpoCeleste cuerpo){

        return satelites.add(cuerpo);
    }

    @Override
    public boolean equals(Object B){

        CuerpoCeleste O = (CuerpoCeleste)B;

        //¿Porqué puedo acceder al nombre de CuerpoCeleste si es privado?

        return nombre.equals(O.nombre) && tipoCuerpo == O.tipoCuerpo && getClass() == B.getClass();
    }

    @Override
    public int hashCode(){

        return nombre.hashCode() + tipoCuerpo.hashCode();
    }

    public String toString(){

        return nombre+": "+tipoCuerpo+", "+periodoOrbital;
    }

    public static void main(String[] args) {



    }
}
