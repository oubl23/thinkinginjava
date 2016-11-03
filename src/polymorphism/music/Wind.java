package polymorphism.music;

/**
 * Created by dabao on 2016/10/27.
 */
public class Wind extends Instrument {
	public void play(Note n)
	{
		System.out.println("Wind.play()" + n);
	}
}
