package GUI.ejsClase.ejsClase1.ej3;

import javax.swing.*;

public class Ventana extends JFrame {

    JButton bt;
    JLabel lb;
    JTextArea ta;
    JTextField tf;
    JPasswordField pf;

    public Ventana(String titulo, int locX, int locY, int sizeX, int sizeY){
        setVisible(true);
        setLocation(locX, locY);
        setSize(sizeX, sizeY);
        setTitle(titulo);
        setLayout(null);
    }

    public void creaBoton(String titulo, int locX, int locY, int sizeX, int sizeY){
        bt = new JButton();
        bt.setText(titulo);
        bt.setBounds(locX, locY, sizeX, sizeY);
        add(bt);

    }

    public void creaEtiqueta(String titulo, int locX, int locY, int sizeX, int sizeY){
        lb = new JLabel();
        lb.setText(titulo);
        lb.setBounds(locX, locY, sizeX, sizeY);
        add(lb);

    }

    public void creaAreaTexto(String titulo, int locX, int locY, int sizeX, int sizeY){
        ta = new JTextArea();
        ta.setText(titulo);
        ta.setBounds(locX, locY, sizeX, sizeY);
        add(ta);

    }

    public void creaCTexto(String titulo, int locX, int locY, int sizeX, int sizeY){
        tf = new JTextField();
        tf.setText(titulo);
        tf.setBounds(locX, locY, sizeX, sizeY);
        add(tf);

    }

    public void creaCPassword(String titulo, int locX, int locY, int sizeX, int sizeY){
        pf = new JPasswordField();
        pf.setText(titulo);
        pf.setBounds(locX, locY, sizeX, sizeY);
        add(pf);

    }
}
