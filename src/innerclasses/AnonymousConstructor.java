package innerclasses;

/**
 * Created by gm925 on 2016/11/17.
 */
abstract class Base{
    public Base(int i)
    {
        System.out.println("base constructor, i = " + i );
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase (int i){
        return new Base(i) { //i在匿名类中没有被直接使用所以不用是final
            {
                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        AnonymousConstructor a = new AnonymousConstructor();
        Base b = a.getBase(10);
        b.f();
    }
}
