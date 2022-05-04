package Generics.EjsClase.Dia2.Genericos1;

import java.util.LinkedList;

public class Pila<T> {

    LinkedList<T> lista;

    public Pila(){
        lista = new LinkedList<>();
    }

    boolean estaVacia(){

        return lista.isEmpty();
    }

    T extraer(){

        if(!estaVacia()){
            return lista.removeFirst();
        }else{
            return null;
        }
    }

    T primero(){

        return lista.getFirst();
    }

    void añadir(T bebe){

        lista.addFirst(bebe);
    }

    @Override
    public String toString(){

        return lista.toString();
    }

}
