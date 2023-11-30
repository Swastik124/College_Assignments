
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int s;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE= ");
        s=sc.nextInt();
        int a[]=new int[s];
        int b[]=new int[s];
        System.out.println("Enter the elements into the Array= ");
        for (int i = 0; i < s ; i++) {
            a[i]=sc.nextInt();
        }
        for(int j=0,l=0;j<s-1;j++)
        {
            for(int k=1;k<s;k++)
            {
                if(a[k]==a[j])
                {
                    b[l]=k;
                    l++;
                }
            }
        }
        System.out.println("After removing the duplicate's array is= ");
        for(int i=0,k=0;i<s;i++){
            if(i==b[k])
            {
                System.out.print("");
            }
            else{
                System.out.print(a[i]);
            }
        }
        sc.close();
    }
}

