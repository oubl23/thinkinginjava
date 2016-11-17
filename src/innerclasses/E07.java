package innerclasses;

/**
 * Created by gm925 on 2016/11/17.
 * 内部类传递外部类的私有的权限
 */
public class E07 {
    private int i =0;
    private void f(){
        System.out.println("E07");
    }
    class Inner{
        void g(){
            i++;
            f();
        }
    }
    public void h(){
        Inner in = new Inner();
        in.g();
        System.out.println(i);
    }

    public static void main(String[] args) {
        E07 e = new E07();
        e.h();
    }
}
