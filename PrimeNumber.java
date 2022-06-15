package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		
		// Declare an int Input and assign a value 13
		int primeNumber = 45;
		int numDivide = primeNumber/2;
		//System.out.println(numDivide);
		// Declare a boolean variable flag as false
		boolean flag = false;
				// Iterate from 2 to half of the input
for (int i = 2; i<=numDivide; i++) {
		
	// Divide the input with each for loop variable and check the remainder
	int remainder = primeNumber%i;
	// Set the flag as true when there is no remainder
	if(remainder == 0) {
		flag = true;
	}
	// break the iterator
	break;
}
//Check the flag (Provide a condition)
	if(flag == true) {
		// Print 'Not a Prime' when the condition doesn't match 
				System.out.println("Not a Prime");
	}else {
		
		// Print 'Prime' when the condition matches
				System.out.println("Prime");
	}				
	}
}
