package LinkedList.EjClase.catorcedemarzo.Ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String menu ="Elige la opcion "+"\n" +
                "0- Imprimir Menu"+"\n" +
                "1- Imprimir Productos"+"\n" +
                "2- Añador"+"\n" +
                "3- Modificar"+"\n" +
                "4- Eliminar"+"\n" +
                "5- Salir";

        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista1 = new ArrayList<>();

        lista1.add("Cascos");
        lista1.add("Albondigas");
        lista1.add("Ardilla frita");

        ProductList lista = new ProductList(lista1);

        System.out.println(menu);
        System.out.println("Elige una opcion");

        int opcion = sc.nextInt();

        while(opcion != 5){
            switch(opcion){

                case 0:
                    System.out.println("Imprimiendo menu...");
                    System.out.println(menu);
                    break;
                case 1:
                    System.out.println("Contenido Actual");
                    lista.printProductList();
                    break;
                case 2:
                    System.out.println("Introduce el elemento a añadir");
                    String elemento = sc.nextLine();
                    lista.addProduct(elemento);
                    break;
                case 3:
                    System.out.println("Inroduce el indice de elemento a sustituir");
                    int index= sc.nextInt();
                    System.out.println("Introduce el nuevo elemento");
                    String elem = sc.nextLine();
                    lista.modifyProductItem(index,elem);
                    break;
                case 4:
                    System.out.println("Introduce el indice del elemento a eliminar");
                    int inde= sc.nextInt();
                    lista.removePorductItem(inde);
                    break;
                default:
                    System.out.println("Elige un numero del 0 al 5");
                    opcion = sc.nextInt();

            }

            System.out.println("Introduce siguiente opcion:");
            opcion = sc.nextInt();
        }





    }
}
