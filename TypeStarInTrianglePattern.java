package myexamples;

public class TypeStarInTrianglePattern {

	public static void main(String[] args) {
		int n = 6;  // Number of rows for the pattern
        // Outer loop for each row
      for (int i = 1; i < n; i++) {
          // Inner loop to print numbers in each row
          for (int j = 1; j <= i; j++) {
              System.out.print("*" + " "); 
           // Print numbers from 1 to the current row number   
          }
          System.out.println();  // Move to the next line after each row is printed
      }

	}

}
