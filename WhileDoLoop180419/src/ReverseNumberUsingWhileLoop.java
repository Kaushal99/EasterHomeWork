import java.util.Scanner;

public class ReverseNumberUsingWhileLoop
{
    //Input number &amp; reverse it &amp; print it using while loop.

    public static void main(String[] args)
    {

        System.out.println("Input your number and press enter: ");
        //This statement will capture the user input
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        int num = in.nextInt();
        int reversenum =0;
        //While Loop: Logic to find out the reverse number
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of input number is: "+reversenum);





    }

}
