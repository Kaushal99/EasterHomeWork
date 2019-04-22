import java.util.Scanner;

public class SumOfEachDigit
{
    //Write a programme to input any five digit number and then find sum of each digit
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        //user to input any 5 number
        int num = scanner.nextInt();
        // Remember number/10 reduces one digit from number
        int sum = 0;


        while (num > 0)
        {
            sum = sum + num % 10;
            num = num / 10;
         }
            System.out.println(sum);

    }


}





