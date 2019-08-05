import java.util.*;

class highArrayDS
{
    private long a[];
    private int n;

    public highArrayDS(int max)
    {
        a = new long[max];
        n = 0;
    }

    public boolean find(long search)
    {
        int i;
        for(i=0;i<n;i++)
            if(a[i] == search)
            break;
        if (i == n)
            return false;
        else
            return true;
    }

    public boolean delete(long value)
    {
        int i;
        for (i=0;i<n;i++)
            if ( a[i] == value)
            break;
        if (i == n)
            return false;
        else
            {
                for (int j = i;j<n;j++)
                    a[j] = a[j+1];
                n--;
                return true;
            }
    }

    public void insert(long value)
    {
        a[n] = value;
        n++;
    }

    public void display()
    {
        for (int i=0;i<n;i++)
            System.out.println(a[i] + " ");
        System.out.println(" ");
    }

}

class highArrayAppDS
{
    public static void main(String[] args)
    {
        int maxSize = 100;
        highArrayDS a3;
        a3 = new highArrayDS(maxSize);

        a3.insert(77);
        a3.insert(78);
        a3.insert(84);
        a3.insert(578);
        a3.insert(987);
        a3.insert(82);
        a3.insert(46);
        a3.insert(51);
        a3.insert(985);
        a3.insert(9872);

        a3.display();

        int search = 9872;
        if (a3.find(search))
            System.out.println("found " + search);
        else
            System.out.println("nope");
        a3.delete(9872);
        a3.delete(987);

        a3.display();


    }
}