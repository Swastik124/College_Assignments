import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[][]=new int[s][s];
        System.out.println("Enter the elements into the Array: ");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Displaying the Array elements: ");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
    
}
