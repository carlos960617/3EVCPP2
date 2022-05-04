package Generics.EjsClase.Dia1.Genericos1;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList<String>();
        al.add("A");
        al.add(10);
        al.add(10.5);
        al.add(true);
        System.out.println(al);
    }
}
