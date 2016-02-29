package MainPackage;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	private static double initialTuition;
	private static double percentIncrease;
	private static double APR;
	private static int term;
	
	public static void main(String[] args) {
		tuition.input();
		double total = Calculate.calculate(initialTuition, percentIncrease, APR, term);
		System.out.printf("The total price to pay back will be %.2f", total);
		double monthly = Calculate.monthly(total, term);
		System.out.printf("The total due each month will be %.2f", monthly);

	}
	
	public static class tuition{
		
		public static void input() {
			System.out.println("Enter the initial price of tuition: ");
			initialTuition = scan.nextDouble();
			System.out.println("Enter the percentage increase for tuition: ");
			percentIncrease = scan.nextDouble();
			System.out.println("Enter the repayment APR: ");
			APR = scan.nextDouble();
			System.out.println("Enter the term for the loan: ");
			term = scan.nextInt();
		}

		
	}
	
		
}
