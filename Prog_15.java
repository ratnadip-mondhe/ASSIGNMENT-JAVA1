import java.util.Scanner;

public class Prog_15 {

	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
String gender=sc.next();
int age=sc.nextInt();
switch (gender)
{
	case1'm':
	if(age>21)
		System.out.println("eligible");
	else
		System.out.println("not eligible");
	break;
case2 'f':
if(age>18)
	System.out.println("eligible");
else
	System.out.println("not eligible");

break;
default :
System.out.println("kahi nhi");
}
}
	}

	