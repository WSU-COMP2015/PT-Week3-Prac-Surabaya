package Week3Prac;
import java.util.Scanner;

public class dataStreams1 {

  public static void main(String[] args) {
	  // for object scanner to read input from user keyboard
    Scanner kb = new Scanner(System.in);
    
    // for declare variables to store user input values
    byte number1; // for first whole number
    byte number2; // for second whole number
    float number3; // for fractional number
    String message; // for text input by user
    
    // ask user to enter the first whole number
    System.out.println("Please enter a whole number");
    number1 = kb.nextByte();
    // ask the user for the second whole number
    System.out.println("Please enter a whole number");
    number2 = kb.nextByte();
    // ask user for the fractional number
    System.out.println("Please enter a fractional number");
    number3 = kb.nextFloat();
    
    kb.nextLine(); // clear the line in order to not interrupt between each other
    // for user to entering text message
    System.out.println("Please enter a message");
    message = kb.nextLine();
    // to display all the data input from the user
    System.out.println("Data entered was:");
    System.out.println("number 1: " + number1);
    System.out.println("number 2: " + number2);
    System.out.println("number 3: " + number3);
    System.out.println("message : " + message);
    // to close
    kb.close();
  }

}