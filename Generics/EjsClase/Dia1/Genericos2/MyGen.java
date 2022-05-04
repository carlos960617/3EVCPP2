package Generics.EjsClase.Dia1.Genericos2;

public class MyGen<T> {
    T var;

    void set(T var) {
        this.var = var;
    }

    T get() {
        return var;
    }
}
