// Extra Task of Polymorphism given by Mr. Hardik Gupta
package polymorphismByHardikGupta;
import java.util.*;
public class PolymorphismTest {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double length = in.nextDouble();
		double breadth = in.nextDouble();
		int side = in.nextInt();
		double radius = in.nextDouble();
		AreaCalculator ac = new AreaCalculator();
		System.out.println("Area of Rectangle = "+ac.area(length, breadth));
		System.out.println("Area of Square = "+ac.area(side));
		System.out.println("Area of Circle = "+ac.area(radius));
	}
}
