package GUI.ejsClase.ejsClase1.ej5;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {

    JButton b1, b2;
    JLabel jl, jl1, jl2;
    JTextField tf1, tf2;

    public login(String titulo, int locX, int locY, int sizeX, int sizeY){
        super(titulo);
        setBounds(locX, locY, sizeX, sizeY);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        BoxLayout bl = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        BoxLayout bl1 = new BoxLayout(panel1, BoxLayout.X_AXIS);
        BoxLayout bl2 = new BoxLayout(panel2, BoxLayout.X_AXIS);
        BoxLayout bl3 = new BoxLayout(panel3, BoxLayout.X_AXIS);
        setLayout(bl);
        setVisible(true);
        b1 = new JButton("Aceptar");
        b2 = new JButton("Cancelar");
        jl = new JLabel("Ventana de Login");
        jl1 = new JLabel("Usuario");
        jl2 = new JLabel("Password");
        tf1 = new JTextField();
        tf2 = new JTextField();
        add(jl);
        panel1.setLayout(bl1);
        panel2.setLayout(bl2);
        panel3.setLayout(bl3);
        panel1.add(jl1);
        panel1.add(tf1);
        panel2.add(jl2);
        panel2.add(tf2);
        panel3.add(b1);
        panel3.add(b2);
        add(panel1);
        add(panel2);
        add(panel3);
        pack();

    }

    public static void main(String[] args) {

        login v1 = new login("Ejercicio 5", 0,0,500, 300);

    }
}
