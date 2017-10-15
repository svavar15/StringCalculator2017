package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if (text.equals("")){
			return 0;
		}
		else if text.contains(","){
				string numArr[] = text.split(",");
				return sum(numArr);
			}
		}
		else if text.contains(""){

		}

		return 1;
	}
	private static String[] splitNewLine(string text){
		return text.split("\n");
	}
}

