package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class UsandoIterator {

    public static void main(String[] args) {

        /**/

        LinkedList<Integer> numList = new LinkedList<>();

        numList.add(5);
        numList.add(6);

        Iterator<Integer> it = numList.iterator();

        /*while(it.hasNext()){
            System.out.println(it.next());
            System.out.println(it.next());
        }*/

            System.out.println(it.next());
            System.out.println(it.next());




    }
}
