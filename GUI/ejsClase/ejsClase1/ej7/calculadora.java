package GUI.ejsClase.ejsClase1.ej7;

import javax.swing.*;
import java.awt.*;

public class calculadora extends JFrame {

    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7,
            jb8, jb9, jb10, jb11, jb12, jb13, jb14, jb15;


    public calculadora(String titulo, int locX, int locY, int sizeX, int sizeY){
        super(titulo);
        setBounds(0,0,300,500);
        GridLayout GL = new GridLayout(5, 3, 2,2);
        setLayout(GL);

        jb1 = new JButton("1");
        jb2 = new JButton("2");
        jb3 = new JButton("3");
        jb4 = new JButton("4");
        jb5 = new JButton("5");
        jb6 = new JButton("6");
        jb7 = new JButton("7");
        jb8 = new JButton("8");
        jb9 = new JButton("9");
        jb10 = new JButton("+");
        jb11 = new JButton("0");
        jb12 = new JButton("-");
        jb13 = new JButton("*");
        jb14 = new JButton("/");
        jb15 = new JButton("=");

        setVisible(true);

        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jb5);
        add(jb6);
        add(jb7);
        add(jb8);
        add(jb9);
        add(jb10);
        add(jb11);
        add(jb12);
        add(jb13);
        add(jb14);
        add(jb15);
    }

    public static void main(String[] args) {

        calculadora calc = new calculadora("calculadora", 0,0,300,500);

    }
}
