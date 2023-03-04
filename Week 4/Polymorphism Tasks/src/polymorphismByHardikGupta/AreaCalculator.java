// Extra Task of Polymorphism given by Mr. Hardik Gupta

package polymorphismByHardikGupta;

public class AreaCalculator {
	public double area(double length, double breadth)
	{
		return length * breadth;
	}
	public double area(double radius)
	{
		return Math.PI * radius * radius;
	}
	public int area(int side)
	{
		return side*side;
	}
}
