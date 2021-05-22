import java.util.Scanner;
public class Prog_10 {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in) ){
		System.out.println("enter the faherenit");
		double fahrenheit=sc.nextDouble();
	
		double celsius=(5*(fahrenheit-32)/9);
		System.out.println("faHRE TO CEL"+celsius);
	}
	}
}
