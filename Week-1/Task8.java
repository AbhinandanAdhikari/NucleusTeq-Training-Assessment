/* Task8: Write a Java Program that takes three numbers as input to calculate and print the average of the numbers.*/
import java.util.*;
public class Task8{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int avg = (num1+num2+num3)/3;
        System.out.println("Average = "+avg);
    }
}