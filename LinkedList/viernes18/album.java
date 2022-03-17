package LinkedList.viernes18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class album {

    public String nombre;
    public String artista;
    public ArrayList<cancion> canciones;

    public album(String nombre, String artista){
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new ArrayList<cancion>();
    }

    public boolean addSong(String titulo, double duracion){
        if(findSong(titulo) == null){
            cancion c1 = new cancion(titulo, duracion);
            canciones.add(c1);
            return true;
        }
        System.out.println("La cancion ya está en el album");
        return false;

    }

    protected cancion findSong(String titulo){

        for(cancion x: canciones){
            if(x.getTitulo().equals(titulo)){
                return x;
            }
        }
        return null;
    }

    /*  Si pista es un atributo de cancion
    public boolean addToPlayList(int pista, LinkedList<cancion> lista){

        for(cancion x:canciones){
            if(x.getPista == pista){
                lista.add(x);
                return true;
            }
        }
        return false;
    }*/
    public boolean addToPlayList(int pista, LinkedList<cancion> lista){

        cancion c1 = canciones.get(pista-1);
        if(c1 == null){
            System.out.println("No hay canciones con ese numero de pista");
            return false;
        }

        ListIterator<cancion> it = lista.listIterator();
        while(it.hasNext()){
            int comp = it.next().compareTo(c1);
            if(comp == 0 ){
                System.out.println("La cancion ya estaba en la lista");
                return false;
            }else if(comp > 0){
                it.previous();
                it.add(c1);
                return true;
            }
        }
        lista.add(c1);
        System.out.println("Añadida cancion alfabeticamente con numero de pista "+pista);
        return true;


    }

    /*SIN ORDENAR ALFABETICAMENTE
    //Si pista se refiere a que haya una cancion en ese indice del ArrayList
    public boolean addToPlayList(int pista, LinkedList<cancion> lista){

        cancion c1 = canciones.get(pista-1);
        if(c1 == null){
            System.out.println("No hay canciones con ese numero de pista");
            return false;
        }
        lista.add(c1);
        System.out.println("Añadida cancion alfabeticamente con numero de pista "+pista);
        return true;


    }*/

    public boolean addToPlayList( String titulo, LinkedList<cancion> lista){

        cancion value = findSong(titulo);

        if(value == null){
            System.out.println("Esta canción no está en el album");
            return false;
        }

        ListIterator<cancion> it= lista.listIterator();
        while(it.hasNext()){
            int comp = it.next().compareTo(value);
            if(comp == 0 ){
                System.out.println("La cancion ya estaba en la lista");
                return false;
            }else if(comp > 0){
                it.previous();
                it.add(value);
                return true;
            }

        }

        System.out.println("Cancion añadida por titulo alfabeticamente satisfactoriamente");
        lista.add(value);
        return true;
    }


    /*SIN ORDENAR ALFABETICAMENTE
    public boolean addToPlayList( String titulo, LinkedList<cancion> lista){


        cancion value = findSong(titulo);

        if(value == null){
            System.out.println("Esta canción no está en el album");
            return false;
        }

        System.out.println("Cancion añadida por titulo satisfactoriamente");
        lista.add(value);
        return true;
        /*Sin usar metodo findSong
        for(cancion x:canciones){
            if(x.getTitulo().equals(titulo)){
                lista.add(x);
                return true;
            }
        }
        return false;*/
}
