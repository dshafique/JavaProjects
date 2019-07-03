/************************************************************************
* Name: Daoud Shafique                                                 CSC 156
* Date: February 25th, 2016                                            Lab 3   
*************************************************************************
* Statement: Count the number of occurrences of a character in a string
* Specifications:
* Input  - search string
* Output - the string
*        - the number of characters
*        - the count of each vowel
************************************************************************/

// java class for Panel I/O
import javax.swing.JOptionPane;

// declaration of the class
public class Vowel3
{
   

    // declaration of main program
    public static void main(String[] args)
    {
	 int a_count, e_count, i_count, o_count, u_count;
	 
	

	// objects used to store data

        // 1. display a descriptive message
	String display_message = "This program asks the user for a sentence.\n"
	    + "searches the sentence for all vowels.\n"
	    + "and displays the number of times each \n"
	    + "vowel appears in the sentence.";

	JOptionPane.showMessageDialog(null, display_message,

         "Lab 3 Description", JOptionPane.INFORMATION_MESSAGE);
	

        // 2. initialize all vowel counters to 0
	a_count = e_count = i_count = o_count = u_count = 0;


	// 3. input the character string
	String input_string = JOptionPane.showInputDialog("Enter the sentence to Search:");

	// 4. visit each String posotion
	for (int i=0; i < input_string.length(); i++)

	switch (input_string.charAt(i))
	    {
	    case 'a':
	    case 'A':
		a_count++;
	    break;
	    case 'e':
	    case 'E':
		e_count++;
	    break;
	    case 'i':
	    case 'I':
		i_count++;
	    break;
	    case 'o':
	    case'O':
		o_count++;
	    break;
	    case 'u':
	    case'U':
		u_count++;
	    break;
	    }
	
	String
	    out1 = String.format("%nThe string is: " + input_string),
	    out2 = String.format("%nThe String has " + input_string.length() + " characters"),
	    out3 = String.format("%nThere are %n" + a_count + " a's %n" + e_count +  " e's %n" + i_count + " i's %n" + o_count + " o's, and %n" + u_count + " u's");
 
	
	JOptionPane.showMessageDialog(null, out1  +  out2 + out3, "Vowel", JOptionPane.INFORMATION_MESSAGE);

    }
} 
