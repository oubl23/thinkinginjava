package polymorphism;

/**
 * Created by dabao on 2016/10/27.
 */
import static com.oubl23.util.Print.*;
class Actor{
	public void act(){

	}
}

class HappyActor extends Actor{
	public void act(){print("happActor");}
}

class SadActor extends Actor{
	public void act() { print("sadActor");}
}

class Stage{
	private Actor actor = new HappyActor();
	public void change() { actor = new SadActor();}
	public void performPlay() { actor.act();}
}

public class Transmogrify {
	public static void main(String[] args){
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}

}
