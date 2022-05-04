package GUI.ejsClase.ejsClase1.ej3;

public class ControlesSinEventos {

    public static void main(String[] args) {

        Ventana v1 = new Ventana("Vetana 1", 0,0, 500, 300);

        v1.creaBoton("Boton1", 150,150,200,100);

        v1.creaCPassword("Contraseña", 150, 50, 150, 50);

        v1.creaCTexto("Añde Texto", 150, 300, 140, 40);

        v1.creaAreaTexto("Area texto", 150, 400, 150, 50 );
    }
}
