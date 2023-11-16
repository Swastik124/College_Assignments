import java.util.Scanner;

public class Q2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,s,y;
        System.out.println("Enter the size of Array: ");
        s=sc.nextInt();
        int a[]=new int[s];
        System.out.println("Enter elements into the Array: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            if(a[i]<a[i+1])
            {
                x=a[i];
                a[i]=a[i+1];
                a[i+1]=x;
            }
        }
        sc.close();
    }
        
}