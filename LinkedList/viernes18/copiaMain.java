package LinkedList.viernes18;

import java.util.*;

public class copiaMain {

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
        cancion elemento = null;
        while(opcion != 0){

            if(!avanzando) {
                it.next();
                avanzando = true;
            }


            switch(opcion){

                case 0:
                    System.out.println("Cerrando lista de reproducción...");
                    break;
                case 1:
                            if(it.hasNext()){
                                System.out.println("Reproduciendo: " + it.next());
                            }else{
                                System.out.println("No hay mas canciones");}
                    break;
                case 2:

                    it.previous();
                    avanzando = false;
                            if(it.hasPrevious()){
                                System.out.println("Reproduciendo "+it.previous());
                            }else{
                                System.out.println("Estas en la primera cancion");
                            }

                    break;
                case 3:

                        System.out.println("Volviendo a empezar misma cancion: "+it.previous());
                        avanzando = false;

                    break;
                case 4:

                    printPlaylist(lista);
                    break;
                case 5:

                    navMenu();
                    break;
                case 6:
                    System.out.println("Estas segura de que quieres borrar la cancion actual? (true = si, false = no)");
                    boolean borrar = sc.nextBoolean();
                    if(borrar){
                        it.remove();
                        if(it.hasNext()){
                            System.out.println("Reproduciendo: "+it.next());
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
