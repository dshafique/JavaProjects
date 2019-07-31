/************************************************************************
* Name: Daoud Shafique                                                CSC 156
* Date: February 11, 2016                                              Lab 2   
*************************************************************************
* Statement: Determine type of flooring for a new home
* Specifications:
* Input  - Flooring selector
* Output - Appropriate output message based upon selector value
************************************************************************/

// java class for Panel I/O
import javax.swing.JOptionPane;

// declaration of the class
public class Flooring2
{
	public static final String CONCRETE = "1:  Scored concrete, costs $3000";
	public static final String CARPET = "2:  Carpeting comes with a $5000 allowance";
	public static final String WOOD = "3:  Wood floors in the living area \n"
	                                  + "carpeting in the bedrooms, tile in the bath areas\n"
	                                  + "and a $5000 carpet allowance , totalling $10,000\n";

    // declaration of main program
    public static void main(String[] args)
    {

		// objects used to store data
		String option_as_string; //used to get option from input dialog
		int choice; //used in selection structure
		String temp;

		// 1. display a descriptive message
		temp =  "This program asks the user to enter a choice of flooring for a new home.\n"; 
	
		JOptionPane.showMessageDialog(null, temp, "Flooring selection",JOptionPane.INFORMATION_MESSAGE);
	
	
		// 2. display a menu of options for flooring
		// 3. input a choice based upon the menu
		
		temp = "Enter the number that matches your flooring choice.\n" +
				CONCRETE + "\n" + CARPET + "\n" + WOOD;
		
		
		option_as_string = JOptionPane.showInputDialog(temp);
		choice = Integer.parseInt(option_as_string);
		
		// 4. determine which of 4 output Strings is to be displayed
		if (choice == 1)
		    temp = "You chose Selection - " + CONCRETE;
		else if (choice == 2) 
		    temp = "You chose Selection - " + CARPET;
		else if (choice == 3)
		    temp = "You chose Selection - " + WOOD;
		else 
		    temp = "Your selection is not available";

		JOptionPane.showMessageDialog(null, temp, "Flooring seletion",
					      JOptionPane.INFORMATION_MESSAGE);


		// 5. display the appropriate message
		
		
		


    } // end of main
} // end of the class 
