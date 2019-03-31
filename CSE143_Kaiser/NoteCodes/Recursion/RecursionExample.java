public class RecursionExample {
	
	public static void main(String[] args) {
		writeStars(5);
		System.out.println(repeatDigits(145));
	}

	public static void writeStars(int n) {
		if(n == 0) {
			System.out.println();
		} else {
			System.out.print("*");
			writeStars(n - 1);
		}
	}

	public static int repeatDigits(int n) {
		if(n < 10) {
			return 11 * n;
		} else {
		return(repeatDigits(n / 10) * 100 + repeatDigits(n % 10));
	}
	}
}