import java.util.Scanner;

class child extends Thread{
    int a,b;
    child(int m,int n)
    {
        
        this.a=m;
        this.b=n;
    }
    public void run()
    {
        System.out.println("Even Numbers: ");
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m");
        int m=sc.nextInt();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        child c=new child(m,n);
        c.start();
        System.out.println("Odd Numbers: ");
        for(int i=m;i<=n;i++)
        {
            if(i%2!=0)                {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
