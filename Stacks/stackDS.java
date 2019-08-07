class stackDSApp
{
    public static void main (String args[])
    {
        stackDS stack = new stackDS(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);
        stack.push(100);

        while (!stack.isEmpty())
        {
            int value = stack.pop();
            System.out.println(value);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}