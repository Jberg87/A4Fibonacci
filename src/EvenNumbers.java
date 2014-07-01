
public class EvenNumbers {
	public int CalculateSumEvenNumbers(int[] fibonacci, int request) {
		int sumEvenNumbers = 0;
		for (int i = 0; i < request ; i++) {
			if (fibonacci[i]%2 == 0) {
				sumEvenNumbers = sumEvenNumbers + fibonacci[i];
			}
		}	
		return sumEvenNumbers;
	}
}
