package polymorphism;

import java.lang.*;
import java.lang.Override;

/**
 * Created by dabao on 2016/10/27.
 */
class StaticSuper{
	public static String staticget(){
		return "base staticGet()";
	}
	public String dynamicGet(){
		return "base dynamicGet()";
	}
}

class StaticSub extends StaticSuper{
	public static String staticget(){
		return "Derived staticGet()";
	}

	@Override
	public String dynamicGet() {
		return "Dervied dynamicGet()";
	}
}
public class StaticPloymorphish {
	public static void main(String[] args)
	{
		StaticSuper sup = new StaticSub();
		System.out.println(sup.staticget());
		System.out.println(sup.dynamicGet());
	}

}

