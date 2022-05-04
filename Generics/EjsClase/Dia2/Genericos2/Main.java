package Generics.EjsClase.Dia2.Genericos2;

public class Main {

    public static void main(String[] args) {

        PilaArray pila2 = new PilaArray(5);

        System.out.println(pila2);

        pila2.añadir(5);

        System.out.println(pila2);

        System.out.println(pila2.estaVacia());

        System.out.println(pila2.extraer());

        System.out.println(pila2);

        pila2.añadir(1);
        pila2.añadir(2);
        pila2.añadir(3);
        pila2.añadir(4);
        pila2.añadir(5);

        System.out.println(pila2);

        pila2.extraer();

        System.out.println(pila2);

        pila2.añadir(6);

        System.out.println(pila2);



    }
}
