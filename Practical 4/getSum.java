public class getSum{
	static int[] arr = {2, 5, 6, 10};
	public static void main(String args[]){
		System.out.println("Sum of array elements:");
		System.out.println("1.Using while loop: " + getSum1(arr));
		System.out.println("2.Without using any loop: " + getSum2(arr, 3));
	}
	
	static int getSum1(int[] numbers){
		int i = 0, result = 0;
		while(i < numbers.length){
			result = result + numbers[i];
			i++;
		}
	return result;
	}
	static int getSum2(int[] numbers, int lastindex){
		int result = 0;
		if(lastindex == 0){
			return numbers[lastindex];
		}
		else{
			result = numbers[lastindex] + getSum2(numbers, lastindex -1);
		}
	return result;
	}
}

