package polymorphism.shape;

/**
 * Created by dabao on 2016/10/27.
 */
import static com.oubl23.util.Print.*;
public class Circle extends Shape {
	public void draw(){
		print("Circle.draw()");
	}

	public void erase(){
		print("Circle.erase()");
	}
}
