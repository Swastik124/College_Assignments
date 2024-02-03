import java.util.Scanner;
import java.lang.String;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        int count=1,i=0;
        String str =sc.next();
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                count++;
                i++;
                j--;
            }
            else{
                break ;
            }
        }
        System.out.println(count);
        if(count==((str.length()/2)-1))
        {
            System.out.println("String is a pallindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
        sc.close();
    }
}