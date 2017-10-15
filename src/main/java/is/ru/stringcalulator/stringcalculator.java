package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if (text.equals("")){
			return 0;
		}
		else 
		{
			if text.contains(","){
				string numArr[] = text.split(",");
				return sum(numArr);
			}
		}

		return 1;
	}
}