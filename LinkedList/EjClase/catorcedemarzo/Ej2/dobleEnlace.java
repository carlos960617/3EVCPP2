package LinkedList.EjClase.catorcedemarzo.Ej2;



import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class dobleEnlace {

    static Scanner sc = new Scanner(System.in);

    //EJERCICIO 3

    public static void iterador(LinkedList<Integer> list){

        ListIterator<Integer> it = list.listIterator();


        System.out.println("Elige 1 para avanzar, 2 para retroceder y 0 para salir");
        int opcion = sc.nextInt();
        boolean avanza = true;
        if(list.isEmpty()){
            System.out.println("No hay elementos en la lista");
            return;
        }
        while(opcion != 0){

                if(!avanza) it.next();


                switch (opcion){
                    case 1:
                        if(it.hasNext()){
                            System.out.println(it.next());
                            avanza = true;
                        }else{
                            System.out.println("No hay mas elementos");
                        }
                        break;

                    case 2:

                            it.previous();
                            avanza = false;
                            if(it.hasPrevious()){
                                System.out.println(it.previous());
                            }else{
                                System.out.println("Estas en el primer numero");
                            }
                            break;


                }

            System.out.println("Siguiente opcion (<-2, 1->, salir=0");
            opcion = sc.nextInt();

            }


    }

    public static void rellenaInt (LinkedList<Integer> li){

        for(int i = 0;i<8;i++){
            li.add(i, (int)(Math.random()*99));
        }
    }

    /*public static void intOrdenado (LinkedList<Integer> li){

        for(int i = 0;i<5;i++){
            int item = (int)(Math.random()*99);
            if(li.get(i) != null){
                if(li.get(i) >= item){
                    li.add(i, item);
                }else{li.addFirst(item);}
            }else{
                li.add(item);
            }
        }
    }*/


    //Este metodo esta sin hacer!!!!
    public static void intOrdenado (LinkedList<Integer> li){

        for(int i = 0;i<5;i++){
            int item = (int)(Math.random()*99);
            li.add(item);
            if(li.get(i) != null){
                if(li.get(i) >= item){
                    li.add(i, item);
                }else{li.addFirst(item);}
            }else{
                li.add(item);
            }
        }
    }

    public static void main(String[] args) {

        LinkedList<String> ls1 = new LinkedList<>();
        LinkedList<String> ls2 = new LinkedList<>();
        LinkedList<Integer> li1 = new LinkedList<>();
        LinkedList<Integer> li2 = new LinkedList<>();

        rellenaInt(li1);

        System.out.println(li1);

        intOrdenado(li2);

        iterador(li1);



    }
}
