package c07;

/**
 * Created by dabao on 2016/10/26.
 */
class SmallBrain{}
final class Dinosaur{
	int i = 7;
	int j = 1;
	SmallBrain x =new SmallBrain();
	void f() {}
}
//class Futher extends Dinosaur{} //final 类不能继承
public class Jurassic {
	public static void main(String[] args)
	{
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}
