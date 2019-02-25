
public class Hollow_Mirrored_Right_Triangle {

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
				if((row==3&&column==4||row==2&&column==3||row==2&&column==4))
						{
					System.out.print(" ");
						}
				else {System.out.print("*");
			}}
			
			System.out.println();
			}
	}

}
