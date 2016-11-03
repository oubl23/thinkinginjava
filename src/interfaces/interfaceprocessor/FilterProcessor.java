package interfaces.interfaceprocessor;

import interfaces.filter.Filter;
import interfaces.filter.HighPass;
import interfaces.filter.LowPass;
import interfaces.filter.Wavefrom;

/**
 * Created by dabao on 2016/10/29.
 */
class FilterAdapter implements Processor {
	Filter filter;

	public FilterAdapter(Filter filter)
	{
		this.filter = filter;
	}
	@Override
	public String name() {
		return filter.name();
	}

	public Wavefrom process(Object input) {
		return filter.process((Wavefrom)input);
	}
}

public class FilterProcessor{
	public static void main(String[] args){
		new Wavefrom();
		Wavefrom w = new Wavefrom();
		Apply.process(new FilterAdapter(new HighPass(1.0)), w);
		Apply.process(new FilterAdapter(new LowPass(2.0)), w);
	}
}
