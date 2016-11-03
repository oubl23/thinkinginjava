package interfaces.music6;

/**
 * Created by dabao on 2016/10/29.
 */

import polymorphism.music.Note;

import static com.oubl23.util.Print.print;

interface Instrument{
	//int VALUE = 5;// final static 接口中的数据默认定为这样的
	//void play(Note n);
	void adjust();
}

interface Playable{
	void play(Note n);
}

class Wind implements Instrument,Playable{//所有的方法必需声明为public
	@Override
	public void play(Note n) { //只能被声明为public
		print(this+ ".play() " + n);
	}
	public String toString(){
		return "Wind";
	}
	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass extends Wind { //其子类的覆盖方法也必需是public

	@Override
	public String toString() {
		return "Brass";
	}
}

public class Music6 {
	static void tune(Playable i)
	{
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e)
	{
		for(Playable i:e){
			tune(i);
		}
	}

	public static void main(String[] args)
	{
		Playable[] obs ={
				new Wind(),
				new Brass()
		};
		((Wind)obs[1]).adjust();
		tuneAll(obs);
	}
}
