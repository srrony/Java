
public class Hollow_Square {

	public static void main(String[] args) {
		
		int row,column;
		
		for(row=1;row<=5;row++)
		{
			for(column=1;column<=5;column++)
			{
				if(row==1||row==5||column==1||column==5)
				{
					System.out.print("*");
				}
				else{System.out.print(" ");}
			}
			System.out.println();
		}
	}

}
