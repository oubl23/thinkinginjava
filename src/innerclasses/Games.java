package innerclasses;

/**
 * Created by gm925 on 2016/11/17.
 */
interface Game{ boolean  move();}
interface GameFacotry{ Game getGame();}

class Checkers implements Game{
    private Checkers() {}
    private int moves = 0;
    private static final int MOVES = 3;
    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
    public static GameFacotry facotry = new GameFacotry() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game{
    private Chess(){}
    private int moves = 0;
    private static final int MOVES = 4;
    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFacotry facotry = new GameFacotry() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}
public class Games {
    public static void playGame(GameFacotry fact){
        Game s = fact.getGame();
        while(s.move())
            ;
    }

    public static void main(String[] args) {
        playGame(Chess.facotry);
        playGame(Checkers.facotry);
    }
}
