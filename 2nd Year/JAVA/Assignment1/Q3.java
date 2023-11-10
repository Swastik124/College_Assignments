import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int n,p,j=1;
        double sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size= ");
        n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            sum=sum+(i/(i+j));
            j++;
        }
        System.out.println("The sum is "+sum);
    }
}