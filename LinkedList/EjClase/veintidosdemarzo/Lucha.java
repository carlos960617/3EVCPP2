package LinkedList.EjClase.veintidosdemarzo;

public class Lucha {

    static public int dañoArma(String arma){

        switch(arma){
            case "Espada":
                return 5;

            case "Maza":
                return 15;

            case "Pistola":
                return 55;

            case "Trueno":
                return 200;
            default:
                return 1;
        }
    }




    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Rainbow-Man", 35, 4);
        Monstruo jugador2 = new Monstruo("Caquita", 26, 4);

        while(jugador1.getVida() > 0 && jugador2.getVida() > 0){

            System.out.println();

        }

    }
}
