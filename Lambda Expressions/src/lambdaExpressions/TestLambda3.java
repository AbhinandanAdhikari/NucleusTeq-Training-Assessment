// Implementing Method references in Lambda Expression
package lambdaExpressions;

interface LambdaDemo3
{
	void display(String str);
}

public class TestLambda3 {
	public static void method(LambdaDemo3 obj)
	{
		obj.display("Hello world");
	}
	public static void reverse(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
	public static void main(String args[])
	{
		LambdaDemo3 obj = (str)-> System.out.println(str);
		method(obj);
		LambdaDemo3 obj2 = TestLambda3::reverse;
		obj2.display("Abhinandan");
	}
}
