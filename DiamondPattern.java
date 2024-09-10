package myexamples;

public class DiamondPattern {

	public static void main(String[] args) {
		
		int n = 5;  // Number of rows
	       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  // Print spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
                         }
            System.out.println();
        }
        
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  // Print spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
                         }
            System.out.println();
        }
       
    }	
		

	}

