import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int x,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values into array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        x=sc.nextInt();
        for(int i=0;i<5;i++)
        {
          if(a[i]==x)
          {
            System.out.println("Element found at index= "+i);
          }
          else {
            count++;
          }
        }
       if(count==4)
       {
         System.out.println("Element not found");
       }
        sc.close();
    }
}
