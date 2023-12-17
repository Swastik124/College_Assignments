import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        int f_odd=0,f_even=0;
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
        System.out.println("Frequency of each odd and even element: ");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                if((a[i][j]%2==0))
                {
                    f_even++;
                }
                else if((a[i][j]%2!=0))
                {
                    f_odd++;
                }
            }
        }
        System.out.println("Number of Even Elements in the Matrix is : "+f_even);
        System.out.println("Number of Odd Elements in the Matrix is : "+f_odd);
        sc.close();

    }
}
