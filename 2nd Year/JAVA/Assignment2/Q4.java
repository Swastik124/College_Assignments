import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int s,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE= ");
        s=sc.nextInt();
        int a[]=new int[s];
        int b[]=new int[s];
        System.out.println("Enter the array elements= ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                if(a[j]==a[i])
                {
                    count++;
                }
            }
            b[i]=count;
            count=0;
        }
        System.out.println("Displaying the frequency of each elements= ");
        for(int i=0;i<b.length;i++)
        {
            System.out.println("The frequency of "+a[i]+" is "+b[i]);
        }
        sc.close();
    }
}
