package Week3Prac;
import java.util.Scanner;

public class Rodents {

	public static void main(String[] args) {
		// for scanner object input from the user 
		Scanner kb = new Scanner(System.in);
		// to declare all the variables to store input
	    int initialPopulation; // starting the population 
	    float percentageIncrease; // annual population increase in percentage
	    int yearsEstimate; // number of years to estimate
	    // input initial population will keep on asking if the user input is below 300
	do {
	    System.out.println("enter initial population of Rodents of Unusual Size(minimum 300)");
	    initialPopulation = kb.nextInt();
	    if (initialPopulation < 300) {
	    	System.out.println("Error: population must be at least 300.");
		}
	} while (initialPopulation < 300);
		// annual percentage increase will also keep on asking if the user enter negative input
	do {
		System.out.println("enter annual population increase percentage(cannot be negative):");
	    percentageIncrease = kb.nextFloat();
	    if(percentageIncrease < 0) {
	    	System.out.println("Error: percentage cannot be negative.");
	    }
	} while (percentageIncrease < 0);
	// number of years keep asking user in under 10
	 do {
	    System.out.println("enter number of years to estimate population(minimum 10)");
	    yearsEstimate = kb.nextInt();
	    if(yearsEstimate < 10) {
	    	System.out.println("Error: years must be at least 10.");
	    }
	   } while (yearsEstimate < 10);
	 // for calculating all the population that were given
	 float population = initialPopulation;
	 for (int year = 1; year <=yearsEstimate; year++) {
		 // will show the current year and population 
		 System.out.printf ("Year %d: Population = %.0f%n", year, population);
		 // increase population by percentage
         population = population + (population * percentageIncrease / 100);
     	}
	    // close the scanner
	    kb.close();
	    
	  }

}
