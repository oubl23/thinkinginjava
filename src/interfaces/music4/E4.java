package interfaces.music4;

/**
 * Created by dabao on 2016/10/29.
 */
abstract class NoF{

}

class ENoF extends NoF{
	void f(){
		System.out.println("ENoF.f()");
	}
}

public class E4 {
	static void tune(NoF f){
		((ENoF)f).f();
	}
}
