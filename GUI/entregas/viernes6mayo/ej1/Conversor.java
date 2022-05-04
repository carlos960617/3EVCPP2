package GUI.entregas.viernes6mayo.ej1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversor extends JFrame implements ActionListener {

    JLabel jl1, jl2, jl3;
    JTextField tf1;
    JButton jb1, jb2;

    public Conversor (String titulo, int locX, int locY, int sizeX, int sizeY){
        super(titulo);
        setBounds(locX, locY, sizeX, sizeY);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        FlowLayout fl = new FlowLayout();
        BoxLayout bl1 = new BoxLayout(p1, BoxLayout.Y_AXIS);
        BoxLayout bl2 = new BoxLayout(p2, BoxLayout.Y_AXIS);

        setLayout(fl);
        p1.setLayout(bl1);
        p2.setLayout(bl2);

        jl1 = new JLabel("Numero");
        jl2 = new JLabel("Aqui viene el binario");
        jl3 = new JLabel("Aqui viene el hexadecimal");

        jb1 = new JButton("Binario");
        jb2 = new JButton("Hexadecimal");

        tf1 = new JTextField(5);

        p1.add(jl1);
        p1.add(tf1);
        p1.add(jb1);
        p1.add(jl2);

        p2.add(jb2);
        p2.add(jl3);

        add(p1);
        add(p2);

        setVisible(true);
        pack();

        jb1.addActionListener(this);
        jb2.addActionListener(this);
    }

    public static void main(String[] args) {

        Conversor c1 = new Conversor("Conversor B-H-D", 0,0,500,300);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
