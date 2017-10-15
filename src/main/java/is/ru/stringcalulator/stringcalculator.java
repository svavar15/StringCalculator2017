package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if (text.equals("")){
			return 0;
		}
		if (text.contains("," && "\n")){
			string numArr[] = text.split("\n" && ",");
			check(numArr);
			return sum(numArr);
		}

		if (text.contains("\n")){
			string numArr[] = text.split("\n");
			check(numArr);
			return sum(numArr);
		}
		if (text.contains(",")){
			string numArr[] = text.split(",");
			check(numArr);
			return sum(numArr);
			}
		return toInt(text);
		}

	private static int sum (String [] text){
		int i = 0;
		int sum = 0;
		for (i;i < text.length;i++) {
			if(toInt(text[i]) <= 1000){
				sum += toInt(text[i]);
			}
		}
		return sum;
	}
	private static int toInt(String text){
		int number;
    	try {
            number = Integer.parseInt(text);
        } catch (NumberFormatException wrongInput) {
            throw new IllegalArgumentException("Input now allowed",wrongInput);
        }
    	return num;
	}
	private static void check(String Text){
		if(ifNegative(numArr) == true){
				System.out.println("“Negatives not allowed: ");
			}
	}

	private static boolean ifNegative(String text){
	}	
		if(toInt(text) < 0){
			return true;
		}
		return false;
	}

}

