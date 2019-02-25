
public class Rhombus {

	public static void main(String[] args) {
		
		int row,column,space;
		
		for(row=5;row>=1;row--)
		{
			for (space=0;space<=row-1;space++)
			{
				System.out.print(" ");
			}
			for(column=1;column<=5;column++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		}
		
	}

}
