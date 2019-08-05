import java.util.*;

class lowArrayDS{
    private long a[];

    public lowArrayDS(int size)
    {
        a = new long[size];
    }
    public void setElement(int index, long value)
    {
        a[index] = value;
    }

    public long getElement(int index)
    {
        return a[index];
    }
}

class LowArrayAppDS
{
    public static void main (String[] args)
    {
        lowArrayDS a2;
        a2 = new lowArrayDS(5);
        int n = 0;
        int i;

        a2.setElement(0, 78);
        a2.setElement(1, 85);
        a2.setElement(2, 54);
        a2.setElement(3, 84);
        a2.setElement(4, 76);
        n=5;

        for (i=0;i<n;i++)
            System.out.println(a2.getElement(i)+ " ");
        System.out.println(" ");


        //search
        int search = 84;
        for (i=0;i<n;i++)
            if (a2.getElement(i) == search)
            break;
        if (i == n)
            System.out.println("couldn't find " + search);
        else
            System.out.println("found " + search + " at index " + i);
        
        //delete
        search = 84;
        for (i=0;i<n;i++)
        if (a2.getElement(i) == 85)
            break;
        for (int j = i; j<n-1; j++)
            a2.setElement(j, a2.getElement(j+1) );
        n--;

        for (i=0;i<n;i++)
            System.out.println(a2.getElement(i)+ " ");
        //System.out.println(" ");
        
    }
}