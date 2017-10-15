package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if (text.equals("")){
			return 0;
		}
		if (text.contains("," && "\n")){
			string numArr[] = text.split("\n" && ",");
			return sum(numArr);
		}

		if (text.contains("\n")){
			string numArr[] = text.split("\n");
			return sum(numArr);
		}
		if (text.contains(",")){
			string numArr[] = text.split(",");
			return sum(numArr);
			}
		return toInt(text);
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
	private static boolean ifNegative(String text){

	}	

	}

}

