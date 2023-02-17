/* Task 7: Write a Java Program to prit the sum,multiplication,subtraction,division,remainder of two numbers. */
import java.util.*;
public class Task7{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
        System.out.println(num1+" - "+num2+" = "+Math.abs(num1-num2));
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
        System.out.println(num1+" % "+num2+" = "+(num1%num2));
    }
}