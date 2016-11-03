package polymorphism.music3;

/**
 * Created by dabao on 2016/10/27.
 */
import polymorphism.music.Note;
import static com.oubl23.util.Print.*;

class Instrument{
	void play(Note n){ print("Instrument.play() " + n);}
	String what() { return "Instrument";}
	void adjust() { print("Adjusting Instrument");}
}

class Wind extends Instrument{
	@Override
	void play(Note n) {
		print("Wind.play" + n);
	}

	@Override
	void adjust() {
		print("adjust Wind");
	}

	@Override
	String what() {
		return "WInd";
	}
}


public class Music3 {
	public static void tune(Instrument i)
	{
		i.play(Note.MIDDLE_C);
	}

	public static  void tuneAll(Instrument[] e)
	{
		for(Instrument ins:e)
			tune(ins);
	}

	public static void main(String[] args){
		Instrument[] ind = {
				new Wind(),
				new Instrument(),
				new Wind(),
				new Wind()
		};

		tuneAll(ind);

	}
}
