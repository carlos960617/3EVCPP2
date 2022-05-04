package Generics.viernes8abril;

import java.util.ArrayList;

public class matriz<T> {

    T[][] array;

    public matriz(int f, int c){
        /*El array solo se puede crear con tipos concretos como Objeto */

        array = (T[][]) new Object[f][c];
    }

    void set(int f, int c, T x){

        array[f][c] = x;

    }

    T get(int f, int c){

        return array[f][c];

    }

    int columnas(){

        return array[0].length;
    }

    int filas(){

        return array.length;
    }

    @Override
    public String toString(){

        String datos ="";

        for(T[] x:array){
            int num = 0;
            for(T y: x){
                System.out.print(x[num]);
                num++;
            }
            System.out.println(" ");
        }
        return datos;
    }
}
