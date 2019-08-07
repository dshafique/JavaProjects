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