package polymorphism.shape;

/**
 * Created by dabao on 2016/10/27.
 */
import static com.oubl23.util.Print.*;
public class Square extends Shape {
	public void draw(){
		print("Square.draw()");
	}

	public void erase() {
		print("Square.erase()");
	}
}
