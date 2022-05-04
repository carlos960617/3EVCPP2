package LinkedList.EjClase.treintayunodemarzo;

import static java.awt.AlphaComposite.XOR;

public class Password {


    private final int clave=67294358;
    protected int passEncriptada;

    public Password(int password, boolean encriptar){

        if(encriptar){
            passEncriptada = encriptarDesencriptar(password);
        }else{
            passEncriptada = password;
        }


    }



    public  int encriptarDesencriptar(int password){

       String passwordString = Integer.toString(password);
       String claveString = Integer.toString(clave);
       String result="";
       for(int i=0;i<passwordString.length();i++){
           if(passwordString.charAt(i) == claveString.charAt(i)){
               result += '0';
           }else{result += '1';}
       }

       int resultado = Integer.parseInt(result);

       return resultado;

    }

    public void guardarContraseña(){
        System.out.println("La constraseña se ha guardado como "+passEncriptada+" encriptada.");
    }

    public boolean iniciarSesion(int pw){
        int encript2 = encriptarDesencriptar(pw);

        if(encript2 == passEncriptada){
            System.out.println("Bienvenide");
            return true;
        }
        System.out.println("Error al iniciar sesion. Constraseña incorrecta.");
         return false;
    }

    /*public static void main(String[] args) {

        Password p1 = new Password(67294358);

        System.out.println(p1.passEncriptada);

        p1.guardarContraseña();
    }*/
}
