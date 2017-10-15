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
		}

	}

}

