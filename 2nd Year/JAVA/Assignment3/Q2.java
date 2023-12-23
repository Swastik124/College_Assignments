import java.util.Scanner;
class ComplexNum{
    Scanner sc=new Scanner(System.in);
    int real1,imaginary1,real2,imaginary2;
    ComplexNum(int x,int y,int u,int v)
    {
        real1=x;
        imaginary1=y;
        real2=u;
        imaginary2=v;
    }
    public void displayComplexNum()
    {
        System.out.println("1st complex number:\n"+real1+"+i("+imaginary1+")");
        System.out.println("2st complex number:\n"+real2+"+i("+imaginary2+")");
    }
    public void addComplexNum()
    {
        System.out.println("The sum of complex numbers="+(real1+real2)+"+i"+"("+(imaginary1+imaginary2)+")");
    }
}
public class Q2 {
    public static void main(String[] args) {
        ComplexNum obj=new ComplexNum(5, 3,6,7);
        obj.displayComplexNum();
        obj.addComplexNum();
    }
}
