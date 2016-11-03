package polymorphism;

import java.lang.*;

/**
 * Created by dabao on 2016/10/27.
 */
class Super{
	public int field =0;
	public int getField(){ return field; }
}

class Sub extends Super{
	public int field = 1;

	public int getField() {
		return field;
	}

	public int getSuperField(){
		return super.field;
	}
}
public class FieldAccess {
	public static void main(String[] args){
		Super sup = new Sub();
		System.out.println("field = " + sup.field + ", getField =" + sup.getField());
		Sub sub = new Sub();
		System.out.println("field = " + sub.field + ", getField =" + sub.getField()
		+ ", getsuperfield = " + sub.getSuperField() );
	}
}
