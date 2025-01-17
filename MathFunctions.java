public class MathFunctions {
	public static void multiTable(int a) {
		System.out.println("Multiplication table of " + a + ": ");
		for(int x = 0; x <= 10; x++) {
			int result = a * x;
			System.out.println(a + " x " + x + " = " + result);
		}
		
		
	}
	public static void potentiation(int a, int b) {
		int resultado = 1;
		System.out.println(a + " elevate to " + b + ":");
		for (int x = 1; x <= b; x++) {
			resultado *= b;
		}
		System.out.println("result: " + resultado);
	}
	
	public static void squareRoot(int a) {
		
		if (a < 0) {
			throw new ArithmeticException("Negative number can't be done");
		}
		for (int x = 1; x * x <= a; x++) {
			
			 if(x * x == a) {
				System.out.println("Raiz quadrada de " + a + " = " + x);
				return;
			}
		}
		System.out.println("Não foi possível encontrar uma raiz quadrada exata.");
	}
	
	public static void factorial(int a) {
		if (a < 0) {
			throw new ArithmeticException("Number is not to be negative");
		} else if (a == 0) {
			System.out.println("Factorial is: " + 1);
		} else {
			for(int x = a; x ==0; x--) {
				
			}
		}
	}
}
