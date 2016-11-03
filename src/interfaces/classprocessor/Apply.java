package interfaces.classprocessor;

import java.util.Arrays;
import static com.oubl23.util.Print.*;

/**
 * Created by dabao on 2016/10/29.
 */
class Processor{
	public String name(){
		return getClass().getSimpleName();
	}

	Object process(Object input) { return input;}
}

class Upcase extends Processor
{

	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}

class Spiltter extends Processor{
	String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}

public class Apply{
	public static void process(Processor p, Object s){
		print("Using Process" + p.name());
		print(p.process(s));
	}

	public static String s=
	"hello, how are you what is your name";

	public static void main(String[] args){
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new Spiltter(),s);
	}
}

