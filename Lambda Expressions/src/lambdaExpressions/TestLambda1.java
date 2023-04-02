// Implementing Basic Lambda Expression
package lambdaExpressions;

interface LambdaDemo
{
	int anyOperations(int num1, int num2);
}

public class TestLambda1 {
	public static void main(String args[])
	{
		LambdaDemo add = (x,y)->x+y;
		LambdaDemo sub = (x,y)->x-y;
		LambdaDemo mul = (x,y)->x*y;
		LambdaDemo div = (x,y)->x/y;
		System.out.println("Addition : "+add.anyOperations(10, 20));
		System.out.println("Subtraction : "+sub.anyOperations(20, 10));
		System.out.println("Multiplication : "+mul.anyOperations(10, 10));
		System.out.println("Division : "+div.anyOperations(10, 10));
	}
}
