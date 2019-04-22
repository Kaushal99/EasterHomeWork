import java.util.Scanner;

public class PrintMultiplicationNumberForLoopMethod
{
    //Print single multiplication table using for loop for given number

    public static void main(String[] args)
    {
        int a, b;
        System.out.println("Enter an number to print it's multiplication table");
        //this function scan the value of integer a
        Scanner in = new Scanner(System.in);
         a = in.nextInt();
        System.out.println("Multiplication table of " + a);
        //using for loop method
        for (b = 1; b <= 10; b++)
        {
            System.out.println(a + "*" + b + " = " + (a*b));
        }


    }

}
