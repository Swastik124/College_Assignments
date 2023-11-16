import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int x,count=0;
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
          if(arr[i]==x)
          {
            System.out.println("Element found at index= "+i);
          }
          else {
            count++;
          }
        }
       if(count==5)
       {
         System.out.println("Element not found");
       }
        sc.close();
    }
}
    