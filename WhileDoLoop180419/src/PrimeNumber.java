import javax.swing.*;

public class PrimeNumber {
    //Write a programme to input any number and check if if Prime Number or not
    public static void main(String[] args)
    {
        //using JFrame to input value.
        JFrame frame = new JFrame("Armstrong Number");
        //prompt the user to enter their value & store in different type of variable as per need.
        int number = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter whole number"));


        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            // condition for nonprime number
            if (number % i == 0) {
                flag = true;
               break;
            }
        }
            if (!flag)
            {
                System.out.println(number + "  :Is a prime number");
            } else {
                System.out.println(number + "  :Is not a prime number");
            }

        }


}







