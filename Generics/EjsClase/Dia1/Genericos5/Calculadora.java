package Generics.EjsClase.Dia1.Genericos5;

public class Calculadora<T extends Number, U extends Number> {

    T valor1;
    U valor2;

    public Calculadora(T v1, U v2){
        valor1 = v1;
        valor2 = v2;
    }

     double sumar(){

        double suma = valor1.doubleValue() + valor2.doubleValue();

        return suma;
    }

    double restar(){

        double restar = valor1.doubleValue() - valor2.doubleValue();

        return restar;

    }

    double mulitplicar(){

        double multi = valor1.doubleValue() * valor2.doubleValue();

        return multi;

    }

    double dividir(){

        double division = valor1.doubleValue() / valor2.doubleValue();

        return division;

    }

    public static void main(String[] args) {

         Calculadora c1 = new Calculadora(5, 6.7);


        System.out.println("Suma: "+c1.sumar()+" Resta: "+c1.restar());

    }
}
