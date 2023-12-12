import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("Enter elements into the Array: ");
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements in the array in reverse order: ");
        printReverseElements(arr);
        sc.close();
    }

    public static void printReverseElements(int[] arr) {
        for (int i=arr.length-1; i>=0;i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
}