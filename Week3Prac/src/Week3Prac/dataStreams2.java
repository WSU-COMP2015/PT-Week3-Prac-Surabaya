package Week3Prac;
import java.util.Scanner;

public class dataStreams2 {

  public static void main(String[] args) {
	  // for scanner input keyboard from the user
    Scanner kb = new Scanner(System.in);
    // declaring all the variables to store input values
    byte number1; // for first
    byte number2; // for second
    float number3; // for third
    String message; // for the last one 
    // gives out question to the user 
    System.out.println("Please enter a whole number");
    number1 = kb.nextByte();
    
    kb.nextLine();
    // ask the user to enter message
    System.out.println("Please enter a message");
    message = kb.nextLine();
    // ask user to enter whole number
    System.out.println("Please enter a whole number");
    number2 = kb.nextByte();
    //ask user to enter fractional number
    System.out.println("Please enter a fractional number");
    number3 = kb.nextFloat();
    // to display all the data input by the user
    System.out.println("Data entered was:");
    
    System.out.println("number 1: " + number1);
    
    System.out.println("number 2: " + number2);
    
    System.out.println("number 3: " + number3);
    
    System.out.println("message : " + message);

    // close scanner
    kb.close();
  }

}