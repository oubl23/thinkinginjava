package interfaces.filter;

/**
 * Created by dabao on 2016/10/29.
 */
public class Wavefrom {
	private static long  Counter = 2;
	private final long id = Counter++;
	public String toString(){
		return "Wavefrom" + id;
	}
}
