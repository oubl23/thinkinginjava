package innerclasses;

import sun.security.krb5.internal.crypto.Des;

/**
 * Created by gm925 on 2016/11/17.
 */
public class Parcel11 {
    private static class ParcelContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination{
        private String label;
        private ParcelDestination(String whereto){
            label = whereto;
        }
        @Override
        public String readLabel() {
            return label;
        }

        public static void f(){}
        static int x = 10;
        static class AnotherLevel{
            public static void f(){}
            static int x = 10;
        }
    }

    private static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("h");
    }
}
