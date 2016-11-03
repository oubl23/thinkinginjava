package c07;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by dabao on 2016/10/26.
 */
class Villaion {
	private String name;
	protected void set(String nm) { name = nm;}
	public Villaion (String name) { this.name = name;}
	public String toString() {
		return "i'an Villain and my name is " + name;
	}
}

public class Orc extends Villaion {
	private int orcNumber;
	public Orc(String name, int orcNumber){
		super(name);
		this.orcNumber = orcNumber;
	}

	public void change(String name, int orcNumber){
		set(name);
		this.orcNumber = orcNumber;
	}

	public String toString() {
		return "Orc" + orcNumber + "：" + super.toString();
	}

	public static void main(String[] args){
		Orc orc = new Orc("dabao" , 21);
		System.out.println(orc);
		orc.change("oubl23", 22);
		System.out.println(orc);
	}
}
