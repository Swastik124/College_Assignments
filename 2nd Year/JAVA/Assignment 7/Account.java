import java.util.Scanner;
class MinimumBalanceException extends Exception{
    public MinimumBalanceException(String s)
    {
        super(s);
    }
}
public class Account {
    static Scanner sc=new Scanner(System.in);
    String name;
    int accNumber;
    double accBalance=0;
    int amt=0;
    void deposit(int amt){
        System.out.println("Enter the Amount you want to Deposit");
        amt=sc.nextInt();
        this.accBalance+=amt;
    }
    double withdraw(int amt){
        if(this.accBalance<500)
        {
            try{
                throw new MinimumBalanceException("Money is Less than 500");
            }
            catch(MinimumBalanceException e)
            {
                System.out.println("Deposit an amount of 500 or greater than 500");
            }
        }
        else{
            accBalance=accBalance-amt;
        }
        return amt;

    }
    public static void main(String[] args) {
        Account a=new Account();
        while(true)
        {
            System.out.println("Select the following operations=\n1: Deposit\n2: Withdraw");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter your Name: ");
                    a.name=sc.next();
                    System.out.print("Account Number : ");
                    a.accNumber = sc.nextInt();
                    a.deposit(a.amt);
                    break;
                case 2:
                    a.withdraw(a.amt);
                    break;
                default:
                    System.out.println("Invalid Credentials");
                    break;
            }
        }
        

    }
}