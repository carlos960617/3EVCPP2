package LinkedList.viernes18;

public class cancion{

    public String titulo;
    public double duracion;

    public cancion(String t, double d){
        titulo = t;
        duracion = d;
    }

    public String getTitulo(){
        return titulo;
    }

    /*public void setTitulo(String t){
        titulo = t;
    }

    public void setDuracion(double d){
        duracion = d;
    }*/

    @Override
    public String toString(){

        return titulo+": "+duracion;
    }

    public int compareTo(cancion o) {

        return this.titulo.compareTo(o.titulo);
    }
}
