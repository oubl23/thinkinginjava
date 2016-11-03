package polymorphism;

/**
 * Created by dabao on 2016/10/27.
 */
import static com.oubl23.util.Print.*;

class Derived extends PrivateOverride{
	public void f(){print("public f()");}
}

public class PrivateOverride {
	private void f(){
		print("private f()");
	}

	public static void main(String[] args){
		PrivateOverride po = new Derived();
		po.f();
	}
}


