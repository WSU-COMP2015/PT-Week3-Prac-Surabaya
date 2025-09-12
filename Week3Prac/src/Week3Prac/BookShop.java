package Week3Prac;
import java.util.Scanner;

public class BookShop {

    public static void main(String[] args) {
    	// to read object from user input from keyboard
        Scanner input = new Scanner(System.in);
        // boolean loop is for variable control for customer
        boolean moreCustomers = true;
        // will keep on running until none
        while (moreCustomers) {
        	// variable to store total cost for current customer
            double total = 0;

            System.out.println("=== New Customer ===");
            
            // inner loop for customer to enter multiple books
            while (true) {
                System.out.print("Enter book price (0 to finish): ");
                double price = input.nextDouble();
                // if user enters 0 will stop adding books
                if (price == 0) {
                    break; // when finish entering the books
                }
                // for validating the price is not zero or negative
                if (price < 0) {
                    System.out.println("Price cannot be zero or negative");
                    continue;
                }

                System.out.print("Enter quantity: ");
                int qty = input.nextInt();

                // validate quantity is not zero or negative
                if (qty <= 0) {
                    System.out.println("Quantity cannot be zero or negative");
                    continue;
                }

                // calculate subtotal and add it to total
                total = total + (price * qty);
            }

            // if no books were entered, skip payment section
            if (total == 0) {
                System.out.println("No books were purchased or input.");
            } else {
            	// show the total amount the customer needs to pay
                System.out.println("Total amount: $" + total);
                input.nextLine(); // clean leftover newline

                System.out.print("Payment method (cash / credit): ");
                String method = input.nextLine();

                if (method.equalsIgnoreCase("cash")) {
                    System.out.print("Enter cash amount: ");
                    double cash = input.nextDouble();

                    // check if cash is enough or not
                    if (cash < total) {
                        double remaining = total - cash;
                        System.out.println("Insufficient cash. Remaining: $" + remaining);

                        input.nextLine(); // clear newline
                        System.out.print("Pay remaining with credit (yes/no): ");
                        String choice = input.nextLine();

                        // if user agrees to pay the rest with credit
                        if (choice.equalsIgnoreCase("yes")) {
                            System.out.println("\n--- Receipt ---");
                            System.out.println("Total: $" + total);
                            System.out.println("Cash: $" + cash);
                            System.out.println("Credit: $" + remaining);
                            System.out.println("Paid in full");
                        } else {
                        	// if user refuse, then cancel transaction
                            System.out.println("Transaction cancelled.");
                            continue;
                        }
                        // if cash is enough , will calculate the change
                    } else {
                        double change = cash - total;
                        System.out.println("\n--- Receipt ---");
                        System.out.println("Total: $" + total);
                        System.out.println("Cash: $" + cash);
                        System.out.println("Change: $" + change);
                        System.out.println("Paid in full");
                    }
                    // if user pays with credit card method
                } else if (method.equalsIgnoreCase("credit")) {
                    System.out.println("\n--- Receipt ---");
                    System.out.println("Total: $" + total);
                    System.out.println("Credit: $" + total);
                    System.out.println("Paid in full");
                    // if the user enter a invalid input
                } else {
                    System.out.println("Invalid payment method!");
                }
            }

            input.nextLine(); // clear newline
            // if answer yes then it will end the programs
            System.out.print("Process next customer? (yes/no): ");
            String again = input.nextLine();
            
            // check if user still wants to continue serving next customer
            if (!again.equalsIgnoreCase("yes")) {
                moreCustomers = false;
            }
        }
        // close scanner end programs
        input.close();
        System.out.println("Book shop closed.");
    }
}
