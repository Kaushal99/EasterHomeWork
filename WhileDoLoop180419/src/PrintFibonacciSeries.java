import java.util.Scanner;

public class PrintFibonacciSeries
{

    //Write a program to print Fibonacci series of n terms where n is input by user : Fn = Fn-1 + Fn-2
    public static void main(String[] args)
    {
        int i,c=0,d;
        Scanner sc = new Scanner(System.in);
        // input to print Fibonacci series upto how many numbers
        System.out.println("Enter a number to generate fibonacci series upto N term");
        d=sc.nextInt();
        int a=0;
        int b=1;

        System.out.println("Fibonacci series upto "+d+" is :-");
        // second term inside the first term, the third term inside the second and add the first two terms.
        while(c<=d)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }


    }






}
