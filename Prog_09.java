import java.util.Scanner;

public class Prog_09 {


	public static void main(String[] args) {
		Result();
		
	}
	public static void Result()
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter days");
		int days=sc.nextInt();
		sc.close();
		int year=days/365;
		days=days-(365*year);
		int month=((days%365)/30);
	int days1=days-(month*30);
	//int days1=days-month;
		System.out.println("year"+year);
		System.out.println("month"+month);
		System.out.println("days"+days);
	}

}

