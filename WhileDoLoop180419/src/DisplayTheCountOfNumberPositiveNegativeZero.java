import java.util.Scanner;

public class DisplayTheCountOfNumberPositiveNegativeZero
{
    //Write a program to enter the numbers till the user wants and at
    //the end it should display the count of positive, negative and zeros entered

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;

        char choice;

        do
        {
            System.out.print("Enter the number ");
            number = scanner.nextInt();//scanner class for number to input

            if(number > 0)
            {
                countPositive++;
            }
            else if(number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }

            // choice to enter as many number user can enter
            System.out.print("Do you want to continue y/n? ");
            choice = scanner.next().charAt(0);//scanner class for yes or no to continue further

        }while(choice=='y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);




    }




}
