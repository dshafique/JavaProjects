// Daoud Amjed Shafique March 31st, 2016
import java.util.Scanner;

/*
Write a java program that will read user input from the 
standard input terminal. This program should read ten 
integers, determine the sum of the ten integers, display the
sum of the ten integers and determine whether or not their 
sum is an even number. If their sum is even then state so, 
otherwise state that the sum is odd.
*/

// declaration of the class
public class EvenSum
{
    // declaration of main program
    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	int x;
	int number = 0;
	int integer = 0;
	int sum = 0;
	int i;
	System.out.println ("please enter a number");
	for (i = 0; i < 10; i++)
	    {
       	number = console.nextInt();
	if (number < integer)
	    integer = number;
	sum = sum + number;
	    }
	System.out.println( sum );
	if (sum%2 == 0)
	    System.out.println ("it's even");
	else
	    System.out.println ("it's odd");
    

		// object used for keyborad I/O
		

		// objects used to store data
		
		
        // prompt the user for input values
		
		
        //loop to read the ten integers	
       
       
        //display the sum 
       
        	
        //determine if the sum is even or odd and display results	
		
		
    } // end of main
    
} // end of the class 
