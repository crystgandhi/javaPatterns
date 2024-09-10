package myexamples;

public class NumberTrianglePattern {

	public static void main(String[] args) {
		       int n = 5;  // Number of rows
		       
    	        for (int i = 1; i <= n; i++) {
    	            for (int j = 1; j <= n - i; j++) {
    	                System.out.print(" ");  // Print spaces
    	            }
    	            for (int j = 1; j <= i; j++) {
    	                System.out.print(j + " ");
    	                         }
    	            System.out.println();
    	        }
    	    }	      
	}


