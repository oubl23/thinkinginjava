package polymorphism;

/**
 * Created by dabao on 2016/10/27.
 */
import java.lang.*;
import java.lang.Override;

import static com.oubl23.util.Print.*;
class Glyph{
	void draw(){
		print("Glyph.draw()");
	}
	Glyph(){
		print("brefore draw");
		draw();
		print("after draw");
	}
}

class RoundGlyph extends Glyph{
	private int radius = 1;
	RoundGlyph(int r)
	{
		radius = r;
		print("RoundGlyph.RpundGlyph, radius = " + radius);
	}

	@Override
	void draw() {
		print("roundGlyph.draw(), radius = " + radius);
	}
}
public class PolyConstructors {
	public static void main(String[] args)
	{
		new RoundGlyph(5);
	}

}
