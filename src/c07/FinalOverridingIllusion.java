package c07;

/**
 * Created by dabao on 2016/10/26.
 * {CompileTimeError}
 */
import static com.oubl23.util.Print.*;

class withFinals{
	private final void f() { print("withFinals.f()");}
	private void g() { print("withFinals.g()");}
}
class OvrridingPrivate extends withFinals{
	private final void f(){
		print("OverrdingPrivate.f()");
	}
	private void g(){
		print("overrdingPrivate.g()");
	}
}

class OvrridingPrivate2 extends OvrridingPrivate{
	final void f(){ // 基本类型中的只是同名而已，这里的操作并不是覆盖它
		print("OverrdingPrivate2.f()");
	}

	public void g() {
		print("overrdingPrivate2.g()");
	}
}
public class FinalOverridingIllusion extends OvrridingPrivate2 {
	//void f(){ }//并不能覆盖

	public static void main(String[] args){
		OvrridingPrivate2 o = new OvrridingPrivate2();
		o.f();
		o.g();
		OvrridingPrivate  op = o;
		//op.f();
		//op.g();

		withFinals wf = o;
		//wf.f();
		//wf.g();
	}
}
