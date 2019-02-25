
public class Hollow_Rhombus {

	public static void main(String[] args) {
		
		int row,column,space;
		
		for(row=5;row>=1;row--)
		
		{
			
			for(space=0;space<=row-1;space++)
				
			{
				System.out.print(" ");
			}
			
			for(column=1;column<=5;column++)
			{
				
				if(row==1||row==5||column==1||column==5)
				{
					System.out.print("*");
				}
				
				else{ System.out.print(" ");}
			}
			
			System.out.println();
		}
	

	}

}
