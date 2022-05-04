package Generics.EjsClase.Dia2.Genericos4;

import Generics.EjsClase.Dia2.Genericos5.SetOverFlow;

import java.util.Arrays;

public class Set <T>{

    private T[] array = (T[])new Object[10];

    public T[] getArray() {
        return array;
    }

    boolean insert(T element){
        //boolean colocado = false;
        try{
            for(int i=0;i<array.length;i++){
                if(array[i] == null){
                    array[i] = element;
                    //colocado= true;
                    return true;
                }
            }

            throw new SetOverFlow("No hay espacios para añadir mas elementos al conjunto");
        }catch(SetOverFlow ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    boolean delete (T element){

        boolean eliminado = false;

        for(int i=0;i<array.length;i++){

            if(array[i] != null && array[i].equals(element)){
                array[i] = null;
                eliminado = true;
            }
        }

        return eliminado;
    }

     T find(T element){

         for(int i=0;i<array.length;i++){

             if(array[i] != null && array[i].equals(element)){
                 return array[i];
             }
         }

         System.out.println("El elemento no se encuentra en el conjunto");
        return null;
    }

    @Override
    public String toString() {
        return "Set{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
