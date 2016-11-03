package interfaces.music5;

/**
 * Created by dabao on 2016/10/29.
 */
import static com.oubl23.util.Print.*;

import com.sun.org.apache.bcel.internal.generic.INEG;
import polymorphism.music.Note;

interface Instrument{
	int VALUE = 5;// final static 接口中的数据默认定为这样的
	void play(Note n);
	void adjust();
}

class Wind implements Instrument{//所有的方法必需声明为public
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

class Brass extends Wind{ //其子类的覆盖方法也必需是public

	@Override
	public String toString() {
		return "Brass";
	}
}
public class Music5 {
	static void tune(Instrument i)
	{
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e)
	{
		for(Instrument i:e){
			tune(i);
		}
	}

	public static void main(String[] args)
	{
		Instrument[] obs ={
				new Wind(),
				new Brass()
		};

		tuneAll(obs);
	}
}
