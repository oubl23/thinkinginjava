package interfaces.interfaceprocessor;

/**
 * Created by dabao on 2016/10/29.
 */
public interface Processor {
	String name();
	Object process(Object input);
}
