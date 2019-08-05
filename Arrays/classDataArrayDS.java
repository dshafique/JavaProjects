import java.util.*;


class Person
{
    private String fName;
    private String lName;
    private int age;

    public Person(String last, String first, int a)
    {
        lName = last;
        fName = first;
        age = a;
    }
    
    public void displayPerson ()
    {
        System.out.println("Last Name: " + lName);
        System.out.println(", First Name: " + fName);
        System.out.println(", Age: " + age);
    }
    public String getLast()
    {
        return lName;
    }

    public String getFirst()
    {
        return fName;
    }

    public int getAge()
    {
        return age;
    }

}

class classDataArrayDS
{
    private Person a[];
    private int n;

    public classDataArrayDS(int max)
    {
        a = new Person[max];
        n = 0;
    }

    public Person find(String search)
    {
        int i;
        for (i=0;i<n;i++)
        if(a[i].getLast().equals(search))
        break;
        if (i == n)
            return null;
        else
            return a[i];
    }

    public void insert(String last, String first, int age)
    {
        a[n] = new Person(last, first, age);
        n++;
    }

    public boolean delete(String search)
    {
        int i;
        for(i=0;i<n;i++)
        if (a[i].getLast().equals(search))
            break;
        if (i ==n)
            return false;
        else
            {
                for (int j =i;j<n-1;j++)
                    a[j] = a[j+1];
                n--;
                return true;
            }
    }
    public void displayArray()
    {
        for (int i=0;i<n;i++)
            a[i].displayPerson();
    }   

}

class classDataArrayDSApp
{
    public static void main(String[] args)
    {
    int maxSize = 10;
    classDataArrayDS a5;
    a5 = new classDataArrayDS(maxSize);


    a5.insert("Evans", "Patty", 24); 
    a5.insert("Smith", "Lorraine", 37); 
    a5.insert("Yee", "Tom", 43); 
    a5.insert("Adams", "Henry", 63); 
    a5.insert("Hashimoto", "Sato", 21); 
    a5.insert("Stimson", "Henry", 29); 
    a5.insert("Velasquez", "Jose", 72); 
    a5.insert("Lamarque", "Henry", 54); 
    a5.insert("Vang", "Minh", 22); 
    a5.insert("Creswell", "Lucinda", 18);

    a5.displayArray();

    String search = "Yee";
    Person found;
    found=a5.find(search);
    if(found != null)
        {
            System.out.println("found ");
            found.displayPerson();
        }
    else
        System.out.println("can't find " + search);
    
        System.out.println("deleting Hashimoto");

        a5.delete("Hashimoto");

        a5.displayArray();
    }

}