import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class stackDSReverse
{
    private int maxSize;
    private char stack[];
    private int top;

    public stackDSReverse(int s)
    {
        maxSize = s;
        stack  = new char[maxSize];
        top = -1;
    }

    public void push(char j)
    {
        stack[++top] = j;
    }

    public char pop()
    {
        return stack[top--];
    }

    public char peek()
    {
        return stack[top];
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == maxSize-1);
    }
    
}

class reverse
{
    private String input;
    private String output;
    
    public reverse(String in)
    {
        input = in;
    }

    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public String reverser()
    {
        int wordSize = input.length();
        stackDSReverse stack = new stackDSReverse(wordSize);

        for (int i=0;i<wordSize;i++)
        {
            char c = input.charAt(i);
            stack.push(c);
        }

        output = "";

        while (!stack.isEmpty())
        {
            char c = stack.pop();
            output = output +c;
        }
        return output;
    }

}

class reversal
{
    public static void main (String args[]) throws IOException
    {
        String input, output;
        while(true)
        { 
            System.out.println("enter a word: ");
            System.out.flush();
            input = reverse.getString();
            if (input.equals(""))
                break;

            reverse theReverser = new reverse(input);
            output = theReverser.reverser();
            System.out.println(" reversed: " + output);

        }
    }
}