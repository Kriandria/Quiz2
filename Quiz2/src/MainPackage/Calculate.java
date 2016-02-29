package MainPackage;

public class Calculate {

	public static double calculate(double initialTuition, double percentIncrease, double APR, double term ) {
		double total = 0;
		for (double i = 4; i > 0; i--) {
			double price = initialTuition;
			initialTuition *= (1+percentIncrease);
			total += price;
		}
		total = total * Math.pow((1+APR/12), (12*term));
		return total;
	}


	public static double monthly(double total, double term) {
		double monthly = total / (12 * term);
		return monthly;
	}
	
}