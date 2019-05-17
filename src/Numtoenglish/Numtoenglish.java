package Numtoenglish;


public class Numtoenglish {


	public static String NumtoE(int num) {
		String english = "";

		if (num > 999) {
			int divideThous = num / 1000;
			english += onesNames[divideThous] + " thousand";
			num = num % (1000);
			if (num != 0) {
				english += " ";
			}
		}

		if (num > 99) {
			int dividehun = num / 100;
			english += onesNames[dividehun] + " hundred";
			num = num % (100);
			if(num!=0) {
				english += " and";
			}
		}

		if (num < 20) {
			english += onesNames[num];
		}
		if (num > 19) {
			int dividebyten = num / 10;
			english += tensNames[dividebyten];
			int modten = num % 10;
			if (modten != 0) {
				english += "-";
			}
			english += onesNames[modten];
		}
		return english + " dollars";
	}


	private static final String[] onesNames= {
			"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", " ten", " eleven", " twelve",
			" thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"
	};
	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

}
