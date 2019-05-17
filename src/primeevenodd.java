
public class primeevenodd {
	public static String primebuzz(int num) {
		String answer = num + "";
		if (isPrime(num)) {
			answer = "PRIME";
		} else if (num % 2 == 0) {
			answer = "EVEN";
		} else {
			answer = "ODD";
		}

		return answer;
	}

	public static boolean isPrime(int num) {
		// boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
