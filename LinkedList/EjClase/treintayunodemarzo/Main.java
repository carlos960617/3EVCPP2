package LinkedList.EjClase.treintayunodemarzo;

public class Main {

    public static void main(String[] args) {

        int p3 = 77765678;

        Password check1 = new Password(p3, true);

        check1.guardarContraseña();

        check1.iniciarSesion(56554345);

        check1.iniciarSesion(32123456);

        check1.iniciarSesion(77765678);


        // con contraseña sin  encriptar

        int p4 = 66567898;

        PasswordAmpliada check2 = new PasswordAmpliada((p4));

        check2.guardarContraseña();

        check2.iniciarSesion(22123323);

        check2.iniciarSesion(66787676);

        check2.iniciarSesion(66567898);


        /*1. He creado como atributo final la CLAVE ya que siempre
        * se utiliza la misma para encriptar la contraseña
        *
        * 2. No, porque los métodos que utilizan las claves encriptadas
        * deben ser sobreescritos para operar sin encriptar*/

    }
}
