package interfaces.interfaceprocessor;

import java.util.Random;

/**
 * Created by dabao on 2016/10/30.
 */
public interface RandVals {
	Random RAND =  new Random(47);
	int RANDOM_INT = RAND.nextInt(10);
	long RANDOM_LONG = RAND.nextLong() * 10;
	float RANDOM_FLOAT = RAND.nextFloat() * 10;
	double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}
