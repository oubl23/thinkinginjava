package interfaces.interfaceprocessor;

/**
 * Created by dabao on 2016/10/29.
 */
public class Apply {
	public static void process(Processor p, Object s)
	{
		System.out.println("Using Processor" + p.name());
		System.out.println(p.process(s));
	}
}
