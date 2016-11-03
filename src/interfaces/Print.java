package interfaces;

/**
 * Created by dabao on 2016/10/29.
 */
abstract class p{
	p(){
		print();
	}
	abstract void print();
}
class p2 extends p{
	private int i = 5;
	void print() {
		System.out.println("p2.i = " + this.i);
	}
}
public class Print {
	public  static void main(String[] args){
		p2 i = new p2();
		i.print();
	}
}
