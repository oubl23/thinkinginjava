package c07;

/**
 * Created by dabao on 2016/10/26.
 */
class Homer{
	char doh(char c){
		System.out.println("doh(char)");
		return 'd';
	}
	float doh(float f){
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Mildhouse{}

class Bart extends Homer{
	void doh(Mildhouse M){
		System.out.println("doh(MildHouse)");
	}
}
class Lias extends Homer{
	//这个标签覆盖的时候无影响只有在重载的时候才有影响
	@Override char doh(char M){
		return M;
	}

}
public class Hide {
	public static void main(String[] args){
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Mildhouse());
	}
}
