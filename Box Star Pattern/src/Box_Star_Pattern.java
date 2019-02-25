/*
 ============================================================================
 Program #	  : Star_Pattern_
 Program Name : 
 Version      : 1.0
 Copyright    : Z Technology
 Date		  : August, 
 Year		  : 20XVI
 Description  : 
 ============================================================================
 */

/**
 * @author MS Zaman
 */
public class Box_Star_Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test_case = 7, row, column;
		
		if(test_case%2==0){
			test_case+=1;
		}
		else {
			test_case+=0;
		}
		
		int column_element;
		int column_limit = test_case*2-1;
		int column_initial = test_case;
		
		for(row = test_case; row >= 1; row--) {
			
			column_initial = row+1;
			column_element=test_case;
			for(column = 1; column <= test_case-row; column++,column_element--) {
				
				if(column_element%2==0) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}

			for(column=1; column<=column_limit; column++) {
				
				if(row%2==0) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			column_limit-=2;
			
			for(column = 1; column <= test_case-row; column++,column_initial++) {
				
				if(column_initial%2==0) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			
			System.out.println();
		}
		
		int column_limit_2 = 1;
		for(row=1; row<=test_case-1;row++) {
			
			column_initial = row+1;
			column_element=test_case;
			for(column = 1; column <= test_case-row; column++,column_element--) {
				
				if(column%2==0) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}

			for(column=1; column<=column_limit_2; column++) {
				
				if(row%2==1) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			column_limit_2+=2;
			
			for(column = 1; column <= test_case-row; column++,column_initial++) {
				
				if(column_initial%2==0) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			
			System.out.println();
		}

	}

}
