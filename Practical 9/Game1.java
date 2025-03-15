import java.util.*;
import java.io.*;

class Game1{
    String[][] layout, userAns;
    int[] rmvIndex;
    int size, remove;
    boolean valid;
    Game1(int size)throws IOException{
        this.size = size;
        getLayout();
        selectLvl();
        rmvElements();

        

        grid();

        askValue();

        userAns = new String[size][size];
        for(int i = 0; i < size; i++){
            userAns[i] = Arrays.copyOf(layout[i], size);
        }
        if(checkSolution()){
            System.out.println("Yay!! You did it!");
        }
        else{
            System.out.println("Oops..!! You failed, try again!");
        }

    }

    void grid(){
        for(int row = 1 ;row<=(size*2)+1; row++){
            for(int column = 1 ; column<=(size*2)+1; column++){
                if(row%2==1){
                    if(column%2==1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("__");
                    }
                }
                else{
                    if(column % 2 == 1) {
                        System.out.print("|");
                    }
                    else{
                        if((layout[(row/2)-1][(column/2)-1]).length()==1){
                            System.out.print(" ");
                        }
                        System.out.print(layout[(row/2)-1][(column/2)-1]);
                    }
                } 
            }
            System.out.println();
        }
    }

    Integer[] getPN(){
        Integer[] pn = new Integer[size];
        for(int i = 0; i < size; i++){
            pn[i] = i + 1;
        }
        return pn;
    }

    List<Integer> checkColumn(List<Integer> list, int row, int col){
        for(int a = row; a >= 0; a--){
            for(int b = 0; b < list.size(); b++){
                if(Integer.parseInt(layout[a][col]) == list.get(b)){
                    list.remove(b);
                }
            }
        }
        return list;
    }

    void getLayout(){
        layout = new String[size][size];
		
		for(int i=0; i<size; i++){
            Integer[] pn = getPN();
            List<Integer> pnList = new ArrayList<>(Arrays.asList(pn));
			for(int j=0; j<size; j++){
                List<Integer> newList = new ArrayList<>(pnList);
                newList = checkColumn(newList, i-1, j);
                if(newList.size() == 0){
                    i = 0;
                    break;
                }
                int r = (int) (Math.random() *10 % newList.size());
				layout[i][j] = newList.get(r).toString();
                pnList.remove(newList.remove(r));
		    }
	    }
    }

    void selectLvl() throws IOException{
        System.out.println("Select difficulty level:\n1.Easy\n2.Medium\n3.Hard");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        while(!valid){
            String level = read.readLine();
            valid = true;
            switch(level){
                case "1":
                    remove = size*size/3;
                    break;
                case "2":
                    remove = size*size/2;
                    break;
                case "3":
                    remove = size*size*3/4;
                    break;
                default:
                    System.out.println("Invalid option");
                    valid = false;
                    break;
            }
        }
    }

    void rmvElements(){
        rmvIndex = new int[2*remove];
        for(int delete = 0 ; delete < remove; delete++){
            int i =(int) (Math.random() *10%size);
            int j =(int) (Math.random() *10%size);
            if(layout[i][j].equals(" ")){
                delete--;
                continue;
            }
            layout[i][j] = " ";
            rmvIndex[2*delete] = i + 1;
            rmvIndex[2*delete + 1] = j + 1;
        }
    }

    void askValue() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int value = 0; value < remove; value++){
            System.out.println("Z: Undo");
            System.out.println("Enter value for index " + rmvIndex[2*value] + "," + rmvIndex[2*value+1]);
            
            String input = reader.readLine();
            if(input.equalsIgnoreCase("z") && value > 0){
                
                layout[rmvIndex[2*(value-1)]-1][rmvIndex[2*(value-1)+1]-1] = " ";
                grid();
                value -= 2;
                continue;
            }
            else if(!input.matches("\\d+")){
                System.out.println("Invalid input, numbers allowed from 1 to " + size);
                value--;
                continue;
            }
            else if((Integer.parseInt(input) < 1) || (Integer.parseInt(input) > size)){
                    System.out.println("Invalid input, numbers allowed from 1 to " + size);
                    value--;
                    continue;
                }
            
            layout[rmvIndex[2*value]-1][rmvIndex[2*value+1]-1] = input;
            grid();
        }
    }
    

    boolean checkSolution(){
        for(int row = 0; row < size; row++){
            for(int column = 0; column < size; column++){
                for(int checkcol = 0; checkcol < size; checkcol++){
                    if(checkcol == column){
                        continue;
                    }
                    if(userAns[row][checkcol].equals(userAns[row][column])){
                        return false;
                    }
                }
                for(int checkrow = 0; checkrow < size; checkrow++){
                    if(checkrow == row){
                        continue;
                    }
                    if(userAns[checkrow][column].equals(userAns[row][column])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
	
    
	public static void main(String[] args)throws IOException{
		Game1 sudoku = new Game1(Integer.parseInt(args[0]));
	}
}