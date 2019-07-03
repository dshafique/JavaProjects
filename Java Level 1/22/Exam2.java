// java class for keyboard I/O
import java.util.Scanner;


// declaration of the class
public class Exam2
{
	public static final String OPTION1 = "(1) EXPANDED SUM";
	public static final String OPTION2 = "(2) REVERSE EXPANDED SUM";
	public static final String OPTION3 = "(3) REVERSE INTEGER";
	public static final String OPTION4 = "(4) PRODUCT TABLE";
	public static final String OPTION5 = "(5) EXIT";

	// declaration of main program
    public static void main(String[] args)
    {
    	Scanner console = new Scanner(System.in);
    	int option;
	int reverse;
    	int number;
	String sumStr = "";
	int sum = 0;
	int i,j;
    
    
    	do
    	{
    		System.out.println("Choose from the following options.\n");
    		printMenuOptions();
    		option = console.nextInt();
    		
    		//selection structure
    		switch(option)
    		{
    			//expanded sum
    			case 1:
    				System.out.print("Enter a positive integer.\n");	
    				number = console.nextInt();
    			    
				for(i = 1; i <= number; i++)
			      	{
				    if(i == 1)
				    {
					sumStr = sumStr + i;
				    }
				    else 
				    {
					sumStr = sumStr + "+" + i;
				    }

				    sum = sum + i;
			       	}
				System.out.print(sumStr + "=" + sum);
    				//printSum(number, false);
    				break;
    			
    			//reverse expanded sum
    			case 2:	
			    System.out.print("Enter a positive integer.\n");	
    				number = console.nextInt();
    				
				sumStr = "";
				sum =0; 
				for(i = number; i >= 1; i--)
			      	{
				    if(i == number)
				    {
					sumStr = sumStr + i;
				    }
				    else 
				    {
					sumStr = sumStr + "+" + i;
				    }

				    sum = sum + i;
			       	}
				System.out.print(sumStr + "=" + sum);
    			
    				break;
    			
    			//reverse int	
    			case 3:
			    reverse = 0;
			    number = 0;
			    System.out.println ("Enter the number to reverse");
			    number = console.nextInt();
			    while (number!= 0)
				{
				    reverse = (reverse*10)+ (number%10);
				    number = number/10;
				}
			    System.out.println ("reverse is: " + reverse);
    				
    				break;
    			
    			//product table	
    			case 4:
    				System.out.print("Enter a positive integer.\n");	
    				number = console.nextInt();
    				printProductTable(number);
				System.out.println ("\n");
				for (i =1; i<= number; i++)
				    {
					System.out.print("\n" +  i + "| ");
					for (j=1; j <= number; j++)
					    {
						System.out.print(i*j + " ");
					    }
					System.out.println();
				    }
					 
    				
    				break;	
    	
    		}
    		System.out.println("\n");
    		
    	}while(option != 5);
    	
    } // end of main

	public static void printMenuOptions()
	{
		System.out.print("\n" + OPTION1 + "\n" + OPTION2 + "\n" 
		 + OPTION3 + "\n" + OPTION4 + "\n" + OPTION5 + "\n\n");
	}
		
	public static void printProductTable(int n)
	{
		int i;
		char ch = 'A';
		
		for(i = 1; i <= n; i++)
		{
			System.out.print(ch + "  ");
			ch++;  //ch = ch + 1;
		}	
		
		System.out.println();
		
		for(i = 1; i < n; i++)
		{
			System.out.print("___");	
		}
			
		System.out.print("_");	
	}	
		
	public static void printSum(int n, boolean reverse)
	{
		int i;
	}
	
		
	public static int sum(int n)
	{
		int sum = 0;
		
		
		
		
		return sum;
		
	}
	
	
	public static int reverseInt(int n)
	{
		int num = 0;
		
		
		
		return num;
	
	}
	
	
		
    

} // end of the class 
