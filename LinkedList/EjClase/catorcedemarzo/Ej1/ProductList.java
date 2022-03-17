package LinkedList.EjClase.catorcedemarzo.Ej1;

import java.util.ArrayList;

public class ProductList {

    private ArrayList<String> productList;

    public ProductList(ArrayList<String> pL){
        productList = pL;

    }

    public  void addProduct(String item){

        productList.add(item);
    }

    public void printProductList(){

        for(int i = 0; i<productList.size();i++){
            System.out.println(productList.get(i));

        }


        System.out.println("Numero de elementos:"+ productList.size());

    }

    public void modifyProductItem(int index, String item){

        productList.set(index, item);

    }

    public void removePorductItem(int index){

        productList.remove(index);
    }

    public boolean existsItem(String item){

        for(String x:productList){
            if(x.equals(item)){
                return true;
            }
        }

        return false;
    }

    public String findItem(String Item){
        for (String s : productList) {
            if (s.equals(Item)) {
                return s;
            }
        }

        return "El elemento no existe";
    }
}
