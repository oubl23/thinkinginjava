package interfaces.filter;

/**
 * Created by dabao on 2016/10/29.
 */
public class HighPass extends Filter {
	double cutoff;
	public HighPass(Double cutoff)
	{
		this.cutoff = cutoff;
	}

}
