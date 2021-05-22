
public class ThirdProg {

	 int x,y,z;

	public static void main(String[] args) {
		
	/*	int num1 =50;
	int num2=60;
		if((num2=1)==num1)
			System.out.println(num2);
		else
			System.out.println(++num2);*/
	
		Arith();
}
	static void Arith()
	{
		int x = 10;
		System.out.println("Value of x is "+x);
		int y = x*x + 3*x - 7;
		System.out.println("1) Y = x^2 + 3x - 7 = "+y);
		y = x++ + ++x;
		System.out.println("2) Y = x++ + ++x");
		System.out.println("x is "+x+" and y is "+y);
		int z = x++ - --y - --x + x++;
		System.out.println("3) z = x++ - --y - --x + x++");
		System.out.println("x is "+x+", y is "+y+" and z is "+z);
		boolean a = true;
		boolean b = false;
		boolean c = a && b || !(a || b);
		System.out.println("4) z = x && y || !(x || y)");
		System.out.println("z is "+c);
	}
	
	
	
}
