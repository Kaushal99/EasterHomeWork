import javax.swing.*;
import java.util.Scanner;

public class ArmStrongNumber
{
    //Write a programme to input any number and check if it is Armstrong number or not.
    public static void main(String[] args)
    {

        //using JFrame to input value.
        JFrame frame = new JFrame("Armstrong Number");
        //prompt the user to enter their value & store in different type of variable as per need.
        int number = Integer.parseInt(JOptionPane.showInputDialog(frame,"Please enter whole number")),
                originalNumber,remainder,result = 0;
            System.out.println("Number :" +number);
            originalNumber = number;

            while (originalNumber != 0)
            {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);//Math.pow is method to raise the power of given integer value
                originalNumber /= 10;
            }

            if(result == number)
            {
                //if result is in Armstrong number
                System.out.println(number + " is an Armstrong number.");
            }
            else
                {

                System.out.println(number + " is not an Armstrong number.");
                }


    }

}








