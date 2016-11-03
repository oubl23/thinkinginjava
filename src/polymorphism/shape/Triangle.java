package polymorphism.shape;

/**
 * Created by dabao on 2016/10/27.
 */
import static com.oubl23.util.Print.*;
public class Triangle extends Shape{
	@Override
	public void draw() {
		print("Triangle.draw()");
	}

	@Override
	public void erase() {
		print("Triangle.erase()");
	}
}
