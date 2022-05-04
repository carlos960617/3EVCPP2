package Generics.EjsClase.Dia1.Genericos1;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");

        m1(al);
        System.out.println(al);
    }

    public static void m1(ArrayList al){
        al.add(10);
        al.add(10.5);
        al.add(true);
    }
}
