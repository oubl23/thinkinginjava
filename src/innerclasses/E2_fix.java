package innerclasses;

class Outer2{
    private String data;
    class Inner{
        public String toString(){
            return data;
        }
    }

    Outer2(String data){
        this.data = data;
    }

    Inner inner(){
        return new Inner();
    }
}

public class E2_fix{
    public static void main(String[] args)
    {
        Outer2 o = new Outer2("Inner access Outer");
        Outer2.Inner i = o.inner();

        System.out.println(i);
    }
}
