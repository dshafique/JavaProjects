/**************************************************************************************************************************** Name: Daoud Shafique                                                                                               CSC 156* Data: February 4th, 2016                                                                                           Lab 1  *****************************************************************************************************************************Statement: Determines owner, selling cost comission for house sale                                                         * Specifications:                                                                                                           * Input - owner (String) and selling price (double)                                                                         * Output - owner (String), selling cost (double) and commission (double)                                                    ***************************************************************************************************************************/ // java class for keyboard I/O
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Realtor1
{ 
    public static void main(String[] args)
    {
	// declaration of objects 
	Scanner console = new Scanner(System.in); // for keyboard input
	String seller;                            // seller's name
	// price of the house, the cost to sell the house and the commission
	double price, cost, commission;
	


	String display_message = "This program calculates the cost to sell a home\n"
	    + "and the commission paid to an individual sales agent. \n\n"
	    + "The user is asked for the last name of the seller and the\n"
	    + "sales price. \n\n";

	JOptionPane.showMessageDialog(null, display_message,
         "Lab 1 Description", JOptionPane.INFORMATION_MESSAGE);
				       
        seller = JOptionPane.showInputDialog("Please enter the owner's last name");

	String price_string = 
            JOptionPane.showInputDialog("Please enter the sales price of the home");
        
        price = Double.parseDouble(price_string);

	
	cost = 0.06 * price;
	commission = 0.015 * price;

	String
         out1 = String.format("%nThe " + seller + "'s home sold for $%.2f%n", price),
	 out2 = String.format("The cost to sell the home was $%.2f%n", cost),
	 out3 = String.format("The selling or listing agent earned $%.2f%n", commission);

	JOptionPane.showMessageDialog(null, out1 + out2 + out3,
	  seller + "'s Home Sale", JOptionPane.INFORMATION_MESSAGE);

       
    

    }
}