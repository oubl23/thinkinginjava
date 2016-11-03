package interfaces;

/**
 * Created by dabao on 2016/10/30.
 */
interface Cycle{
	int wheel();
}

interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	@Override
	public int wheel() {
		return 1;
	}
}

class UnicycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class Bicycle implements Cycle{
	@Override
	public int wheel() {
		return 2;
	}
}

class BicycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		return new Bicycle();
	}
}

public class E18 {
	public static  void ride(CycleFactory cf)
	{
		Cycle cy = cf.getCycle();
		System.out.println(cy.wheel());
	}

	public static void main(String[] args) {
		ride(new UnicycleFactory());
		ride(new BicycleFactory());
	}
}
