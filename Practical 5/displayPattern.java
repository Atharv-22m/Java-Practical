public class displayPattern{
	public static void main(String args[]){
		displayPattern pattern = new displayPattern();
		System.out.println("Pattern 1:");
		pattern.displayPattern1(3);
		System.out.println("Pattern 2:");
		pattern.displayPattern2(3);
		System.out.println("Pattern 3:");
		pattern.displayPattern3(3);
	}
	
	void displayPattern1(int size){
		for(int i = 1; i <= size; i++){
			for(int j = 1; j <= size-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++){
				System.out.print("+ ");
			}
			System.out.println("");
		}
		for(int i = size-1; i >= 1; i--){
			for(int j = size-i; j >= 1; j--){
				System.out.print(" ");
			}
			for(int k = i; k >= 1; k--){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	void displayPattern2(int size){
		for(int i = 1; i <= size; i++){
			for(int j = 1; j <= size-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= (2*i-1); k++){
				System.out.print("+");
			}
			System.out.println("");
		}
		for(int i = size-1; i >= 1; i--){
			for(int j = size-i; j >= 1; j--){
				System.out.print(" ");
			}
			for(int k = (2*i-1); k >= 1; k--){
				System.out.print("+");
			}
			System.out.println("");
		}
	}

	void displayPattern3(int size){
		for(int i = 1; i <= size; i++){
			for(int j = 1; j <= size-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= (2*i-1); k++){
				if(i%2 == 0){
					if(k%2 == 1){
						System.out.print("+");
					}
					else{
						System.out.print("*");
					}
				}
				else{
					if(k%2 == 1){
						System.out.print("*");
					}
					else{
						System.out.print("+");
					}
				}
			}
			System.out.println("");
		}
		for(int i = size; i >= 1; i--){
			for(int j = size-i; j >= 1; j--){
				System.out.print(" ");
			}
			for(int k = (2*i-1); k >= 1; k--){
				if(i%2 == 0){
					if(k%2 == 1){
						System.out.print("*");
					}
					else{
						System.out.print("+");
					}
				}
				else{
					if(k%2 == 1){
						System.out.print("+");
					}
					else{
						System.out.print("*");
					}
				}
			}
			System.out.println("");
		}
	}
}

