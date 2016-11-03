package interfaces.music4;

/**
 * Created by dabao on 2016/10/29.
 */
import static com.oubl23.util.Print.*;
import polymorphism.music.Note;

abstract class Instrument{
	private int i;
	public abstract void play(Note n);
	public String what(){return "instrument";}
	public abstract void adjust();
}

class Wind extends Instrument{
	public void play(Note n){
		print("wind.play()" + n);
	}

	@Override
	public String what() {
		return "Wind";
	}

	@Override
	public void adjust() {

	}
}

class Stringed extends Instrument{
	@Override
	public void play(Note n) {
		print("Stringed.play() "+ n);
	}

	@Override
	public String what() {
		return "Stringed";
	}

	@Override
	public void adjust() {

	}
}

class Brass extends Wind{
	@Override
	public void play(Note n) {
		print("bass.play() " + n);
	}

	@Override
	public void adjust() {
		print("brass.adjust()");
	}
}

class Woodwind extends Wind{
	@Override
	public void play(Note n) {
		print("woodwind.play() " + n);
	}

	@Override
	public String what() {
		return "woodWind";
	}
}

public class Music4 {
	static void tunue(Instrument i){
		i.play(Note.MIDDLE_C);
	}

	static void tunueAll(Instrument[] e){
		for(Instrument i: e)
			tunue(i);
	}

	public static void main(String[] args){
		Instrument[] orchestra = {
				new Wind(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};

		tunueAll(orchestra);
	}
}
