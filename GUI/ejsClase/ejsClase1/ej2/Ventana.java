package GUI.ejsClase.ejsClase1.ej2;

import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana(String titulo, int locX, int locY, int sizeX, int sizeY){
        setVisible(true);
        setLocation(locX, locY);
        setSize(sizeX, sizeY);
        setTitle(titulo);
    }

    public static void main(String[] args) {

        Ventana marco1 = new Ventana("Ventana1",0, 0, 500, 300);

    }
}
