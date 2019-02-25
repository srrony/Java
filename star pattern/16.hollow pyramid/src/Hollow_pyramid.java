
public class Hollow_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int row,column,column_limit=0,test_case=5;
		
		for(row=1;row<=test_case;row++)
		{
			
			for(column=1;column<=test_case+column_limit;column++)
			{
				if(column<=5-row)
				{
					System.out.print(" ");
				}
				else if (row==1||column==1||row==5||column==test_case+column_limit)
				{System.out.print("*");}
				
			}
			column_limit++;
			System.out.println();
		}
	}

}
