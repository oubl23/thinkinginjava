package polymorphism;

/**
 * Created by dabao on 2016/10/27.
 */
class Q{
	public void fun1(){
		fun2();
	}
	void fun2(){
		System.out.println("Q.fun2()");
	}
}

class Q2 extends Q{
	void fun2() {
		System.out.println("Q2.fun2()");
	}
}
public class Q3 {
	public static void main(String[] args){
		Q q = new Q2();
		q.fun1();
	}
}
