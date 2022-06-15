package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int num_1 = 0;
		int num_2 = 1;
		System.out.println("FibonacciSeries is ");
		System.out.println(num_1);	
		System.out.println(num_2);
		for(int i=1; i<7; i++) {
			int num_sum =num_1+num_2;
			num_1=num_2;
			num_2=num_sum;
			System.out.println(num_sum);	

		}	
	}

}