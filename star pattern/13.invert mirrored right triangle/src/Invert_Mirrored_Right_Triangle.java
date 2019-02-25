
public class Invert_Mirrored_Right_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row,column,space;
		
		for(row=5;row>=1;row--)
		{
			for(space=4;space>=row-1;space--)
			{
				System.out.print(" ");
			}
				for (column=1;column<=row;column++)
				{
					System.out.print("*");
				}
			
			System.out.println();
		}
	}
}

