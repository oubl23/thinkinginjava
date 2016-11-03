package polymorphism.music;

/**
 * Created by dabao on 2016/10/27.
 */
public class Music {
	public static void tune(Instrument i)
	{i.play(Note.MIDDLE_C);}

	public static void main(String[] args){
		Wind flute = new Wind();
		tune(flute);
	}
}
