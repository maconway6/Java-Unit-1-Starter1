import java.util.Scanner;

/**
 * This class shows how to use the Scanner class to get
 * input from the keyboard as a String.  The input is then
 * output to the terminal window.
 *
 * @author Prof. White
 * @version Spring 2018
 */
public class Parrot
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        String inputSentence = "";
        
        System.out.print("Enter a sentence:  ");
        inputSentence = keyboard.nextLine();
        System.out.println();
        System.out.println("Your sentence was:  ");
        System.out.println(inputSentence);
    }
}
