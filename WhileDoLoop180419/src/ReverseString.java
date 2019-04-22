import javax.swing.*;
import java.util.*;
public class ReverseString
{
    //Write a program called Reverse String, which prompts user for a
    //String, and prints the reverse of the String.

    public static void main(String[] args)
    {

        String original, reverse = "";//reverse mentions srting
       Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        original = in.nextLine();
        //scan the original length of string
        int length = original.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + original.charAt(i);

        System.out.println("Reverse of the string: " + reverse);
    }
}













