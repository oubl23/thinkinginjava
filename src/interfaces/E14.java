package interfaces;

/**
 * Created by dabao on 2016/10/29.
 */
interface I1{
	void f1();
	void f2();
}

interface I2{
	void f3();
	void f4();
}

interface I3{
	void f5();
	void f6();
}

interface combine extends I1,I2,I3{
	void f7();
}

class Con{
	String s;
	public Con(String s){
		this.s = s;
	}
}

class All extends Con implements combine{
	All(){
		super("All");
	}

	@Override
	public void f1() {
		
	}

	@Override
	public void f2() {

	}

	@Override
	public void f3() {

	}

	@Override
	public void f4() {

	}

	@Override
	public void f5() {

	}

	@Override
	public void f6() {

	}

	@Override
	public void f7() {

	}
}
public class E14 {
}
