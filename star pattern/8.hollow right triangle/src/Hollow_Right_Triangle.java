
public class Hollow_Right_Triangle {

	public static void main(String[] args) {

		int row,column;
		for(row=1;row<=5;row++)
		{
		for(column=1;column<=row;column++)
		{
			if((row==3&&column==2)||(row==4&&column==2)||(row==4&&column==3))
					{
			System.out.print(" ");
					}
			else{System.out.print("*");}
		}
		System.out.println();
	}


	}

}
