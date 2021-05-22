import java.util.Scanner;

public class Prog_11 {

	public static void main(String[] args) {
	//int num1=20,num2=10;
try(Scanner sc=new Scanner(System.in)){
	System.out.println("enter no");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	num1=num1^num2;
	num2=num1^num2;
	num1=num1^num2;
	
	
	System.out.println(num1+" "+num2);
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
System.out.println(num1+" "+num2);

}
	

	}

}
