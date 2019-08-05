import java.util.*;

class ArrayDS {

    public static void main(String[] args)
    {
        int a1[] = new int [100];
        int n; //counter
        int search;
        int length = a1.length;
        int i;
        a1[0] = 78;
        a1[1] = 62;
        a1[2] = 48;
        a1[3] = 04;
        a1[4] = 12;
        //normal loop
        n=5;
        for (i=0;i<n;i++)
            System.out.println(a1[i] + " ");
        //search loop
            search = 78;
        for(i=0;i<n;i++)
            if(a1[i] == search)
                break;
                if (i == n)
                    System.out.println("couldn't find the key for " + search);
                else
                    System.out.println("found the key for " + search + " at index " + i);
         //delete loop
        search = 12;
        for(i=0;i<n;i++)
            if(a1[i] == search)
                break;
        for (int j=i;j<n;j++)
            a1[j] = a1[j+1];
        n--;

        for (i=0;i<n;i++)
            System.out.println(a1[i] + " ");
        
                
        
        //System.out.println(" ");
    }
}