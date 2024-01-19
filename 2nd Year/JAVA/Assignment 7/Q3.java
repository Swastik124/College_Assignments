import java.util.Scanner;
class SILICON{
    int a[]=new int[7];
    Scanner sc=new Scanner(System.in);
    SILICON(){
        System.out.println("Enter 7 values into the Array");
        for(int i=0;i<7;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void DisplayArray(){
        try{
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        SILICON obj=new SILICON();
        obj.DisplayArray();
    }
    
}
