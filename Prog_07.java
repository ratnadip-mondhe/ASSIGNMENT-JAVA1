import java.util.Scanner;

public class Prog_07 {

	public static void main(String[] args) {
		int marks1,marks2,marks3,marks4,marks5;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first sub marks");
		marks1=sc.nextInt();
		System.out.println("enter the second sub marks");
		marks2=sc.nextInt();
		System.out.println("enter the thirdsub marks");
		marks3=sc.nextInt();
		System.out.println("enter the fourth sub marks");
		marks4=sc.nextInt();
		System.out.println("enter the fifth sub marks");
		marks5=sc.nextInt();
		double sum=marks1+marks2+marks3+marks4+marks5;
		double percentage=((sum/100)*5);
		System.out.println("sum is"+" "+sum);
		System.out.println("percentage"+" "+percentage+"%");
	}

}
