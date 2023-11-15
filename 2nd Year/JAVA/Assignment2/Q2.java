import java.util.Scanner;

public class Q2 {
    public static void main(String[] args)
    {
        Scanner o=new Scanner(System.in);
        int x,s,y;
        System.out.println("Enter the size of Array: ");
        s=o.nextInt();
        int a[]=new int[s];
        System.out.println("Enter elements into the Array: ");
        for(int i=0;i<a.length;i++){
            a[i]=o.nextInt();
        }
        for(int i=0,j=1;i<a.length;j++)
        {
            if(a[i]>a[j])
            {
                x=a[j];
                a[j]=a[i];
                a[i]=x;
                i++;
            }
        }
        o.close();
    }
        
}