/* Write a Java Program that takes two numbers as input and display the product of two numbers. */
import java.util.*;
public class Task6{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int prod = num1 * num2;
        System.out.println(num1+" * "+num2+" = "+prod);
    }
}