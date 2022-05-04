package GUI.ejsClase.ejsClase1.ej8;

import javax.swing.*;
import java.awt.*;

public class calcPRO extends JFrame {

    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7,
            jb8, jb9, jb10, jb11, jb12, jb13, jb14, jb15,
            jb16, jb17, jb18, jb19, jb20;

    JTextField tf;
    public calcPRO(String titulo, int locX, int locY, int sizeX, int sizeY){
        super(titulo);
        setBounds(locX, locY, sizeX, sizeY);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        GridLayout GL = new GridLayout(5, 4, 4,4);
        BoxLayout BL = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);

        setLayout(BL);
        p1.setLayout(GL);


        setVisible(true);

        jb1 = new JButton("Rtc");
        jb2 = new JButton("CE");
        jb3 = new JButton("CL");
        jb4 = new JButton("+/-");
        jb5 = new JButton("7");
        jb6 = new JButton("8");
        jb7 = new JButton("9");
        jb8 = new JButton("/");
        jb9 = new JButton("4");
        jb10 = new JButton("5");
        jb11 = new JButton("6");
        jb12 = new JButton("x");
        jb13 = new JButton("1");
        jb14 = new JButton("2");
        jb15 = new JButton("3");
        jb16 = new JButton("-");
        jb17 = new JButton("0");
        jb18 = new JButton(".");
        jb19 = new JButton("=");
        jb20 = new JButton("+");

        tf = new JTextField(20);


        p2.add(tf);
        add(p2);
        add(p1);

        p1.add(jb1);
        p1.add(jb2);
        p1.add(jb3);
        p1.add(jb4);
        p1.add(jb5);
        p1.add(jb6);
        p1.add(jb7);
        p1.add(jb8);
        p1.add(jb9);
        p1.add(jb10);
        p1.add(jb11);
        p1.add(jb12);
        p1.add(jb13);
        p1.add(jb14);
        p1.add(jb15);
        p1.add(jb16);
        p1.add(jb17);
        p1.add(jb18);
        p1.add(jb19);
        p1.add(jb20);

        pack();
    }

    public static void main(String[] args) {

        calcPRO cp1 = new calcPRO("Calculadora PRO", 0,0,500, 500);
    }
}
