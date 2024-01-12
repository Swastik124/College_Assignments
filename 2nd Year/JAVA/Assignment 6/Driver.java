import java.util.Scanner;

interface Calculator {
    void add();
    void sub();
    void mul();
    void div();
    
}
class DemoCalculator implements Calculator{
    Scanner sc=new Scanner(System.in);
    public void add() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition= "+(a+b));
    }
    public void sub() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
        {System.out.println("Subtraction= "+(a-b));}
        else{
            System.out.println("Subtraction= "+(b-a));
        }
    }
    public void mul() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Multiplication= "+(a*b));
    }
    public void div() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        double x=a/b;
        System.out.println("Divison= "+(x));
    }
    
}
public class Driver{
    public static void main(String[] args) {
        DemoCalculator ob=new DemoCalculator();
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the Choice=\n1: Addition\n2:Subtraction\n3:Multiplication\n4:Divison");
        int ch=p.nextInt();
        
        switch(ch)
        {
            case 1:
                System.out.println("Enter 2 Numbers= ");
                ob.add();
                break;
            case 2:
                System.out.println("Enter 2 Numbers= ");
                ob.sub();
                break;
            case 3:
                System.out.println("Enter 2 Numbers= ");
                ob.mul();
                break;
            case 4:
                System.out.println("Enter 2 Numbers= ");
                ob.div();
                break;
            default:
                System.out.println("Enter valid Input");
        }
        p.close();

    }
}
