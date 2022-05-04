package GUI.ejsClase.ejsClase1.ej4;

import javax.swing.*;
import java.awt.*;

public class ventana extends JFrame {

    JButton b1, b2;
    JTextField tf;
    JCheckBox cb;

    public ventana(String titulo, int locX, int locY, int sizeX, int sizeY){
        super(titulo);
        setBounds(locX, locY, sizeX, sizeY);
        FlowLayout fl = new FlowLayout(1, 15, 30);
        setLayout(fl);
        setVisible(true);
        b1 = new JButton("Boton 1");
        b2 = new JButton("Boton 2");
        tf = new JTextField("Campo de texto");
        cb = new JCheckBox("Porgrama completado con exito");
        add(cb);
        add(tf);
        add(b1);
        add(b2);

    }

    public static void main(String[] args) {

        ventana v1 = new ventana("Ventana Ej4", 0,0, 500, 300);


    }
}
