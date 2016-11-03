package interfaces.filter;

/**
 * Created by dabao on 2016/10/29.
 */
public class Filter {
	public String name(){
		return getClass().getSimpleName();
	}
	public Wavefrom process(Wavefrom input){
		return input;
	}
}
