import java.util.Scanner;
class Sum{
    public void sum()
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Sum of the two numbers is "+a+b);
        sc.close();
    }
}public class Q1 {
    public static void main(String[] args) {
        Sum ob=new Sum();
        ob.sum();
    }    
}
