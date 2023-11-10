import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        int n,sum=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of terms you want in your series:");
        n=s.nextInt();
        for (int i = 1; i<=n ; i++)
        {
            sum*=i;
        }
        System.out.println("The factorial of "+n+" is: "+sum);
    }
}
