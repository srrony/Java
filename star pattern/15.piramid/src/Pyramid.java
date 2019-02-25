
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row,column,column_limit=0;
		
		for(row=1;row<=5;row++)
		{
			
			for(column=1;column<=5+column_limit;column++)
			{
				if(column<=5-row)
				{
					System.out.print(" ");
				}
				else{System.out.print("*");}
			}
			column_limit++;
			System.out.println();
		}
	}

}
