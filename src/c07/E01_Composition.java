package c07;

/**
 * Created by dabao on 2016/10/25.
 * 这个问题考察惰性初始化（lazy initialization) 就是需要使用实例的时候才真正去初始化
 */

class Simple{
	String s;
	public Simple(String si ) { s = si; }
	public String toString() { return s ;}
	public void setString(String sNew) { s = sNew;}
}

class Second{
	Simple simple;
	String s;
	public Second(String si)
	{
		s = si;
	}

	public void check(){
		if(simple == null)
			System.out.println("not initialized! ");
		else
			System.out.println("initialized! ");
	}

	private Simple lazy(){
		if(simple == null)
		{
			System.out.println(" Create Simple");
			simple = new Simple(s);
		}
		return simple;
	}

	public Simple getSimple(){ return lazy(); }

	public String toString(){return lazy().toString();}

	public void setSimple(String sNew){
		lazy().setString(sNew);
	}

}

public class E01_Composition {
	public static void main(String[] args){
		Second second = new Second("init string");
		second.check();
		System.out.println(second.getSimple());
		second.check();
		System.out.println(second);
		second.setSimple("new string");
		System.out.println(second);
	}
}
