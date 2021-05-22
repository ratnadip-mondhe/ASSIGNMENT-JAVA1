import java.util.Scanner;

public class Prog_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
double p_A,rate,time;
		System.out.println("enter principle amount");
		p_A=sc.nextDouble();
		System.out.println("enter the rate");
		rate=sc.nextDouble();
		System.out.println("enter time");
		time=sc.nextDouble();
	double simpleInterest=((p_A*rate*time)/100);
		System.out.println("The simple interest is ="+" "+simpleInterest);
	}

}
