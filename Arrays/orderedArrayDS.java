import java.util.*;

class orderedArrayDS
{
    private long a[];
    private int n;

    public orderedArrayDS (int max)
    {
        a = new long[max];
        n = 0;
    }
    public int size()
    {
        return n;
    }

    public int find (long search)
    {
        int lowerBound = 0;
        int upperBound = n-1;
        int currentIndex;

        while(true)
        {
            currentIndex = (lowerBound+upperBound)/2;
            if (a[currentIndex] == search)
                return currentIndex;
            else if (lowerBound > upperBound)
                return n;
            else
            {
                if (a[currentIndex]<search)
                    lowerBound = currentIndex + 1;
                else
                    upperBound = currentIndex -1;
            }
        }

    }

    public void insert(long value)
    {
        int i;
        for (i=0;i<n;i++)
            if (a[i]> value)
            break;
        for (int j = n; j>i;j--)
            a[j] = a[j-1];
        a[i] = value;
        n++;
    }

    public boolean delete(long value)
    {
    int i = find(value);
    if(i==n)                  
       return false;
    else                           
       {
       for(int j=i; j<n-1; j++) 
          a[j] = a[j+1];
       n--;                   
       return true;
       }
    }  

    

    public void display()
    {
        for (int i = 0; i<n;i++)
            System.out.println("index " + i + " - " + a[i] + " ");
        System.out.println(" ");
    }

}

class orderedArrayAppDS
{
    public static void main(String[] args)
    {
        int maxSize = 10;
        orderedArrayDS a4;
        a4 = new orderedArrayDS(maxSize);

        a4.insert(784);
        a4.insert(598);
        a4.insert(495);
        a4.insert(828);
        a4.insert(695);
        a4.insert(852);
        a4.insert(265);
        a4.insert(783);
        a4.insert(126);
        a4.insert(261);

        int search = 695;
        if(a4.find(search) != a4.size())
            System.out.println("found " + search);
        else
            System.out.println("not found " + search);

        a4.display();

        a4.delete(261);
        a4.delete(852);
        a4.delete(828);
        
        a4.display();

    }
}