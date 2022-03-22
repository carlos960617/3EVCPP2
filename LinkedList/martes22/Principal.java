package LinkedList.martes22;

import java.util.LinkedList;
import java.util.ListIterator;

public class Principal {

    public static boolean analizador(String S){

        LinkedList<Character> pila = new LinkedList<>();
        //ListIterator<Character> it = pila.listIterator();
        for (int i=0;i<S.length();i++){
            if(S.charAt(i) == '('){
                pila.addLast(S.charAt(i));
            }else if(S.charAt(i) ==')'){
                if(pila.isEmpty()){
                    return false;
                }else{
                    pila.removeLast();
                }

            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {

        String S1 = "Tengo hambre (Aún no he comido( .¿Tienes algo para mi?";

        String S2 = "Debemos esperar(aunque llevemos mucho esperando)y los niños estén desesperados))";

        String S3 = "(a+b)^2+)(a-b)*5)^3";

        String S4 = "))(a+b)*(c-d)+i)(";

        boolean r1 = analizador(S1);
        boolean r2 = analizador(S2);
        boolean r3 = analizador(S3);
        boolean r4 = analizador(S4);

        System.out.println("EXPRESIONES EQULIBRADAS: \n" +
                "S1 :"+r1+"\n" +
                "S2 :"+r2+"\n" +
                "S3 :"+r3+"\n" +
                "S4 :"+r4);


    }
}
