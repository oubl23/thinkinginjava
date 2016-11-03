package c07;

/**
 * Created by dabao on 2016/10/26.
 */
class Poppet{
	private String i;
	Poppet(String i1) {i = i1; }

	public String toString() {return i;}
}
public class BlankFinal {
	private final int i = 0;
	private final int j ;
	private final Poppet p;
	//j = 1;//不能在除了定义处，构造函数外进行初始化
	BlankFinal(){
		j = 1;
		p = new Poppet("a");
	}
	BlankFinal (int i){
		j = i;
		p = new Poppet("a");
	}

	public String toString() {
		return "j = " + j + ", p = " + p;
	}

	public static void main(String[] args){
		BlankFinal f1 =new  BlankFinal();
		BlankFinal f2 =new  BlankFinal(5);
		System.out.println(f1);
		System.out.println(f2);
	}
}
