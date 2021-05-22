import java.util.Scanner;

public class Prog_14 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
			System.out.println("enter year");
		int year = sc.nextInt();
		boolean leap =false;
		if(year%4==0)
		{
		if(year%100==0)
		{
			if(year % 400==0)
			
				leap=true;
			else
					leap=false;
		}
			else 
				leap =true;}
		
		else 
			leap=false;
		if(leap)
			System.out.println(year+"this is the leap year");
		else
			System.out.println(year+"this is not a leap year");
	}
	}	
		
}
