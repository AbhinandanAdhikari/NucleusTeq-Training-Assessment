package abstractClass;
import java.util.*;
abstract class Shape {
	abstract void perimeter();
	abstract void area();
}
class Circle extends Shape{
	double radius;
	public Circle(double r)
	{
		this.radius=r;
	}
	public void perimeter()
	{
		double perimeter = 2 * Math.PI * this.radius;
		System.out.println("Perimeter of Circle = "+perimeter);
	}
	public void area()
	{
		double area = Math.PI * this.radius*this.radius;
		System.out.println("Area of Circle = "+area);
	}
}
class Rectangle extends Shape{
	int length;
	int breadth;
	
	public Rectangle(int l, int b)
	{
		this.length=l;
		this.breadth=b;
	}
	public void perimeter()
	{
		int p = 2 * (this.length+this.breadth);
		System.out.println("Perimeter of rectangle = "+p);
	}
	public void area(){
		int area = this.length*this.breadth;
		System.out.println("Area of rectangle = "+area);
	}
}
public class AbstractClassTest{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int radius = in.nextInt();
		Circle c = new Circle(radius);
		c.perimeter();
		c.area();
		System.out.println("Enter the length & breadth:");
		int length = in.nextInt();
		int breadth = in.nextInt();
		Rectangle rect = new Rectangle(length,breadth);
		rect.perimeter();
		rect.area();
	}
}
