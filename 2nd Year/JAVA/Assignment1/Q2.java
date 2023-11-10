import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size= ");
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++)
        {
            sum+=(i*i);
        }
        System.out.println("The sum of Squares= "+sum);
    }
}
