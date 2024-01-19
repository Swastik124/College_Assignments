import java.util.Scanner;
class SILICON{
    void Calculator()
    {
        try{
            Scanner sc = new Scanner(System.in);
            int x,y,z=0;
            System.out.println("Enter the first number:");
            x=sc.nextInt();
            System.out.println("Enter the second number:");
            y=sc.nextInt();
            System.out.println("Division of both ="+(x/y));
            try{
                System.out.println("Division= "+(x/z));
            }
            catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            sc.close();
        }
        catch(ArithmeticException q){
            System.out.println("Error! Division by zero is not allowed.");
        }
        
       
    }
}
public class Q5{
    public static void main(String[] args) {
        SILICON obj=new SILICON();
        obj.Calculator();
    }
}