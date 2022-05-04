package Generics.EjsClase;

public class Gen<T>{
    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void mostrarTipo(){
        System.out.println("El tipo de T es: "+ob.getClass().getName());
    }
}
