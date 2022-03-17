package LinkedList.viernes18;

import java.util.*;

public class Main {

    public static boolean avanzando =  true;

    static Scanner sc = new Scanner(System.in);


    public static void printPlaylist(LinkedList<cancion> lista){

        Iterator it = lista.iterator();

        System.out.println("Canciones en lista de reproduccion:");

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void navMenu(){

        System.out.println("""
                0.- Salir de la lista de reproducción
                1.- Reproducir siguiente canción en la lista
                2.- Reproducir la canción previa de la lista
                3.- Repetir la canción actual
                4.- Imprimir la lista de canciones en la playlist
                5.- Volver a imprimir el menú.
                6.- Elimina cancion actual
                """);
    }

    public static void play(LinkedList<cancion> lista){

        System.out.println("Elige una opcion del menu");
        int opcion = sc.nextInt();
        ListIterator<cancion> it = lista.listIterator();
        if(lista.isEmpty()){
            System.out.println("No hay canciones para reproducir");
            return;
        }
        /*else if(opcion == 0){
            System.out.println("Reproduciendo primera cancion: "+it.next());
            navMenu();
            avanzando = true;
        }*/
        while(opcion != 0){

            switch(opcion){
                case 0:
                    System.out.println("Cerrando lista de reproducción...");
                    break;
                case 1:
                    if(!avanzando) {
                        if (it.hasNext()) {
                            it.next();
                            avanzando = true;
                            if(it.hasNext()){
                                System.out.println("Reproduciendo: " + it.next());
                            }else{
                                System.out.println("No hay mas canciones");
                            }
                         //esto nunca va a pasar porque si esta en previous todos los elementos tienen su propio next
                        } else {
                            System.out.println("No quedan mas canciones en la lista. Has llegado al final.");
                        }
                    }else{
                        if(it.hasNext()){
                            System.out.println("Reproduciendo: "+it.next());
                        }else{
                            System.out.println("Has llegado al final de la lista");
                        }
                    }
                    break;
                case 2:
                    if(avanzando){
                        if(it.hasPrevious()){
                            it.previous();
                            if(it.hasPrevious()){
                                System.out.println("Reproduciendo "+it.previous());
                                avanzando = false;
                            }else{
                                System.out.println("No hay mas canciones");
                            }

                        } else {
                            System.out.println("No hay mas canciones antes que esta.");
                        }
                    }else{
                        if(it.hasPrevious()){
                            System.out.println("Reproduciendo "+it.previous());
                        }else{
                            System.out.println("Estas en la primera cancion");
                        }
                    }
                    break;
                case 3:

                    if(!avanzando){
                        System.out.println("Volviendo a empezar misma cancion: "+it.next());
                        avanzando = true;
                    }else{
                        System.out.println("Volviendo a empezar misma cancion: "+it.previous());
                        avanzando = false;
                    }
                    break;
                case 4:

                    printPlaylist(lista);
                    break;
                case 5:

                    navMenu();
                    break;
                case 6:
                    System.out.println("Estas segura de que quieres borrar la cancion actual?");
                    boolean borrar = sc.nextBoolean();
                    if(borrar){
                        it.remove();
                            if(it.hasNext()){
                                System.out.println("Reproduciendo: "+it.next());
                                avanzando = true;
                            }else{
                            System.out.println("Reproduciendo: "+it.previous());
                            avanzando = false;
                            }

                    }else{
                        System.out.println("Por los pelos, la cancion no se ha borrado.");
                    }

            }
            System.out.println("Siguiente accion: ");

            opcion = sc.nextInt();
        }

        System.out.println("Fin de la reproduccion.");

    }

    public static void main(String[] args) {

        ArrayList<album> listaAlbumes = new ArrayList<album>();

        album album2 = new album("ANTI", "Rihanna");
        album album1 = new album("BSO Disney", "Varios Artistas");

        album1.addSong("Con la mirada celestial", 3.22);
        album1.addSong("Todos quieren ser ya gato jazz", 2.34);
        album1.addSong("No dire que es mi amor", 3.45);

        album2.addSong("Higher", 1.23);
        album2.addSong("Consideration", 2.41);
        album2.addSong("Needed Me", 3.12);

        listaAlbumes.add(album1);
        listaAlbumes.add(album2);

        LinkedList<cancion> playList = new LinkedList<>();

        album1.addToPlayList("No dire que es mi amor", playList);
        album2.addToPlayList("Needed Me", playList);
        album1.addToPlayList(1,playList);
        album2.addToPlayList(2,playList);

        System.out.println(playList);

        printPlaylist(playList);

        navMenu();

        play(playList);




    }



}
