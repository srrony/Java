import javax.print.attribute.standard.MediaSize.NA;

public class Leap_Year_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2000;
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("The Year " + year + " is leap year.");
		}

	}

}
