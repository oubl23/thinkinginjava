package polymorphism;

/**
 * Created by dabao on 2016/10/27.
 */
class Derived2{
	private void f(){
		System.out.println("private f()");
	}

	public void getf(){
		f();
	}
}
class Override extends Derived2{
	public void f(){
		System.out.println("public f()");
	}
}
public class PrivateOreride2 {
	public static void main(String[] args){
		Derived2 D = new Override();
		D.getf();
	}
}
