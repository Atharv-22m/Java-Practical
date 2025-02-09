public class RecursionPattern {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        RecursionPattern pattern = new RecursionPattern();
        System.out.println("Pattern 1:");
        pattern.printPattern1(1, size);

        System.out.println("Pattern 2:");
        pattern.printPattern2(1, size);
        
        System.out.println("Pattern 3:");
        pattern.printPattern3(1, size);
    }

    void printPattern1(int line, int size) {
        if (line == 0) {
            return;
        }

        printStars(line); 
        System.out.println();

        if (line < size + 1) {
            printPattern1(line + 1, size); 
        }

        printStars(line-1); 
        System.out.println();
    }


    void printPattern2(int line, int size) {
        if (line == 0) {
            return;
        }

        printSpaces(size - line + 1); 
        printStars(line); 
        System.out.println();

        if (line < size) { 
            printPattern2(line + 1, size);
        } else { 
            printMiddleLine(size + 1); 
            System.out.println("");
            printReversePattern2(size, 2); 
        }
    }

    void printReversePattern2(int line, int spaces) {
        if (line == 0) {
            return;
        }

        printSpaces(spaces - 1); 
        printQuotes(line); 
        System.out.println();

        printReversePattern2(line - 1, spaces + 1); 
    }

    void printPattern3(int line, int size) {
        if (line == 0) {
            return;
        }

        printSpaces(size - line); 
        printStars(2 * line - 1); 
        System.out.println();

        if (line < size) {
            printPattern3(line + 1, size);
        }

        if (line < size) {
            printSpaces(size - line); 
            printStars(2 * line - 1); 
            System.out.println();
        }

        if (line == 1) {
            printPlus(2*size - 1, size -1); 
        }
    }

    void printStars(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }

    void printSpaces(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }

    void printQuotes(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("'");
        printQuotes(count - 1);
    }

    void printMiddleLine(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("+");
        printMiddleLine(count - 1);
    }

    void printPlus(int count, int spaces) {
        if (count == 0) {
            return;
        }
        printSpaces(spaces);
        System.out.println("+");
        printPlus(count - 1,spaces);
    }
}
