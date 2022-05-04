package Generics.EjsClase.Dia2.Genericos4;

public class Main {

    public static void main(String[] args) {

        Set<String> cadenaS = new Set();

        Set<Integer> cadenaI = new Set();

        boolean value1 = cadenaS.insert("H");
        boolean value2 = cadenaS.insert("Ho");
        boolean value3 = cadenaS.insert("Hol");
        boolean value4 = cadenaS.insert("Hola");
        boolean value5 = cadenaS.insert("Holo");
        boolean value6 = cadenaS.insert("Ole");
        boolean value7 = cadenaS.insert("Holo");
        boolean value8 = cadenaS.insert("la");
        boolean value9 = cadenaS.insert("olas");
        boolean value10 = cadenaS.insert("Alola");

        System.out.println(value1+" "+value2+" "+value3+" "+value4+" " +
                value5+" "+value6+" "+value7+" "+value8+" "+value9+" "+value10);

        boolean value11 = cadenaS.insert("Alola");

        System.out.println(value11);

        boolean eliminado = cadenaS.delete("olas");

        System.out.println(eliminado);

        System.out.println(cadenaS);

        System.out.println(cadenaS.find("Holo"));


        cadenaS.delete("Ole");

        System.out.println(cadenaS);

        System.out.println(cadenaS.find("Alola"));

        System.out.println(cadenaS.find("Alole"));
        //String[] arrayS =  cadenaS.getArray();
        /*for(String x: (String[])cadenaS.getArray()){
            System.out.println(x);
        }*/

        //cadenaI.insert("Baby");

        /*No se puede insertar porque cadenaI ya se ha parametrizado a tipos Integer*/

    }
}
