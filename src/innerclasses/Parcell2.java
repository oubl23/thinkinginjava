package innerclasses;

/**
 * Created by gm925 on 2016/11/3.
 */
public class Parcell2 {
    class Contests{
        private int i= 11;
        public int value(){return i;}
    }
    static class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public Destination to(String s){
        return new Destination(s);
    }
    public Contests contests(){
        return new Contests();
    }
    public void ship(String dest){
        Contests c = contests();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcell2 p = new Parcell2();
        p.ship("tasmania");

        Parcell2 q = new Parcell2();
        Parcell2.Contests c = q.contests();
        Parcell2.Destination d= q.to("borneo");
        Parcell2.Destination d2 = new Destination("he");
    }
}
