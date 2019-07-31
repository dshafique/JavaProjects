class BankAccount2
{
    private double balance;
    private double Zkt;
    private double Sdq;
    private double Txs;
    private double Svng;

    public BankAccount2 (double openingBalance)
    {
        balance = openingBalance;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void transfer(double amount)
    {
        balance = balance - amount;
    }

    public void withdrawl(double amount)
    {
        balance = balance - amount;
    }

    public void zakaat(double balance)
    {
        
        Zkt = balance * 0.02;
        System.out.println("You owe $" + Zkt + "in zakaat this year");
    }

    public void sadqa(double balance)
    {
        Sdq = balance * 0.05;
        System.out.println("$"+Sdq + " is how much Sadqa I would reccomend to give");
    }

    public void taxes(double balance)
    {
        Txs = balance * 0.24;
        System.out.println("$"+Txs + " is how much you owe in Taxes");
    }

    public void savings(double balance)
    {
        Svng = balance * 0.1;
        System.out.println("$"+Svng + " is how much you much you need to save");
    }

    public void display()
    {
        System.out.println("balance = " + balance);
    }
    
}

class BankFunctions
{
    public static void main(String[] args)
    {
        BankAccount2 b1 = new BankAccount2(1284.21);

        System.out.println("Initial Balance: ");
        b1.display();
        b1.deposit(1423.20);
        b1.transfer(700.00);
        b1.withdrawl(125.30);

        System.out.println("Remaining Balance: ");
        b1.display();




    }
        
    
}