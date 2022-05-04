package Generics.EjsClase.Dia1.Genericos4;

import java.util.ArrayList;

public class arrayNumber {

    public static <T> void arrayNumber(ArrayList<T> array){

        for(T x:array){
            System.out.println(x);
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayN = new ArrayList<>();
        ArrayList<Double> arrayD = new ArrayList<>();
        ArrayList<String> arrayS= new ArrayList<>();

        arrayD.add(5.2);
        arrayD.add(6.77);
        arrayD.add(9.88);

        arrayS.add("Lorena");
        arrayS.add("Fatima");
        arrayS.add("Jimena");


        arrayN.add(1);
        arrayN.add(2);
        arrayN.add(3);

        arrayNumber(arrayD);

        arrayNumber(arrayN);

        arrayNumber(arrayS);
    }
}
