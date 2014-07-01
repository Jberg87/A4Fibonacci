public class CreateFibonacci {

	public int[] CalculateFibonacci(int request) {
		int[] fibonacciSequence = new int[request];

		for (int i = 0; i < request; i++) {
			if (i == 0) {
				fibonacciSequence[i] = 1;
			} else if (i == 1) {
				fibonacciSequence[i] = 2;
			} else {
				fibonacciSequence[i] = fibonacciSequence[i - 2]
						+ fibonacciSequence[i - 1];
			}
		}
		return fibonacciSequence;
	}
}
