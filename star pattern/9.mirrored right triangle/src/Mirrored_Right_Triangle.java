
public class Mirrored_Right_Triangle {

	public static void main(String[] args) {
		
		int row,column,space;
		for (row=5;row>=1;row--)
		{
			for(space=1;space<=row;space++)
			{
				System.out.print(" ");
			}
			for(column=5;column>=row;column--)
			{
				System.out.print("*");
			}
			
			System.out.println();
			}
		
		}
			

	}


