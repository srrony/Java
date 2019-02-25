/*
 ============================================================================
 Program #	  : Star_Pattern_15
 Program Name : Pyramid
 Version      : 1.0
 Copyright    : Z Technology
 Date		  : August, 25
 Year		  : 20XVI
 Description  : 
 ============================================================================
 */

/**
 * @author MS Zaman
 */
public class Pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test_case = 5, row, column, column_limit = 0;
		
		for(row = 1; row <= test_case; row++) {
			
			for(column = 1; column <= test_case + column_limit; column++) {
				
				if(column <= (test_case - row)) {
					
					System.out.print(" ");
				}
				
				else {
					
					System.out.print("*");
				}
			}
			
			column_limit++;
			System.out.println();
		}

	}

}
