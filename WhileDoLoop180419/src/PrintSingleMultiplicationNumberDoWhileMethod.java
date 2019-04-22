import java.util.Scanner;

public class PrintSingleMultiplicationNumberDoWhileMethod
{
    //Print single multiplication table using do while loop for given number

    public static void main(String[] args)
    {


        int n,c = 1;
        System.out.println("Enter an number to print it's multiplication table");

        //scan class ti input n value
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of " + n);

        //using Do While loop method
        do
            {
                System.out.println(n + "*" + c + " = " + (n * c));
                c++;
            }

        while ( c <= 10);//multiplication for 1 to 10 numbers by given interger


    }


}
