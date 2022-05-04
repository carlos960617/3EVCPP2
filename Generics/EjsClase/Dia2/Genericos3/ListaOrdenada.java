package Generics.EjsClase.Dia2.Genericos3;

import java.util.ArrayList;

public class ListaOrdenada <E extends Comparable>{

    ArrayList<E> lista;

    public ListaOrdenada(){
        lista = new ArrayList<>();
    }

    void add(E o){

        for(int i=0; i<lista.size();i++){
            if(lista.get(i).compareTo(o) == 0){

                System.out.println("El elemento ya esta en la lista");

            }else if(o.compareTo(lista.get(i))<0){
                lista.add(i+1, o);

            }else{

                lista.add(o);
            }



        }



    }
}
