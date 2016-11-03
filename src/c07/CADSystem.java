package c07;

/**
 * Created by dabao on 2016/10/25.
 */

import java.util.*;

class Shape{
	Shape(int i){
		System.out.println("Shap contructor");
	}
	void cleanup()
	{
		System.out.println("Shape cleanup");
	}
}

class Circle extends Shape{
	Circle(int i){
		super(i);
		System.out.println("Drawing a Circle");
	}

	void cleanup(){
		System.out.println("Erasing a Circle");
		super.cleanup();
	}
}

class Triangle extends Shape{
	Triangle(int i){
		super(i);
		System.out.println("Drawing a Triangle");
	}

	void cleanup(){
		System.out.println("Earsing a Triangle");
		super.cleanup();
	}
}

class Line extends Shape{
	private int start, end;
	Line(int start, int end){
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing a line:" + start + ", " +end);
	}

	void cleanup(){
		System.out.println("Earsing a line:" + start + ", " + end);
		super.cleanup();
	}
}


public class CADSystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] line = new Line[10];
	CADSystem(int i){
		super(i + 1);
		for(int j = 0 ; j < 10; j++)
			line[j] = new Line(j, j*j);
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Comebined Constructor");
	}

	void cleanup(){
		System.out.println("CADsystem.cleanup()");
		t.cleanup();
		c.cleanup();
		for(int i = line.length - 1; i >=0; i--)
			line[i].cleanup();
		super.cleanup();
	}

	public static void main(String[] args){
		CADSystem x =  new CADSystem(47);
		try
		{

		}finally {
			x.cleanup();
		}
	}
}
