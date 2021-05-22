
public class Prog_13 {

	public static void main(String[] args) {
		
			int num1=100,num2=200,num3=50;
		/*	if(num1>num2&&num1>num3)
				System.out.println("Num1 is greatest:");
			else if(num2>num1&&num2>num3)
				System.out.println("num2 is greatest" );
			else
				System.out.println("num3 is greatest");*/
			int greates=(num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3);
			System.out.println(greates);
	}

}
