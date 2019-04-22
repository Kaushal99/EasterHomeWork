import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class StringCharNumber
{
    //write a programme to enter any String and count total number of 'a' in that String

    public static void main(String[] args)
    {
        //scanner class to input String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word");
        String name = scanner.nextLine();

        //creating interger letter to use for loop method
        int letter = 0;
        for(int i = 0; i < name.length(); i++)
        {
            if (name.charAt(i) == 'a') {
                letter++;

            }
        }
            System.out.println("Total Number of 'a' in String " + "'" + name + "'" +   "is = "   + letter);

    }

}