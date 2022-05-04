package GUI.ejsClase.ejsClase1.ej6;

import javax.swing.*;
import java.awt.*;

public class ventana6 extends JFrame {

    JButton jb1, jb2, jb3, jb4, jb5, jb6;

    public ventana6(String titulo, int locX, int locY, int sizeX, int sizeY){
        super(titulo);
        setBounds(locX, locY, sizeX, sizeY);
        BorderLayout bl = new BorderLayout();
        BorderLayout bl1 = new BorderLayout();
        JPanel p56 = new JPanel();
        setLayout(bl);
        jb1 = new JButton("Boton1");
        jb2 = new JButton("Boton2");
        jb3 = new JButton("Boton3");
        jb4 = new JButton("Boton4");
        jb5 = new JButton("Boton5");
        jb6 = new JButton("Boton6");
        p56.add(jb5);
        p56.add(jb6);
        add(jb1, BorderLayout.NORTH);
        add(jb2, BorderLayout.SOUTH);
        add(jb3, BorderLayout.WEST);
        add(jb4, BorderLayout.EAST);
        add(p56, BorderLayout.CENTER);
        setVisible(true);


    }

    public static void main(String[] args) {

        ventana6 v6 = new ventana6("ventana6", 0,0,500,300);

    }
}
