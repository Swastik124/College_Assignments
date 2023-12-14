import java.util.Scanner;

public class Q9 {
    public static void multiplication(int a[][],int b[][],int c[][],int s)
    {
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                for(int k=0;k<s;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                
            }
        }
        System.out.println("Displaying the Multiplication: ");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
       // if(r1==c2 && r2==c1)
        //{
            int a[][]=new int[s][s];
            int b[][]=new int[s][s];
            int c[][]=new int[s][s];
            System.out.println("Enter the elements into Array a[][]: ");
            for(int i=0;i<s;i++)
            {
                for(int j=0;j<s;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the elements into Array b[][]: ");
            for(int i=0;i<s;i++)
            {
                for(int j=0;j<s;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            multiplication(a,b,c,s);
        //}
        
        
        sc.close();
    }
}
