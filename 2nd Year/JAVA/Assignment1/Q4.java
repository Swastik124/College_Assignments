import java.util.Scanner;
import java.lang.Math;

public class Q4 {
    public static void main(String[] args) {
        int n,a=7,sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms you want in your series: ");
        n=sc.nextInt();
        for (int i = 1; i <= n ; i++)
        {
            sum+=Math.pow(a,i);
        }
        System.out.println("The result is "+sum);
    }
}
