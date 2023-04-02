// Checking Capture in Lambda Expression

package lambdaExpressions;

interface LambdaDemo2
{
	void display();
}

class Test
{
	int classCount=10;
	public void method()
	{
		int methodCount=10;
		LambdaDemo2 obj = ()->
		{
			int localCount=10;
			System.out.println(classCount++);
			System.out.println(methodCount);
//	 Error: System.out.println(methodCount++);
			System.out.println(localCount++);
		};
		obj.display();
	}
}

public class TestLambda2 {
	public static void main(String args[])
	{
		Test obj = new Test();
		obj.method();
	}
}
