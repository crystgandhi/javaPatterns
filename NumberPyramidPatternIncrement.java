package myexamples;
public class NumberPyramidPatternIncrement {

	public static void main(String[] args) {
		int n = 5;  // Number of rows for the pattern
        int count =1;
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " "); 
                // Print numbers from 1 to the current row number
                count++;
            }
            System.out.println();  // Move to the next line after each row is printed
        }

	}

}
