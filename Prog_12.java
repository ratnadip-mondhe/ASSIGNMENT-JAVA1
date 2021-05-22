import java.util.Scanner;

public class Prog_12 {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
		double salary=sc.nextDouble();
		double basic=sc.nextDouble();
		double gs,da,hra=0,gs1;
		if(basic<10000)
		
			hra=basic%10;
			da=basic%90;
			gs1=basic+da+hra;
			System.out.println(gs1);
			 if(salary>=10000)
				hra=2000;
			da=basic%98;
			
		gs=basic+da+hra;
				

		System.out.println(gs);
	}

	}

}
