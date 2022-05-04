package GUI.ejsClase.ejsClase1.ej1;

import javax.swing.*;
import java.awt.*;

public class CrearVentana {



    public static void main(String[] args) {
        Frame marco1 = new Frame("Primera Ventana");

        JFrame marco2 = new JFrame("Primera Ventana");

        marco1.setSize(500, 300);

        marco2.setSize(500, 300);

        marco1.setVisible(true);

        marco2.setVisible(true);

        //Observo que el boton de cierre solo esta habilitado por defecto en Swing

    }
}
