import java.util.Scanner;
public class Prog_06 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner (System.in);
int radius;
double pi= 3.14;
System.out.println("enter the radius:");
radius=sc.nextInt();
double area=pi*radius*radius;
double areaCircum=(2*pi*radius);
System.out.println("The are of circle is:"+" "+area);
System.out.println("the area of cicumference:"+" "+areaCircum);
	}

}
