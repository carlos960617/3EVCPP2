package Generics.EjsClase.Dia2.Genericos2;

import Generics.EjsClase.Dia2.Genericos1.Pila;

public class PilaArray<T> {

    T[] lista;
    int insert;

    public PilaArray(int tam){
        lista = (T[])new Object[tam];
        insert = 0;
    }

    boolean estaVacia(){

        return insert == 0;
    }

    T extraer(){

        if(!estaVacia()){
            T valor = lista[0];
            if(lista.length == 1){
                lista = (T[]) new Object[0];
            }else{
                for(int i=1, j=0;i<lista.length;i++, j++){
                    lista[j] = lista[i];
                    if(i == lista.length-1){
                        lista[i] = null;
                    }
                }
            }
            insert--;
            return valor;
        }else{
            return null;
        }
    }

    T primero(){

        return lista[0];
    }

    /*void añadir(T nuevoValor){

        int disponible = 0;
        int primeraDisponible = 0;
        boolean primerainsertada = false;
        for(int i=0;i<lista.length;i++){
            if(lista[i] == null && !primerainsertada){
                disponible++;
                primeraDisponible = i;
                primerainsertada = true;
            }else if(lista[i] == null){
                disponible++;
            }
        }

        if(disponible > 0){
            lista[primeraDisponible] = nuevoValor;
            insert++;
    }else{
            System.out.println("No quedan huecos en la pila");}
    }*/

    void añadir(T nuevoValor){

        boolean disponible = false;

        for(T x: lista){
            if(x == null){
                disponible = true;
            }else{
                System.out.println("No se pueden añadir elementos a la pila, está llena.");
            }
        }

        int aux= 0;

        if(disponible){

            for(int i=0;i<lista.length;i++){


            }

        }




    }

    @Override
    public String toString(){

        String array = " ";

        for(T x: lista){
            array += x+", ";
        }

        return array;
    }

}
