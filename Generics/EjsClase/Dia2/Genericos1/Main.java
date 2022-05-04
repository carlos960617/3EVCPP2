package Generics.EjsClase.Dia2.Genericos1;

public class Main {

    public static void main(String[] args) {

        Pila pila1 = new Pila();

        pila1.añadir("Hola");
        pila1.añadir(1);
        pila1.añadir(1.1);
        System.out.println(pila1.estaVacia());

        pila1.extraer();

        Pila<Integer> pila2 = new Pila();

        //pila2.añadir("caracola");

        /*A la segunda pila no se pueden añadir Strings
        * porque esta parametrizada a Integers*/
    }
}
