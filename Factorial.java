package week1.day1;

public class Factorial {
	public static void main(String[] args) {
		int numFactorial = 5;
		for(int i=4; i>0; i--) {
			numFactorial = numFactorial*i;
		}
		System.out.println("Factorial of 5 is "+ numFactorial);
	}
	
}
	