
public class Utility {

	public static void main(String[] args) {
		
		
		double sum = Calculator.add(5, 8);
		System.out.println("Sum :" + sum);
		
		double division = Calculator.division(8, 3);
		
		System.out.println("Division : " + division);
		
		double multiplication = Calculator.multiply(23, 4.5);
		
		System.out.println("Multiplication : " + multiplication);
		
		double substraction = Calculator.subtract(59, 9);
		
		System.out.println("Substration : " + substraction);

		double squaroot = Calculator.squaroot(16);
		
		System.out.println("Square Root : " + squaroot);
		
		System.out.println("Percentage: " + Calculator.percentage(40));
	}

}
