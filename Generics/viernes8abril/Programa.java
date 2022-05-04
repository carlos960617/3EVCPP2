package Generics.viernes8abril;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        matriz<Integer> m1 = new matriz<>(4, 2);


        int x=1;
        for(int i=0; i<m1.filas();i++){
            for(int j=0;j<m1.columnas();j++){
                m1.set(i,j,x);
                x++;
            }
        }

        System.out.println(m1);

        System.out.println(m1.get(0,1));

        //m1.set(0, 1, 4.5);

        /*No se puede añadir un tipo distinto a Integer porque se ha
        * pareametrizado a Integer*/

        matriz<String> m2 = new matriz<>(2, 3);

        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        String line = "";

        for(int i=0; i<m2.filas();i++){
            for(int j=0;j<m2.columnas();j++){
                System.out.println("Frase");
                line = sc.nextLine();
                m2.set(i,j,line+" ");

            }
        }

        System.out.println(m2);

    }
}
