package Generics.EjsClase.Dia1.Genericos2;

public class B<T extends A> {
    T process(T t){
        t.count();
        t.show();
        return t;
    }

}
