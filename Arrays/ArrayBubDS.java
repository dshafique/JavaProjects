import java.util.*;
import java.util.Random;

class ArrayBubDs
{
    private int a[];
    private int n;

    public ArrayBubDs (int max)
    {
        a = new int[max];
        n=0;
    }

    public void insert ()
    {
        Random rand = new Random();
        int bound = 500;
        /* Scanner myObj = new Scanner(System.in);
        System.out.println("pick the random range: ");

        bound = myObj.nextInt();
        System.out.println("you chose: " + bound); */
        int randomNum = rand.nextInt(bound);
        a[n] = randomNum;
        n++;
    }

    public void display()
    {
        for (int i=0;i<n;i++)
            System.out.println(a[i] + " ");
        System.out.println(" ");
    }

    public void swap(int A, int B)
    {
        int c = a[A];
        a[A] = a[B];
        a[B] = c;
    }
    public void bubbleSort()
    {
        for (int i=n-1;i>1;i--)
            for (int j=0;j<i;j++)
                if (a[j] > a[j+1])
                    swap(j, j+1);

    }

    public void selectSort()
    {
        int i, j, min;
        for (i=0;i<n-1;i++)
        {
            min = i;
            for (j=i+1;j<n;j++)
            if(a[j]<a[min])
                min = j;
            swap(i,min);
        }
    }

    /* public static int randomFill(){
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    } */
}

class ArrayBubDsApp
{
    public static void main (String args[])
    {
        int maxSize = 50;
        ArrayBubDs a7;
        a7 = new ArrayBubDs(maxSize);
        //int rnd = Random();
         for (int i=0;i<maxSize;i++)
            a7.insert();
            
            
            

        a7.display();
        a7.selectSort();
        //a7.bubbleSort();

        a7.display();
    } 
}