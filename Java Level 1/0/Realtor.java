/**************************************************************************************************************************** Name: Daoud Shafique                                                                                               CSC 156* Data: January 30th, 2016                                                                                           Lab 0  *****************************************************************************************************************************Statement: Determines owner, selling cost comission for house sale                                                         * Specifications:                                                                                                           * Input - owner (String) and selling price (double)                                                                         * Output - owner (String), selling cost (double) and commission (double)                                                    ***************************************************************************************************************************/ // java class for keyboard I/O
import java.util.Scanner;

public class Realtor
{ 
    public static void main(String[] args)
    {
	// declaration of objects 
	Scanner console = new Scanner(System.in); // for keyboard input
	String seller;                            // seller's name
	// price of the house, the cost to sell the house and the commission
	double price, cost, commission;

	// 1. Output descriptive messages
	System.out.printf ("This program calculates the cost to sell a home%n"
			   + "and the commission paid to an individual sales agent.%n%n");
	System.out.printf ("The user is asked for the last name of the seller and the%n"
			   + "sales price.%n%n");
	// 2. Prompt for and input the seller's name
	System.out.printf("%nPlease enter the owner's last name: ");
	seller = console.nextLine(); 
	//3. Prompt for and input the sales price
	System.out.printf("%nPlease enter the sales price of the home: ");
	price = console.nextDouble();

	//4. -5. calculate the cost and the commssion
	cost = 0.06 * price;
	commission = 0.015 * price;

	//6. -7. display the input and results
	System.out.printf("%nThe " + seller + "'s home sold for $%.2f%n", price);
	System.out.printf("The cost to sell the home was $%.2f%n", cost);
	System.out.printf("The selling or listing agent earned $%.2f%n", commission);
    }
}