package Generics.EjsClase;

public class Genericos {

    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(28);

        iOb.mostrarTipo();

        int v= iOb.getOb();
        System.out.println("Valor: "+v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Prueba de genéricos");

        strOb.mostrarTipo();

        String str=strOb.getOb();
        System.out.println("Valor: "+str);
    }
}
