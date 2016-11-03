package polymorphism;

/**
 * Created by dabao on 2016/10/27.
 */
import static com.oubl23.util.Print.*;
class Meal{
	Meal(){ print("Meal()");}
}

class Bread{
	Bread(){
		print("bread()");
	}
}

class Cheese{
	Cheese() { print("Cheese()");}
}

class Lettuce{
	Lettuce() {
		print("Lettuce()");
	}
}

class Lunch extends Meal{
	Lunch(){
		print("Lunch()");
	}
}

class ProtableLunch extends Lunch{
	ProtableLunch(){
		print("PortableLunch()");
	}
}
public class Sandwich extends  ProtableLunch{
	private Bread b= new Bread();
		private Cheese c = new Cheese();
		private Lettuce l = new Lettuce();
	public Sandwich() {
		print("Sandwic()");
	}

	public static void main(String[] args){
		new Sandwich();

	}
}
