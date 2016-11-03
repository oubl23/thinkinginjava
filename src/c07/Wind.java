package c07;

/**
 * Created by dabao on 2016/10/26.
 */

class Instrument {
	public void play(){}
	static void tune(Instrument i){
		i.play();
	}
}

public class Wind extends Instrument {
	public static void main(String[] args){
		Wind flute = new Wind();
		//Instrument tune方法接受Wind对象，这就称为向上转型 Wind转化为Onstrument
		// 专用类型向通用类型的转化，很安全
		Instrument.tune(flute);
	}
}
