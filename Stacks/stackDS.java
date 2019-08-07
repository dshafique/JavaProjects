import java.util.*;

class stackDS
{
    private int maxSize;
    private int stack[];
    private int top;

    public stackDS(int s)
    {
        maxSize = s;
        stack  = new int[maxSize];
        top = -1;
    }

    public void push(int j)
    {
        stack[++top] = j;
    }

    public int pop()
    {
        return stack[top--];
    }

    public int peek()
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

class stackDSApp
{
    public static void main (String args[])
    {
        stackDS stack = new stackDS(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        while (!stack.isEmpty())
        {
            int value = stack.pop();
            System.out.println(value);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}