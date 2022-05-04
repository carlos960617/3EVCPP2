package Generics.EjsClase.Dia1.Genericos2;

/*public class GenericTest {
    public static void main(String args[]){
        MyGen<String> m = new MyGen<String>();
        m.set("patri");
        System.out.println(m.get());
    }
}
public class GenericTest<T> {

    private T t;
    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: "+t.getClass().getName());
        System.out.println("U: "+u.getClass().getName());
    }

    public static void main(String args[]){
       GenericTest<Integer> integerBox = new GenericTest<Integer>();
       integerBox.set(10);
       integerBox.inspect(Integer.valueOf("12"));
    }*/

public class GenericTest{

    public static void main(String[] args) {
        B b = new B();
        C c =(C) b.process(new C());
        B<C> b2 = new B<C>();
        C c2 = b2.process(new C());
    }
}


