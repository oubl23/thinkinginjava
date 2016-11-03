package interfaces.filter;

/**
 * Created by dabao on 2016/10/29.
 */
public class LowPass extends Filter{
	double cutoff;
	public LowPass(double cutoff){
		this.cutoff = cutoff;
	}
}
