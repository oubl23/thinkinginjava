package innerclasses;

/**
 * Created by gm925 on 2016/11/3.
 */
public class Parcell {
    class Contests{
        private int i= 11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public void ship(String dest){
        Contests c = new Contests();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcell p = new Parcell();
        p.ship("tasmania");
    }
}
