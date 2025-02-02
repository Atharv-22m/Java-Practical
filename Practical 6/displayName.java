public class displayName{
	public static void main(String args[]){
		displayName pattern = new displayName();
		pattern.displayPattern(3);
		
	}

	void displayPattern(int size){
		size = 2*size + 1;
		for(int ln = 1; ln <= size; ln++){
			String blankspaces = "";
			for(int spaces = 1; spaces <= size-ln; spaces++){
				blankspaces += " ";
			}
			System.out.print(blankspaces);
			if(ln == 1){
				System.out.print("*");
			}
			else if(ln == size/2 + 1){
				for(int stars = 1; stars <= ln-1; stars++){
					System.out.print("* ");
				}
				System.out.print("*");
			}
			else{
				System.out.print("*");
				for(int spaces = 1; spaces < 2*ln - 2; spaces++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.print(blankspaces);
			
		
			blankspaces = "";
			for(int spaces = 1; spaces < size; spaces++){
				blankspaces += " ";	
			}
			if(ln == 1){
				for(int stars = 1; stars < size; stars++){
					System.out.print("* ");
				}
				System.out.print("*");
			}
			else{
				System.out.print(blankspaces + "*" + blankspaces);
			}
			
			blankspaces = "";
			for(int spaces = 1; spaces < 2*size-2; spaces++){
				blankspaces += " ";
			}
			if(ln == size/2 +1){
				for(int stars = 1; stars < size; stars++){
					System.out.print("* ");
				}
				System.out.print("*");
			}
			else{
				System.out.print("*" + blankspaces + "*");
			}


			blankspaces = "";
			for(int spaces = 1; spaces <= size-ln; spaces++){
				blankspaces += " ";
			}
			System.out.print(blankspaces);
			if(ln == 1){
				System.out.print("*");
			}
			else if(ln == size/2 + 1){
				for(int stars = 1; stars <= ln-1; stars++){
					System.out.print("* ");
				}
				System.out.print("*");
			}
			else{
				System.out.print("*");
				for(int spaces = 1; spaces < 2*ln - 2; spaces++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.print(blankspaces);

			blankspaces = "";
			int mid = size/2 + 1;
			for(int spaces = 1; spaces < 2*size-2; spaces++){
				blankspaces += " ";
			}
			if(ln == mid || ln == 1){
				for(int stars = 1; stars < size; stars++){
					System.out.print("* ");
				}
				System.out.print("*");
			}
			else if(ln < mid){
				System.out.print("*" + blankspaces + "*");
			}
			else{
				System.out.print("*");
				for(int spaces = 1; spaces <= 3*(ln-mid) + ln-mid-1;spaces++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int spaces = 1; spaces <= 3*(size - ln) + size - ln;spaces++){
					System.out.print(" ");
				}
			}

			blankspaces = "";
			for(int spaces = 1; spaces < ln; spaces++){
				blankspaces += " ";
			}
			System.out.print(blankspaces);
			if(ln == size){
				System.out.print("*");
				System.out.print(blankspaces);
			}
			else{
				System.out.print("*");
				for(int spaces = 1; spaces < 2*(size-ln); spaces++){
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.print(blankspaces);
			}
			System.out.println("");
		}
	}
}