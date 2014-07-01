import java.util.Scanner;

public class FibonacciAssignment {
	public static void main(String[] args) {
		System.out.println("Give a number: ");

		Scanner input = new Scanner(System.in);
		int request = input.nextInt();


		CreateFibonacci nthTerm = new CreateFibonacci();
		int[] fibonacci = nthTerm.CalculateFibonacci(request);
		System.out.println("The value of the " + request
				+ "th term of the Fibonacci sequence is "
				+ fibonacci[request - 1]);
		
		EvenNumbers fibonacciSum = new EvenNumbers();
		int sumEvenFibonacciNumbers = fibonacciSum.CalculateSumEvenNumbers(fibonacci, request);
		System.out.println("The sum of all even values of the first " + request + " terms is " + sumEvenFibonacciNumbers);
	}
}
