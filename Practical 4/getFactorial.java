public class getFactorial{
	static int input = 5;
	public static void main(String args[]){
		System.out.println("Factorial of "+input+":");
		System.out.println("1.Using for loop: " + getFactorial1(input));
		System.out.println("2.Using while loop: " + getFactorial2(input));
		System.out.println("3.Without using any loop: " + getFactorial3(input));
		System.out.println("4.Without using any loop & calling previoos functions: " + getFactorial4(input));
	}
	
	static int getFactorial1(int number){
		int result = 1;
		for(int i = number; i > 0; i--){
			result = result * i;
		}

	return result;
	}

	static int getFactorial2(int number){
		int result = 1;
		while(number > 0){
			result = result * number;
			number--;
		}
	return result;
	}
	
	static int getFactorial3(int number){
		int result;
		if(number == 1){
			return 1;
		}
		else{
			result = number * getFactorial3(number - 1);
		}
  	return result;
  	}

	static int getFactorial4(int number){
		int result = 1;
		if(number == 1){
			return 1;
		}
		else{
			if(number % 2 == 0){
			result = number * getFactorial1(number - 1);
			}
			else{
			result = number * getFactorial2(number - 1);
			}
		}	
	return result;
	}
}
