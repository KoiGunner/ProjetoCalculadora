public class Calculadora {
	public static void sum(double a, double b) {
		System.out.println("Result of sum: " + (a + b));
	}
	public static void reduce(double a, double b) {
		System.out.print("Result of subtract: " + (a - b));
	}
	public static void multiply(double a, double b) {
		System.out.println("Result of multiply: " + a * b);
	}
	public static void divide(double a, double b) {
		if(b <= 0) {
			throw new ArithmeticException("");
		} else {
			System.out.println("Result of division: " + a / b);
		}
	}
	

}
