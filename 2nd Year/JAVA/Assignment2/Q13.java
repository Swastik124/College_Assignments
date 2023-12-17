import java.util.Scanner;

public class Q13 {
    public static void Sumofrows(int a[][],int sum_r,int s)
    {
        System.out.println("Sum of each row in a matrix: ");
        for (int i=0,k=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                sum_r+=a[j][i];
            }
            System.out.println("Row "+(++k)+": "+sum_r+"");
            sum_r=0;
        }
    }
    public static void Sumofcolumns(int a[][],int s,int sum_c)
    {
        System.out.println("Sum of each column in a matrix: ");
        for(int m=0,l=0;m<s;m++)
        {
            for(int j=0;j<s;j++)
            {
                sum_c+=a[m][j];
            }
            System.out.println("Column "+(++l)+": "+sum_c+"");
            sum_c=0;
        }
    }
    public static void main(String[] args) {
        int sum_r=0,sum_c=0;
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
        for(int j=0;j<s;j++)
        {
            for(int i=0;i<s;i++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        Sumofrows(a,sum_c,s);
        Sumofcolumns(a,s,sum_r);
        sc.close();
        }
    }