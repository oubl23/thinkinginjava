package innerclasses;

/**
 * Created by gm925 on 2016/11/3.
 */
public class E1 {
    class Inner{
        void f(){
            System.out.println("hello");
        }
    }

    public  Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        E1 e = new E1();
        E1.Inner i = e.inner();
        i.f();
    }

}
