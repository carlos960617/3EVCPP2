package LinkedList.EjClase.treintayunodemarzo;

public class PasswordAmpliada extends Password {


    public PasswordAmpliada(int contraseña){
        super(contraseña, false);
    }

    @Override
    public void guardarContraseña(){
        System.out.println("La constraseña se ha guardado como "+passEncriptada+" sin encriptar.");
    }

    @Override
    public boolean iniciarSesion(int pw){

        if(pw == passEncriptada){
            System.out.println("Bienvenide");
            return true;
        }
        System.out.println("Error al iniciar sesion. Constraseña incorrecta.");
        return false;
    }
}
